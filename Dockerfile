FROM openjdk:8

ADD target/spoiler-ban.jar spoiler-ban.jar

EXPOSE 8084

ENTRYPOINT ["java", "-jar", "spoiler-ban.jar"]
