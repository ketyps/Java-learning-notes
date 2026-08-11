package com.itheima.a02jdk8datedemo;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class A02_InstantDemo {
    public static void main(String[] args) {
        /*
            static Instant now()                        获取当前时间的Instant对象（标准时间）
            static Instant ofXxxx(long epochMilli)      根据（秒/毫秒/纳秒）获取Instant对象
            ZonedDateTime atZone(ZoneId zone)           指定时区
            boolean isXxx(Instant otherInstant)         判断系列的方法
            Instant minusXxx(long millisToSubtract)     减少时间系列的方法
            Instant plusXxx(long millisToSubtract)      增加时间系列的方法
        */

        //1.获取当前时间的Instant对象（标准时间）
        //Instant now=Instant.now();
        //System.out.println(now);

        //2.根据(秒/毫秒/纳秒)获取Instant对象
        Instant instant1 = Instant.ofEpochMilli(0L);
        System.out.println(instant1);

        Instant instant2 = Instant.ofEpochSecond(1L);
        System.out.println(instant2);

        Instant instant3 = Instant.ofEpochSecond(1L, 1000000000L);
        System.out.println(instant3);

        //3.指定时区
        ZonedDateTime time = Instant.now().atZone(ZoneId.of("Asia/Shanghai"));
        System.out.println(time);

        //4.isXXX 判断
        Instant instant4 = Instant.ofEpochMilli(0L);
        Instant instant5 = Instant.ofEpochMilli(1000L);

        boolean result = instant4.isBefore(instant5);
        System.out.println(result);

        boolean result2 = instant4.isAfter(instant5);
        System.out.println(result2);

        //6.Instant minusXxx(long millisToSubtract)    减少时间系列的方法
        Instant instant6 = Instant.ofEpochMilli(3000L);
        System.out.println(instant6);//1970-01-01T00:00:03Z

        Instant instant7 = instant6.minusSeconds(1);
        System.out.println(instant7);
    }
}