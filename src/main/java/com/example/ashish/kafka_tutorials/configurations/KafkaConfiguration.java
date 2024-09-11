package com.example.ashish.kafka_tutorials.configurations;

import org.apache.kafka.clients.admin.AdminClientConfig;
import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;
import org.springframework.kafka.core.KafkaAdmin;

import java.util.HashMap;
import java.util.Map;


@Configuration
public class KafkaConfiguration {
    @Bean
    public KafkaAdmin admin() {
        Map<String, Object> configs = new HashMap<>();
        configs.put(AdminClientConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:29092");
        return new KafkaAdmin(configs);
    }

    @Bean("topic1")
    public NewTopic topic1() {
        return TopicBuilder.name("thing1")
//                .partitions(10)
//                .replicas(3)
//                .compact()
                .build();
    }

    @Bean("topic2")    public NewTopic topic2() {
        return TopicBuilder.name("thing2")
//                .partitions(10)
//                .replicas(3)
//                .compact()
                .build();
    }
}
