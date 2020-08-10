FROM openjdk:8-jdk-alpine
MAINTAINER wangpeng wangpeng@jtmet.com

COPY target/docker-demo-0.0.1-SNAPSHOT.jar /opt/docker-demo.jar

ENTRYPOINT ["java", "-jar", "/opt/docker-demo.jar"]
# 对外端口

EXPOSE 22222

