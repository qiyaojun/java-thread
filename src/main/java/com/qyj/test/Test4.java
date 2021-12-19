package com.qyj.test;

import lombok.extern.slf4j.Slf4j;

/**
 * @Auther YaoJun Qi
 * @Date 2021/12/2 15:51
 * @description
 */
@Slf4j(topic = "c.Test4")
public class Test4
{
    public static void main(String[] args)
    {
        Thread t1 = new Thread("t1")
        {
            @Override
            public void run()
            {
                try
                {
                    log.info("running...");
                    Thread.sleep(2000);
                } catch (InterruptedException e)
                {
                    e.printStackTrace();
                }
            }
        };
        t1.start();

        try
        {
            Thread.sleep(500);
        } catch (InterruptedException e)
        {
            e.printStackTrace();
        }

        System.out.println(t1.getState());


    }
}
