package com.rabbit.mqsender;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MqsenderApplication {

    public static void main(String[] args) {
        SpringApplication.run(MqsenderApplication.class, args);
        //Sender sender = new Sender();
        //sender.send("text2");
        Receive receive = new Receive();
        receive.receive();
    }

}
