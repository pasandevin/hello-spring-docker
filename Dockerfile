#base image
FROM openjdk:17

EXPOSE 8080

RUN mkdir "/app"

COPY ./out/artifacts/hello_spring_docker_jar/hello-spring-docker.jar app/hello-spring-docker.jar

WORKDIR /app

ENTRYPOINT ["java","-jar","hello-spring-docker.jar"]

