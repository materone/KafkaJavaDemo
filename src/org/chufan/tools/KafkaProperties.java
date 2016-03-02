package org.chufan.tools;

public interface KafkaProperties
{
    final static String zkConnect = "127.0.0.1:2181";
    final static String groupId = "group1";
    final static String topic = "tony";
    final static String kafkaServerURL = "127.0.0.1";
    final static int kafkaServerPort = 9092;
    final static int kafkaProducerBufferSize = 64 * 1024;
    final static int connectionTimeOut = 20000;
    final static int reconnectInterval = 10000;
    final static String topic2 = "tim";
    final static String topic3 = "wendy";
    final static String clientId = "SimpleConsumerDemoClient";
}
