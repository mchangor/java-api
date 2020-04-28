FROM openjdk:8
ADD target/api-0.0.1-SNAPSHOT.jar tryapi.jar
EXPOSE 5000
ENTRYPOINT ["java", "-jar", "tryapi.jar"]