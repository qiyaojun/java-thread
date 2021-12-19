package com.qyj.test;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/**
 * @Auther YaoJun Qi
 * @Date 2021/12/1 14:49
 * @description
 */
@Slf4j(topic = "c.Test3")
public class Test3
{
    public static void main(String[] args) throws Exception
    {
        FutureTask<Integer> task = new FutureTask<>(new Callable<Integer>()
        {
            @Override
            public Integer call() throws Exception
            {
                log.info("running");
                Thread.sleep(1000);
                return 100;
            }
        });
        Thread t1 = new Thread(task,"t1");
        t1.start();

        log.info("{}",task.get());
    }
}
