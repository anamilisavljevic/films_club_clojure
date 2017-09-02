FROM java:8-alpine
MAINTAINER Your Name <you@example.com>

ADD target/uberjar/films_club_clojure.jar /films_club_clojure/app.jar

EXPOSE 3000

CMD ["java", "-jar", "/films_club_clojure/app.jar"]
