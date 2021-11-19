FROM java:8-jdk
MAINTAINER Akash Giri <akash.giri@wissen.com>

RUN apt-get update \
    && apt-get install -y git

RUN git clone https://github.com/akashgiri/BookMyMovie.git \
    && cd BookMyMovie \
    && chmod +x mvnw \
    && ./mvnw -DskipTests=true package

ADD ./target/reservations-0.0.1-SNAPSHOT.jar /root/
CMD ["java", "-jar", "/root/reservations-0.0.1-SNAPSHOT.jar"]

EXPOSE 8080
