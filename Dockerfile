FROM openjdk:17-jdk-alpine
VOLUME /tmp
COPY target/firstprojetcrud-1.0.0.jar firstprojetcrud-1.0.0.jar

CMD ["java", "-jar", "/firstprojetcrud-1.0.0.jar"]