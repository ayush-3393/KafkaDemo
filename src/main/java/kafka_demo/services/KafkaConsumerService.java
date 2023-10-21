package kafka_demo.services;

import kafka_demo.constants.AppConstants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

//@Service
public class KafkaConsumerService {

    private static final Logger LOGGER = LoggerFactory.getLogger(KafkaConsumerService.class);
//    @KafkaListener(topics = AppConstants.KAFKA_TEST_TOPIC_NAME, groupId = AppConstants.KAFKA_TEST_GROUP_NAME)
//    public void consume(String message){
//        String loggerInfo = "Message Received : " + message;
//        LOGGER.info(loggerInfo);
//
//    }
}
