#base image
FROM openjdk:17

EXPOSE 8080

RUN mkdir "/app"

COPY ./target/hello-spring-docker-0.0.1-SNAPSHOT.jar app/hello-spring-docker-0.0.1-SNAPSHOT.jar

WORKDIR /app

ENTRYPOINT ["java","-jar","hello-spring-docker-0.0.1-SNAPSHOT.jar"]

