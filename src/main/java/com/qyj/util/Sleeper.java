package com.qyj.util;

import java.util.concurrent.TimeUnit;

/**
 * @Auther YaoJun Qi
 * @Date 2021/12/21 13:40
 * @description
 */
public class Sleeper
{
    public static void sleep(int i)
    {
        try
        {
            TimeUnit.SECONDS.sleep(i);
        } catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }

    public static void sleep(double i)
    {
        try
        {
            TimeUnit.MILLISECONDS.sleep((int) (i * 1000));
        } catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }
}
