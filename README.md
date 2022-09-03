## Running RabbitMQ
Run RabbitMQ in Docker

`docker run -it --rm --name rabbitmq -p 5672:5672 -p 15672:15672 rabbitmq:3.10-management`
## Compiling and Building the Executable Jar
Step 1 : ```mvnw clean install -DskipTests```

## Types of Exchanges
### Direct Exchange - Simple Message Routing


Step 1 : ```java -jar target/messaging-rabbitmq-0.0.1-SNAPSHOT.jar --spring.profiles.active=sender```

Step 2 : ```java -jar target/messaging-rabbitmq-0.0.1-SNAPSHOT.jar --spring.profiles.active=receiver```

### Fanout Exchange - Broadcast Message

Step 1 : ```java -jar target/messaging-rabbitmq-0.0.1-SNAPSHOT.jar --spring.profiles.active=fanoutsender```

Step 2 : ```java -jar target/messaging-rabbitmq-0.0.1-SNAPSHOT.jar --spring.profiles.active=receiver```

### Topic Exchange - Selective routing

Step 1 : ```java -jar target/messaging-rabbitmq-0.0.1-SNAPSHOT.jar --spring.profiles.active=topicsender```

Step 2 : ```java -jar target/messaging-rabbitmq-0.0.1-SNAPSHOT.jar --spring.profiles.active=receiver```

### Headers Exchange - Selective routing using headers
### Exchange to Exchange routing
### Consistent Hashing Exchange

