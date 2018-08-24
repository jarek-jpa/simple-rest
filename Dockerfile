FROM openjdk:8-jdk-alpine

RUN apk update && apk upgrade && apk add bash

ENV APP_NAME=simple-rest
ENV SERVER_PORT=8081
ENV JAVA_OPTS=""


ADD target/simple-rest.jar /

CMD java -Dserver.port=$SERVER_PORT $JAVA_OPTS -jar /$APP_NAME.jar
