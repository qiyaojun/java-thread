package com.qyj.CaseStudy;

import lombok.extern.slf4j.Slf4j;

/**
 * @Auther YaoJun Qi
 * @Date 2021/12/17 10:50
 * @description 两阶段终止模式
 */
@Slf4j(topic = "c.TwoStageTerminationMode")
public class TwoStageTerminationMode
{
    public static void main(String[] args) throws InterruptedException
    {
        Test1 test1 = new Test1();
        test1.thread1();

        Thread.sleep(5000);
        test1.thread2();
    }
}

@Slf4j(topic = "c.Test1")
class Test1{
    static Thread t1;
    public void thread1()
    {
        t1 = new Thread(()->
        {
            while (true)
            {
                Thread thread = Thread.currentThread();
                if(thread.isInterrupted())
                {
                    log.info("被打断了。。。");
                    break;
                }

                try
                {
                    Thread.sleep(1000);
                    log.info("执行监控记录中。。。");
                } catch (InterruptedException e)
                {
                    e.printStackTrace();
                    log.info("sleep中被打断了。。。");
                    thread.interrupt();
                }
            }
        },"t1");
        t1.start();
    }

    public void thread2()
    {
        t1.interrupt();
    }
}
