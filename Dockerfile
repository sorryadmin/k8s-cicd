FROM openjdk:11.0-jdk
WORKDIR /usr/local/k8s/
COPY k8s.jar /usr/local/k8s/
EXPOSE 80
ENTRYPOINT [ "nohup","java","-jar","k8s.jar","&" ]
