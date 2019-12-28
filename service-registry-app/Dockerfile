FROM openjdk:13-alpine

ARG VERSION=*

COPY target/service-registry-app-${VERSION}.jar /opt/service-registry-app.jar

CMD ["java", "-jar", "-Dspring.profiles.active=default", "/opt/service-registry-app.jar"]