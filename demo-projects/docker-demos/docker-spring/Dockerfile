FROM alpine:latest
RUN apk update && apk add openjdk17
RUN mkdir -p /home/app
WORKDIR /home/app
ARG JAR_FILE=target/*.jar
RUN ls
RUN echo ${JAR_FILE}
COPY ${JAR_FILE} app.jar
ENTRYPOINT [ "java","-jar","app.jar" ]