FROM tomcat:latest
ADD /gen-war/.* /usr/local/tomcat/webapps/
