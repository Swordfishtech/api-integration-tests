package com.exos;

import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.azure.messaging.servicebus.*;
import org.testng.Assert;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

public class ServiceBus {

    private String correlationId;
    private static ServiceBusReceiverClient RECEIVER;

    static {
        createConnection();
    }

    private static void createConnection() {

        RECEIVER = new ServiceBusClientBuilder()
                .connectionString(Properties.AZURE_SERVICE_BUS_CONN)
                .receiver()
                .queueName(Properties.AZURE_SERVICE_BUS_QUEUE_NAME)
                .disableAutoComplete()
                .buildClient();

        BaseTest.getTestReporter().info( "Subscribed to Service Bus Queue " + Properties.AZURE_SERVICE_BUS_QUEUE_NAME);
    }

    public String searchForMessageByCorrelationId(String correlationId) {

        AtomicBoolean foundMsg = new AtomicBoolean(false);
        int counter = 1;

        System.out.println("Looking for a message with the correlation_id: " + correlationId + "\n");

        // Try to receive a set of messages from Service Bus 8 times. A batch of messages is returned when 5 messages
        // are received, or the operation timeout has elapsed, whichever occurs first.
        while (counter < 9 && foundMsg.get() == false) {

            System.out.println("Attempt :" + counter);

            RECEIVER.receiveMessages(5, Duration.ofSeconds(3)).stream().forEach(message -> {

                BaseTest.getTestReporter().info(MarkupHelper.createCodeBlock(String.format("Sequence #: %s. Contents: %s%n", message.getSequenceNumber(), message.getBody())));
                System.out.printf("Sequence #: %s. Contents: %s%n", message.getSequenceNumber(), message.getBody());

                if (message.getBody().toString().contains(correlationId)) {
                    foundMsg.getAndSet(true);
                    System.out.println("Found message");
                    ServiceBusMessages.add(correlationId, message.getBody().toString());
                }
            });

            try {
                // wait 3 seconds before the next pass
                TimeUnit.SECONDS.sleep(3);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            counter++;
        }

        // Close the receiver.
        RECEIVER.close();

        if (foundMsg.get() == false) {
            Assert.fail(String.format("Could not find event with correlation id %s on the Service Bus queue", correlationId));
        }

        return ServiceBusMessages.get(correlationId);
    }
}