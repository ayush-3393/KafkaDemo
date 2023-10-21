package kafka_demo.services;

import kafka_demo.constants.AppConstants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

//@Service
public class KafkaProducerService {

    private static final Logger LOGGER = LoggerFactory.getLogger(KafkaProducerService.class);
//    private final KafkaTemplate<String, String> kafkaTemplate;

//    public KafkaProducerService(KafkaTemplate<String, String> kafkaTemplate) {
//        this.kafkaTemplate = kafkaTemplate;
//    }

//    public void sendMessage(String message){
//        String loggerInfo = "Message sent : " + message;
//        LOGGER.info(loggerInfo);
//        kafkaTemplate.send(AppConstants.KAFKA_TEST_TOPIC_NAME, message);
//    }

}
