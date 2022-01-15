FROM openjdk:8
EXPOSE 9090
ADD target/kubedemo.jar kubedemo.jar
ENTRYPOINT ["java","-jar","kubedemo.jar"]