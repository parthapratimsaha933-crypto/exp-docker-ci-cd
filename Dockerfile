FROM openjdk:28-ea-jdk

WORKDIR /app

COPY target/exp-docker.jar exp-docker.jar

EXPOSE 8081

ENTRYPOINT ["java","-jar","exp-docker.jar"]