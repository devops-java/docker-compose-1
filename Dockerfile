FROM tomcat:8.0-alpine

LABEL maintainer="rabindrapatra825@gmail.com
"

ADD app.war /usr/local/tomcat/webapps/

EXPOSE 8080

CMD ["catalina.sh", "run"]