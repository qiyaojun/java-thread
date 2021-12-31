package com.qyj.test;

import lombok.extern.slf4j.Slf4j;

/**
 * @Auther YaoJun Qi
 * @Date 2021/12/23 15:22
 * @description 临界区   竞态条件
 */
@Slf4j(topic = "c.Test11")
public class Test11
{
    static int num = 0;
    static Object object = new Object();

    public static void main(String[] args) throws Exception
    {
        Thread thread1 = new Thread(() ->
        {//临界区
            for (int i = 0; i < 5000; i++)
            {
//                synchronized (object)
//                {
                    num++; //竞态条件
//                }
            }
        }, "t1");

        Thread thread2 = new Thread(() ->
        {
            for (int i = 0; i < 5000; i++)
            {
//                synchronized (object)
//                {
                    num--; //竞态条件
//                }
            }
        }, "t2");

        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();

        log.info("计算结果为：{}", num);
    }
}
