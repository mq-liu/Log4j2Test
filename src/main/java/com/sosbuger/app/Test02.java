package com.sosbuger.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class Test02 {


    public static void main(String[] args) {
        System.setProperty("my.log","systemLog");
        Logger logger = LoggerFactory.getLogger(Test02.class);
        for (int i = 0; i < 200; i++) {
            if(i % 2 == 0){
                logger.info("info: "+i);
            }else{
                logger.debug("debug: "+ i);
            }
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


    }

}
