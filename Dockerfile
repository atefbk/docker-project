FROM openjdk:8-jdk-alpine
VOLUME /tmp
ADD target/app-docker-0.0.1-SNAPSHOT.jar /app2.jar
CMD ["java", "-jar", "/app2.jar", "--spring.profiles.active=prod"]
EXPOSE 8080
