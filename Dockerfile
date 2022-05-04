FROM gradle:4.10-jdk8-alpine
RUN gradle build

COPY /build/libs/GoGato-0.0.1-SNAPSHOT.jar ./app.jar

EXPOSE 8081

ENTRYPOINT ["java", "-jar", "app.jar"]