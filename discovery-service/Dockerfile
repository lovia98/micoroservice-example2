FROM frolvlad/alpine-oraclejdk8
VOLUME /tmp
ADD target/discovery-service-0.0.1-SNAPSHOT.jar discovery-service.jar
EXPOSE 8061
ENTRYPOINT ["java","-jar","/discovery-service.jar"," &"]
