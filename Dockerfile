FROM maven:3.9.6-eclipse-temurin-22-alpine as build
COPY src /home/app/src
COPY pom.xml /home/app
RUN mvn -f /home/app/pom.xml clean package -DskipTests

FROM eclipse-temurin:22-jre-alpine
COPY --from=build /home/app/target/worthreadingservice24-0.0.1-SNAPSHOT.jar /app.jar
EXPOSE 8005
ENTRYPOINT ["java","-jar","/app.jar"]
