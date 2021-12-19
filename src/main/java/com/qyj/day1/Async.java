package com.qyj.day1;

import lombok.extern.slf4j.Slf4j;

/**
 * @Auther YaoJun Qi
 * @Date 2021/11/26 16:03
 * @description
 */
@Slf4j(topic = "c.Async")
public class Async
{
    public static void main(String[] args)
    {
        long start = System.currentTimeMillis();
        new Thread(() -> aaa(start)).start();

        long end = System.currentTimeMillis();
        log.info("异步执行完成耗时:" + (end - start) + "ms");
    }

    public static void aaa(long start)
    {
        for (int i = 0 ; i <= 10000000 ; i++){
            if(i == 10000000){
                long end = System.currentTimeMillis();
                log.info("耗时:" + (end - start) + "ms");
            }
        }
    }
}
