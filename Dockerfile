FROM openjdk:8u212-jdk-slim

# Maintainer Info
LABEL maintainer="charu.singla@nagarro.com"

VOLUME /tmp

# The application's jar file (when packaged)
ARG JAR_FILE=target/OrdersService-0.0.1-SNAPSHOT.jar

# Add the application's jar to the container
ADD ${JAR_FILE} OrdersService-0.0.1-SNAPSHOT.jar

# Run the jar file 
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/OrdersService-0.0.1-SNAPSHOT.jar"]

EXPOSE 8002