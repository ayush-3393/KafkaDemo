package kafka_demo.config;

import kafka_demo.constants.AppConstants;
import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {

    @Bean
    public NewTopic createTestTopic(){
        return TopicBuilder
                .name(AppConstants.KAFKA_TEST_TOPIC_NAME)
                .build();
    }



}
