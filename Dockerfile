FROM openjdk
FROM openjdk:8
EXPOSE 9000
ADD target/dockerimage.jar dockerimage.jar
ENTRYPOINT ["java","-jar","dockerimage.jar"]