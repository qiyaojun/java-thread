package com.qyj.test;

/**
 * @Auther YaoJun Qi
 * @Date 2021/12/1 15:21
 * @description
 */
public class Test
{
    public static void main(String[] args)
    {
        new Thread(() -> {
            while (true)
            {
                try
                {
                    Thread.sleep(1000);
                } catch (InterruptedException e)
                {
                    e.printStackTrace();
                }
            }
        },"t1").start();

        new Thread(() -> {
            while (true)
            {
                try
                {
                    Thread.sleep(1000);
                } catch (InterruptedException e)
                {
                    e.printStackTrace();
                }
            }
        },"t2").start();
    }
}
