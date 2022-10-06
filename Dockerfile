# Maven
FROM maven:3.8.1-openjdk-17-slim
COPY app/src /home/app/src
COPY app/pom.xml /home/app
COPY app/suites /home/app/suites
WORKDIR /home/app
ENV TEST_SUITE=/home/app/suites/testng.xml

CMD mvn clean test -Dtest-suite=${TEST_SUITE}