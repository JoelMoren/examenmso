FROM 'openjdk:8u151-jre-slim'
MAINTAINER jjoerkk
USER root

# Set TimeZone
ENV TZ=America/Mexico_City


# Copies everything over to Docker environment
ARG JAR_FILE=target/front-0.0.1-SNAPSHOT.war
ADD ${JAR_FILE} //
RUN ln -snf /usr/share/zoneinfo/$TZ /etc/localtime && echo $TZ > /etc/timezone

# Uses port which is used by the actual application
EXPOSE 81

# Set ENTRYPOINT
ENTRYPOINT ["java", "-jar", "-Dspring.profiles.active=devlocal", "front-0.0.1-SNAPSHOT.war", "--server.port=81"]
