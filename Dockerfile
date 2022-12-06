FROM openjdk:17
COPY target/first-spring-demo-0.0.1-SNAPSHOT.jar myapplication.jar
ENTRYPOINT ["java", "-jar","myapplication.jar"]
EXPOSE 8080