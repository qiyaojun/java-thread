package com.qyj.test;

import lombok.extern.slf4j.Slf4j;

/**
 * @Auther YaoJun Qi
 * @Date 2021/12/1 14:23
 * @description
 */
@Slf4j(topic = "c.Test2")
public class Test2
{
    public static void main(String[] args)
    {
//        Runnable r = new Runnable()
//        {
//            @Override
//            public void run()
//            {
//                log.info("running");
//            }
//        };
//        Thread t1 = new Thread(r,"t2");
//        t1.start();

        Runnable r = () -> log.info("running"); //一行语句可以省略大括号

        Thread t1 = new Thread(r, "t2");
        t1.start();
    }
}
