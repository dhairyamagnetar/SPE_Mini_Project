# Use the official Maven image to build the application
FROM maven:3.9.0

# Set the working directory
WORKDIR /app

# Copy the pom.xml and the source code
COPY pom.xml .
COPY src ./src

# Package the application (this will also run tests)
RUN mvn clean package -DskipTests

# Command to run the application
ENTRYPOINT ["java", "-jar", "target/demo-1.0.0.jar"]