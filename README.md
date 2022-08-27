## Running RabbitMQ
Run RabbitMQ in Docker

`docker run -it --rm --name rabbitmq -p 5672:5672 -p 15672:15672 rabbitmq:3.10-management`
## Running Program
Step 1 : mvnw clean install -DskipTests

Step 2 : java -jar target/messaging-rabbitmq-0.0.1-SNAPSHOT.jar --spring.profiles.active=sender

Step 3 : java -jar target/messaging-rabbitmq-0.0.1-SNAPSHOT.jar --spring.profiles.active=receiver
