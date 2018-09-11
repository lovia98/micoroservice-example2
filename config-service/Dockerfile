FROM frolvlad/alpine-oraclejdk8
VOLUME /tmp
ADD target/config-service-0.0.1-SNAPSHOT.jar config-service.jar
EXPOSE 8888
ENTRYPOINT ["java","-jar","/config-service.jar"," &"]
