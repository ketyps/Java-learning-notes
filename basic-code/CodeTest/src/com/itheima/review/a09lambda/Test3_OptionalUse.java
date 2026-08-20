package com.itheima.review.a09lambda;

import java.util.Optional;

public class Test3_OptionalUse {
    public static void main(String[] args) {
        /*
            题目：Optional 安全取值
            现有方法 findCity(name): 模拟从数据库查某人的所在城市,
            查到返回城市字符串,查不到返回 null
            要求用 Optional 封装 findCity 的返回值:
                - 取到值输出 "城市: xxx"
                - 取不到输出 "未知城市"
            测试:
                showCity("张三")        -> 期望 城市: 北京
                showCity("不存在的人")   -> 期望 未知城市
            提示: Optional.ofNullable(findCity(name)).orElse("未知城市")
        */

        System.out.println(showCity("张三"));           // 期望: 城市: 北京
        System.out.println(showCity("不存在的人"));      // 期望: 未知城市
    }

    private static String showCity(String name) {
        // TODO: 用 Optional 封装 findCity 的返回值,取不到时返回 "未知城市"
        return "";
    }

    // 模拟数据库,不用改
    private static String findCity(String name) {
        if ("张三".equals(name)) {
            return "北京";
        }
        return null;
    }
}
