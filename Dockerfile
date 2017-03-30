FROM tomcat:latest
ADD /var/lib/go-agent/pipelines/McKinsey/gen-war/SpConsole.war /usr/local/tomcat/webapps/
