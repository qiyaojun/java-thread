package com.qyj.test;

import lombok.extern.slf4j.Slf4j;

/**
 * @Auther YaoJun Qi
 * @Date 2021/12/2 15:59
 * @description
 */
@Slf4j(topic = "c.Test5")
public class Test5
{
    public static void main(String[] args) throws InterruptedException
    {
        Thread t1 = new Thread("t1")
        {
            @Override
            public void run()
            {
                log.info("enter running...");
                try
                {
                    Thread.sleep(2000);
                } catch (InterruptedException e)
                {
                    log.info("wakeup");
                    e.printStackTrace();
                }
            }
        };
        t1.start();

        Thread.sleep(1000);
        log.info("interrupt");
        try
        {
            t1.interrupt();
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        System.out.println(t1.getState());
    }
}
