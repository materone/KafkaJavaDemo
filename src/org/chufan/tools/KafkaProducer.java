package org.chufan.tools;


import java.util.Properties;

import org.apache.kafka.clients.producer.ProducerRecord;

import kafka.producer.KeyedMessage;
import kafka.producer.ProducerConfig;

/**
 * @author leicui bourne_cui@163.com
 */
public class KafkaProducer extends Thread
{
    private final org.apache.kafka.clients.producer.KafkaProducer
<Integer, String> producer;
    private final String topic;
    private final Properties props = new Properties();

    public KafkaProducer(String topic)
    {
        props.put("serializer.class", "kafka.serializer.StringEncoder");
        props.put("metadata.broker.list", KafkaProperties.kafkaServerURL+":" + KafkaProperties.kafkaServerPort);

        props.put("bootstrap.servers",KafkaProperties.kafkaServerURL+":" + KafkaProperties.kafkaServerPort);
        props.put("acks", "all");
        props.put("retries", 0);
        props.put("batch.size", 16384);
        props.put("linger.ms", 1);
        props.put("buffer.memory", 33554432);
        props.put("key.serializer", "org.apache.kafka.common.serialization.IntegerSerializer");
        props.put("value.serializer", "org.apache.kafka.common.serialization.StringSerializer");
        
        producer = new org.apache.kafka.clients.producer.KafkaProducer
<Integer, String>(props);
        this.topic = topic;
    }

    @Override
    public void run() {
        int messageNo = 1;
        while (true)
        {
            String messageStr = new String("Message_" + messageNo);
            System.out.println("Send:" + messageStr);
            //fix part 1
            ProducerRecord<Integer, String> msgdata = new ProducerRecord<>(topic, 9, messageStr);
            producer.send(msgdata);
            messageNo++;
            try {
                sleep(300);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
    
    public static void main(String[] args) {
		KafkaProducer p = new KafkaProducer(KafkaProperties.topic);
		p.start();
	}

}

