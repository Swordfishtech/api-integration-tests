# Maven
FROM maven:3.8.1-openjdk-17-slim
COPY src /home/app/src
COPY pom.xml /home/app
COPY suites /home/app/suites
WORKDIR /home/app
ENV TEST_SUITE=testng.xml

CMD mvn clean test -Dtest-suite=${TEST_SUITE}