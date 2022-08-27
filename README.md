Step 1 : mvnw clean install -DskipTests

Step 2 : java -jar target/messaging-rabbitmq-0.0.1-SNAPSHOT.jar --spring.profiles.active=sender

Step 3 : java -jar target/messaging-rabbitmq-0.0.1-SNAPSHOT.jar --spring.profiles.active=receiver
