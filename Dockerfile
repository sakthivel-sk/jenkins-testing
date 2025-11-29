# Use the official OpenJDK 17 image (Note: official 'openjdk' repo is deprecated, but this works)
FROM eclipse-temurin:21-jdk

# Add a volume pointing to /tmp
VOLUME /tmp

# Copy the jar file
COPY target/*.jar helloapp.jar

# Run the jar file
ENTRYPOINT ["java","-jar","/helloapp.jar"]