FROM openjdk:17-jdk-alpine
VOLUME /tmp
COPY target/firstprojetcrud-0.0.1.jar firstprojetcrud-0.0.1.jar

CMD ["java", "-jar", "/firstprojetcrud-0.0.1.jar"]