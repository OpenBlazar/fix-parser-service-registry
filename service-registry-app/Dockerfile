FROM openjdk:13-alpine

COPY target/service-registry-app-*.jar /opt/service-registry-app.jar

CMD ["java", "-jar", "-Dspring.profiles.active=default", "/opt/service-registry-app.jar"]