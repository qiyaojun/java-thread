package com.qyj.test;

import lombok.extern.slf4j.Slf4j;

/**
 * @Auther YaoJun Qi
 * @Date 2021/12/15 15:53
 * @description
 */
@Slf4j(topic = "c.Test7")
public class Test7
{
    static int i = 0;
    public static void main(String[] args) throws Exception
    {
        Runnable r = () ->
        {
            log.info("开始");
            try
            {
                Thread.sleep(1);
            } catch (InterruptedException e)
            {
                e.printStackTrace();
            }
            i = 10;
            log.info("结束");
        };

        Thread t1 = new Thread(r,"t1");
        t1.start();
        t1.join();  //主线程等待t1线程执行完成
        log.info("i = {}",i);
    }
}