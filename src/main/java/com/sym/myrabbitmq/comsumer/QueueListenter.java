package com.sym.myrabbitmq.comsumer;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageListener;
import org.springframework.stereotype.Component;

/**
 * @Auther: suyiming
 * @Date: 18-12-4 22:27
 * @Description:
 */
//QueueListenter.java
@Component
public class QueueListenter implements MessageListener {

    @Override
    public void onMessage(Message msg) {
        try{
            System.out.print(msg.toString());
        }catch(Exception e){
            e.printStackTrace();
        }
    }

}