package com.qyj.test;

import lombok.extern.slf4j.Slf4j;

/**
 * @Auther YaoJun Qi
 * @Date 2021/12/1 11:17
 * @description
 */
@Slf4j(topic = "c.Test1")
public class Test1
{
    public static void main(String[] args)
    {
        Thread t1 = new Thread(){
            @Override
            public void run()
            {
                log.info("running");
            }
        };
        t1.setName("t1");
        t1.start();
        log.info("running");
    }
}
