package com.qyj.test;

import lombok.extern.slf4j.Slf4j;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * @Auther YaoJun Qi
 * @Date 2021/12/17 14:20
 * @description java中线程状态
 */
@Slf4j(topic = "c.Test9")
public class Test9
{
    public static void main(String[] args)
    {
        Thread t1 = new Thread(() ->
        {

        }, "t1");

        Thread t2 = new Thread(() ->
        {
            while (true)
            {
            }
        }, "t2");
        t2.start();

        Thread t3 = new Thread(() ->
        {

        }, "t3");
        t3.start();

        Thread t4 = new Thread(() ->
        {
            synchronized (Test9.class)
            {
                try
                {
                    Thread.sleep(1000000);
                } catch (InterruptedException e)
                {
                    e.printStackTrace();
                }
            }
        }, "t4");
        t4.start();

        Thread t5 = new Thread(() ->
        {
            try
            {
                t4.join();
            } catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        });
        t5.start();

        Thread t6 = new Thread(() ->
        {
            synchronized (Test9.class)
            {
                try
                {
                    Thread.sleep(1000000);
                } catch (InterruptedException e)
                {
                    e.printStackTrace();
                }
            }
        },"t6");
        t6.start();

        log.info("线程t1:{}", t1.getState());
        log.info("线程t2:{}", t2.getState());
        log.info("线程t3:{}", t3.getState());
        log.info("线程t4:{}", t4.getState());
        log.info("线程t5:{}", t5.getState());
        log.info("线程t6:{}", t6.getState());
    }
}
