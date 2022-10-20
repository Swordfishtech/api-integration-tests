FROM maven:3.8.1-openjdk-17-slim AS builder
WORKDIR /app
COPY app .
RUN mvn -e -B dependency:resolve
RUN mvn clean -e -B package

FROM openjdk:17
WORKDIR /app
COPY --from=builder /app/target/api-integration-tests-1.0-SNAPSHOT-fat-tests.jar /app/api-integration-tests.jar
COPY --from=builder /app/suites /app/suites
ENV TEST_SUITE=testng.xml

# CMD java -jar api-integration-tests.jar ${TEST_SUITE}