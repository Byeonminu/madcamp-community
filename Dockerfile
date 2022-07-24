FROM openjdk:11-jre-slim

WORKDIR /home/ubuntu/app

COPY /build/libs/dbtest-0.0.1-SNAPSHOT.war .

CMD java -jar dbtest-0.0.1-SNAPSHOT.war