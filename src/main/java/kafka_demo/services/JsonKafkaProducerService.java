package kafka_demo.services;

import kafka_demo.constants.AppConstants;
import kafka_demo.dtos.UserDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

@Service
public class JsonKafkaProducerService {

    private static final Logger LOGGER = LoggerFactory.getLogger(JsonKafkaProducerService.class);
    private final KafkaTemplate<String, UserDto> kafkaTemplate;

    public JsonKafkaProducerService(KafkaTemplate<String, UserDto> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendMessage(UserDto userDto){
        String loggerInfo = "Message sent : " + userDto.toString();
        LOGGER.info(loggerInfo);

        Message<UserDto> message =
                MessageBuilder
                        .withPayload(userDto)
                        .setHeader(KafkaHeaders.TOPIC, AppConstants.KAFKA_TEST_TOPIC_NAME)
                        .build();
        kafkaTemplate.send(message);
    }

}
