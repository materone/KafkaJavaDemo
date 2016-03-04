package org.chufan.tools;

/**
 * @author leicui bourne_cui@163.com
 */
public class KafkaConsumerProducerDemo
{
    public static void main(String[] args)
    {
        KafkaProducer producerThread = new KafkaProducer(KafkaProperties.topic);
        producerThread.start();

        KafkaConsumer consumerThread = new KafkaConsumer(KafkaProperties.topic);
        consumerThread.start();
        
        consumerThread = new KafkaConsumer(KafkaProperties.topic);
        consumerThread.start();
        
        consumerThread = new KafkaConsumer(KafkaProperties.topic);
        consumerThread.start();
        
        consumerThread = new KafkaConsumer(KafkaProperties.topic);
        consumerThread.start();
    }
}
