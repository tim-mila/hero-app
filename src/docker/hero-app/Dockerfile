FROM openjdk:8-jre

EXPOSE 8080

VOLUME /tmp
ADD hero-app-0.0.1-SNAPSHOT.jar hero-app.jar

RUN sh -c 'touch /hero-app.jar'
ENV JAVA_OPTS=""

ENTRYPOINT ["java","-DjvmArguments=-Xms1024m -Xmx2048m","-jar","/hero-app.jar"]
