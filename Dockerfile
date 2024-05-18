FROM openjdk:8
WORKDIR /tmp
COPY /target/Limitless-0.0.1-SNAPSHOT.jar ./
CMD [ "java", "-jar", "Limitless-0.0.1-SNAPSHOT.jar" ]