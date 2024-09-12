FROM openjdk:17
ARG JAR_FILE=build/libs/*.jar
COPY ${JAR_FILE} scratch.jar
ENTRYPOINT ["java","-jar","/scratch.jar"]
