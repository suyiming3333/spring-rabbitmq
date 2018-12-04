package com.sym.myrabbitmq.productor;

/**
 * @Auther: suyiming
 * @Date: 18-12-4 22:22
 * @Description:
 */
//MQProducer.java
public interface MQProducer {
    /**
     * 发送消息到指定队列
     * @param queueKey
     * @param object
     */
    public void sendDataToQueue(String queueKey, Object object);
}
