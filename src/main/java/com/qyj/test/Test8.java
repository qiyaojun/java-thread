package com.qyj.test;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.locks.LockSupport;

/**
 * @Auther YaoJun Qi
 * @Date 2021/12/17 11:15
 * @description
 */
@Slf4j(topic = "c.Test8")
public class Test8
{
    public static void main(String[] args) throws InterruptedException
    {
        Test();
    }

    public static void Test() throws InterruptedException
    {
        Thread t1 = new Thread(() ->
        {
            log.info("park...");
            LockSupport.park();   //挂起线程，打断标记为true接着执行
            log.info("un_park...");
//            log.info("打断状态:{}", Thread.currentThread().isInterrupted());

            log.info("打断状态:{}", Thread.interrupted());  //查看并将标记设为false
            LockSupport.park();
            log.info("un_park...");

        }, "t1");

        t1.start();

        Thread.sleep(1000);
        t1.interrupt();
    }
}
