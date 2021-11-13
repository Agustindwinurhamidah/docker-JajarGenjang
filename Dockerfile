FROM openjdk:8-jdk-alpine
MAINTAINER agustindwinurhamidah <1931710076@student.polinema.ac.id>
RUN mkdir -p /java
WORKDIR /java

COPY kubus.java /java

#compile file java
RUN javac kubus.java

#running java
ENTRYPOINT java kubus