# Usa una imagen base de OpenJDK
FROM openjdk:17-jdk-slim

# Copia el JAR de tu aplicación a la imagen
COPY target/RegistroPersona-0.0.1-SNAPSHOT.jar /app.jar

# Expone el puerto que usa la aplicación
EXPOSE 8084

# Comando para ejecutar la aplicación
ENTRYPOINT ["java", "-jar", "/app.jar"]
