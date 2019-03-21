package com.mq.mqdemo.kafka;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;

public class ConsumerListener {

    protected final Logger logger = LoggerFactory.getLogger(ConsumerListener.class);

    @KafkaListener(topics = {"test"})
    public void listen(ConsumerRecord<?, ?> record) {
        logger.info("kafaka收到消息消费====");
        logger.info("kafka的key: " + record.key());
        logger.info("kafka的value: " + record.value().toString());
    }
}
