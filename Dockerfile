FROM openjdk:21-oracle

EXPOSE 8080

COPY target/Rest-0.0.1-SNAPSHOT.jar app.jar

CMD ["java", "-jar", "app.jar"]
