package com.javaKafka.springboot_Kafka.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {
    @Bean
    public NewTopic myKafkaTopic(){
        return TopicBuilder.name("myKafkaTopic")
                .partitions(3)
                .build();
    }

    @Bean
    public NewTopic myKafkaJsonTopic(){
        return TopicBuilder.name("myKafkaJsonTopic")
                .partitions(3)
                .build();
    }
}
