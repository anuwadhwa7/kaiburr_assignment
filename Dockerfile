FROM maven:3.3-jdk-8
MAINTAINER anurag.wadhwa7@gmail.com

WORKDIR /code
COPY . /code/
RUN mkdir /app
RUN mvn clean compile package
RUN mv /code/target/servers-1.0-SNAPSHOT.jar /app/kaiburr-app-server.jar
WORKDIR /app
RUN rm -rf /code
CMD java -jar kaiburr-app-server.jar
