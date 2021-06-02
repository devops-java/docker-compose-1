FROM tomcat:8.5.66-jdk8-corretto

LABEL maintainer="rabindrapatra825@gmail.com"

ADD app.war /usr/local/tomcat/webapps/

EXPOSE 8080 8000

CMD ["catalina.sh", "jpda" "run"]