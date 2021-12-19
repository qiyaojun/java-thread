package com.qyj.day1;


import com.sun.org.apache.xpath.internal.SourceTree;
import lombok.extern.slf4j.Slf4j;

import java.util.Date;

/**
 * @Auther YaoJun Qi
 * @Date 2021/11/4 14:11
 * @description
 */
@Slf4j(topic = "c.Sync")
public class Sync
{
    public static void main(String[] args)
    {
        long start = System.currentTimeMillis();
        for (int i = 0 ; i <= 10000000 ; i++){
            if(i == 10000000){
                long end = System.currentTimeMillis();
                System.out.println("耗时:" + (end - start) + "ms");
            }
        }
        long end = System.currentTimeMillis();
        System.out.println("同步执行完成耗时:" + (end - start) + "ms");

    }
}
