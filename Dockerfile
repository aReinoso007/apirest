FROM tomcat:jdk8
VOLUME /tmp
COPY target/apirest-0.0.1-SNAPSHOT.war /usr/local/tomcat/webapps/apirest-0.0.1-SNAPSHOT.war
EXPOSE 8082
ENTRYPOINT [ "sh", "-c", "java -Dspring.profiles.active=docker -Djava.security.egd=file:/dev/./urandom -jar /usr/local/tomcat/webapps/apirest-0.0.1-SNAPSHOT.war" ]