package com.qyj.test;

import lombok.extern.slf4j.Slf4j;

/**
 * @Auther YaoJun Qi
 * @Date 2021/12/21 13:32
 * @description
 */
@Slf4j(topic = "c.Test10")
public class Test10
{
    public static void main(String[] args) throws Exception
    {
        Thread t1 = new Thread(() ->
        {
            try
            {
                log.info("洗水壶中（1分钟）。。。");
                Thread.sleep(1000);
            } catch (InterruptedException e)
            {
                e.printStackTrace();
            }
            try
            {
                log.info("烧开水中（15分钟）。。。");
                Thread.sleep(15000);
            } catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        },"t1");
        t1.start();

        Thread t2 = new Thread(() ->
        {
            try
            {
                log.info("洗茶壶中（1分钟）。。。");
                Thread.sleep(1000);
            } catch (InterruptedException e)
            {
                e.printStackTrace();
            }
            try
            {
                log.info("洗茶杯中（2分钟）。。。");
                Thread.sleep(2000);
            } catch (InterruptedException e)
            {
                e.printStackTrace();
            }
            try
            {
                log.info("拿茶叶（1分钟）。。。");
                Thread.sleep(1000);
            } catch (InterruptedException e)
            {
                e.printStackTrace();
            }

            try
            {
                t1.join();
            } catch (InterruptedException e)
            {
                e.printStackTrace();
            }
            log.info("t1烧开水完毕，t2泡茶中。。。");
        },"t2");
        t2.start();
    }
}
