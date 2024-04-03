FROM eclipse-temurin:17
LABEL authors="lawrencejews"

WORKDIR /app

COPY target/spring-boot-restful-webservices-0.0.1-SNAPSHOT.jar /app/spring-boot-restful-webservices.jar

ENTRYPOINT ["java", "-jar", "spring-boot-restful-webservices.jar"]