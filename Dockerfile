FROM openjdk:8-jdk-alpine
MAINTAINER agustindwinurhamidah <1931710076@student.polinema.ac.id>
RUN mkdir -p /java
WORKDIR /java

COPY JajarGenjang.java /java

#compile file java
RUN javac JajarGenjang.java

#running java
ENTRYPOINT java JajarGenjang