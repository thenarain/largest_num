# Use OpenJDK as the base image
FROM openjdk:17-slim

# Set the working directory in the container
WORKDIR /app

# Copy the Java source file into the container
COPY largest_num.java .

# Compile the Java program
RUN javac largest_num.java

# Run the Java program
CMD ["java", "largest_num"]
