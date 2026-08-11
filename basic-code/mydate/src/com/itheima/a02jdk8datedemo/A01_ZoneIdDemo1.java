package com.itheima.a02jdk8datedemo;

import java.time.ZoneId;
import java.util.Set;
import java.util.zip.ZipEntry;

public class A01_ZoneIdDemo1 {
    public static final String AISA_PONTIANAK = "Aisa/Pontianak";

    public static void main(String[] args) {
        /*
            static Set<String> getAvailableZoneIds()     获取Java中支持的所有时区
            static ZoneId systemDefault()                获取系统默认时区
            static ZoneId of(String zoneId)              获取一个指定时区
        */

        //1.获取所有的失去名称
        Set<String> zoneIds= ZoneId.getAvailableZoneIds();
        System.out.println(zoneIds.size());//604
        System.out.println(zoneIds);//Aisa/Shanghai

        //2.获取当前系统的默认时区
        ZoneId zoneId = ZoneId.systemDefault();
        System.out.println(zoneId);

        //3.获取指定的时区
        ZoneId zoneId1 = ZoneId.of("Asia/Pontianak");
        System.out.println(zoneId1);
    }
}