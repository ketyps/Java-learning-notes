package com.itheima.review.a10api;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Test1_DateCalc {
    public static void main(String[] args) {
        /*
            题目：日期计算(JDK8 时间类)
            1. isLeapYear(year): 判断某年是否为闰年
               闰年规则: 能被 4 整除但不能被 100 整除,或者能被 400 整除
            2. daysBetween(date1, date2): 计算两个日期(yyyy-MM-dd)相差的天数
            测试:
                isLeapYear(2024) -> true     (能被4整除且不能被100整除)
                isLeapYear(2023) -> false
                isLeapYear(2000) -> true     (能被400整除)
                daysBetween("2024-03-01", "2024-03-10") -> 9
            提示:
                - LocalDate.parse("2024-03-01") 把字符串转成日期
                - ChronoUnit.DAYS.between(d1, d2) 算两个日期相差的天数
        */

        System.out.println("2024 是闰年? " + isLeapYear(2024));   // 期望 true
        System.out.println("2023 是闰年? " + isLeapYear(2023));   // 期望 false
        System.out.println("2000 是闰年? " + isLeapYear(2000));   // 期望 true
        System.out.println("相差天数 = " + daysBetween("2024-03-01", "2024-03-10"));   // 期望 9
    }

    // TODO: 判断闰年
    private static boolean isLeapYear(int year) {
        return false;   // 占位返回值,实现后删除
    }

    // TODO: 计算两个日期字符串相差的天数
    private static long daysBetween(String date1, String date2) {
        return 0;   // 占位返回值,实现后删除
    }
}
