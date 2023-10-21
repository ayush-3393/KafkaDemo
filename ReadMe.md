# Steps:
## Step 1: Start Zookeeper Server
1. Open terminal (terminal 1).
2. Run command:
```shell
$ bin/zookeeper-server-start.sh config/zookeeper.properties
```
**Note:** Zookeeper runs on default port : **2181**

## Step 2: Start Kafka Server
1. Open terminal (terminal 2).
2. Run command:
```shell
$ bin/kafka-server-start.sh config/server.properties
```
**Note:** Kafka runs on default port : **9092**

## To create topic and produce and consume the events on CLI:
### Creating a topic:
Open new terminal (terminal 3)
```shell
$ bin/kafka-topics.sh --create --topic {topic-name} --bootstrap-server localhost:9092
```
### Writing some events on publisher side:
Open new terminal (terminal 4)
```shell
$ bin/kafka-console-producer.sh --topic {topic-name} --bootstrap-server localhost:9092
```
### Reading events on consumer side:
Open new terminal (terminal 5)
```shell
$ bin/kafka-console-producer.sh --topic {topic-name} --bootstrap-server localhost:9092
```