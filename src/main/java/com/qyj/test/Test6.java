package com.qyj.test;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.TimeUnit;

/**
 * @Auther YaoJun Qi
 * @Date 2021/12/2 16:54
 * @description
 */
@Slf4j(topic = "c.Test6")
public class Test6
{
    public static void main(String[] args) throws InterruptedException
    {
        log.info("enter sleep...");
        TimeUnit.SECONDS.sleep(1);
        log.info("end...");
    }
}
