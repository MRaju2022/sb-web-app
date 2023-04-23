FROM java:8-jdk-alpine

COPY ./target/sb-web-app.jar /usr/app/

WORKDIR /usr/app

ENTRYPOINT ["java","-jar","sb-web-app.jar"]