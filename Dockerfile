FROM maven:3.3-jdk-8
MAINTAINER anurag.wadhwa7@gmail.com

WORKDIR /code
COPY . /code/
RUN mvn clean compile package
CMD java -jar /code/target/servers-1.0-SNAPSHOT.jar