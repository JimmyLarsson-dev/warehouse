FROM eclipse-temurin:25

# Set the working directory in the container
WORKDIR /app

# Copy the application's JAR file into the container
COPY target/inventory-0.0.1-SNAPSHOT.jar inventory-application.jar

# Expose the port on which the Spring Boot application runs
EXPOSE 8080

# Set environment variables for the database configuration (can be overridden at runtime)
#ENV SPRING_DATASOURCE_URL=jdbc:postgresql://localhost:5432/inventory
#ENV SPRING_DATASOURCE_USERNAME=postgres
#ENV SPRING_DATASOURCE_PASSWORD=cup11mouse

# Run the application
ENTRYPOINT ["java", "-jar", "inventory-application.jar"]
