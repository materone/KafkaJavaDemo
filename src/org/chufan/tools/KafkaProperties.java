package org.chufan.tools;

public interface KafkaProperties
{
    final static String svr = "192.168.78.56"; 
	final static String zkConnect = svr + ":2181";
    final static String groupId = "group1";
    final static String topic = "tony";
    final static String kafkaServerURL = svr;
    final static int kafkaServerPort = 9092;
    final static int kafkaProducerBufferSize = 64 * 1024;
    final static int connectionTimeOut = 20000;
    final static int reconnectInterval = 10000;
    final static String topic2 = "tim";
    final static String topic3 = "wendy";
    final static String clientId = "Win10";
	static final String consumerId = "Win10";
}
