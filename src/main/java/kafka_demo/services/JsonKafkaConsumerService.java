package kafka_demo.services;

import kafka_demo.constants.AppConstants;
import kafka_demo.dtos.UserDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class JsonKafkaConsumerService {
    private static final Logger LOGGER = LoggerFactory.getLogger(JsonKafkaConsumerService.class);

    @KafkaListener(topics = AppConstants.KAFKA_TEST_TOPIC_NAME, groupId = AppConstants.KAFKA_TEST_GROUP_NAME)
    public void consumeMessage(UserDto userDto){
        String loggerInfo = "Json Message Received : " + userDto.toString();
        LOGGER.info(loggerInfo);
    }
}
