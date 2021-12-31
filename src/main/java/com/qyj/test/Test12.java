package com.qyj.test;

import lombok.extern.slf4j.Slf4j;

import static com.qyj.util.Sleeper.sleep;

/**
 * @Auther YaoJun Qi
 * @Date 2021/12/24 14:18
 * @description   synchronized作用在方法上加 static（xxx.Class）和不加static (this) 区别
 * this	指代当前对象的引用
 * 类名.class	指向每个类对应的唯一类对象（类型为Class）
 */
@Slf4j(topic = "c.Test12")
public class Test12
{
    public static void main(String[] args)
    {
        Number n1 = new Number();
        Number n2 = new Number();
        new Thread(()->{n1.a();}).start();
        new Thread(()->{n2.b();}).start();
    }
}

@Slf4j(topic = "c.Number")
class Number
{
    public static synchronized void a()
    {
        sleep(1);
        log.info("1");
    }

    public static synchronized void b()
    {
        log.info("2");
    }
}
