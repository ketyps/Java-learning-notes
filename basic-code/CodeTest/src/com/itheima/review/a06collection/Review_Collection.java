package com.itheima.review.a06collection;

import java.util.*;

public class Review_Collection {
    public static void main(String[] args) {
        /*
            一、集合体系总览
                Collection(接口)
                  ├── List: 有序、可重复、有索引
                  │     ├── ArrayList    底层数组,查询快、增删慢
                  │     └── LinkedList   底层链表,增删快、查询慢
                  └── Set: 元素不可重复
                        ├── HashSet        无序(哈希),去重
                        ├── LinkedHashSet  有序(按插入顺序),去重
                        └── TreeSet        排序(默认升序),去重
                Map(接口): 键值对,key 唯一
                  ├── HashMap        无序
                  ├── LinkedHashMap  按插入顺序
                  └── TreeMap        按键排序
                泛型: 集合默认只能存对象,用泛型限定类型,如 ArrayList<String>
        */

        /*
            二、List 集合
        */
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add(0, "x");              // 在索引 0 处插入
        list.remove(0);                // 删除索引 0 的元素
        list.remove("b");              // 删除指定元素(只删第一个)
        list.set(0, "A");              // 修改索引 0 的元素
        System.out.println(list);      // [A, c]
        System.out.println(list.get(0));        // A  有索引,直接取值
        System.out.println(list.size());        // 2
        System.out.println(list.contains("A")); // true

        // 遍历方式 1: 普通 for(只有 List 有索引)
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

        // 遍历方式 2: 增强 for(读操作推荐,不能增删)
        for (String s : list) {
            System.out.print(s + " ");
        }
        System.out.println();

        // 遍历方式 3: 迭代器 Iterator(遍历时可以安全删除元素)
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String s = it.next();
            System.out.print(s + " ");
        }
        System.out.println();

        // 遍历方式 4: Lambda(JDK8+,见 a09)
        list.forEach(s -> System.out.print(s + " "));
        System.out.println();

        /*
            三、Set 集合
        */
        Set<Integer> set = new HashSet<>();
        set.add(3);
        set.add(1);
        set.add(2);
        set.add(3);                    // 重复元素,自动去重
        System.out.println(set);       // 无序,如 [1, 2, 3]

        Set<Integer> treeSet = new TreeSet<>();   // 自动升序排序
        treeSet.add(5);
        treeSet.add(1);
        treeSet.add(3);
        System.out.println(treeSet);   // [1, 3, 5]

        /*
            四、Map 集合(key 唯一,value 可重复)
        */
        Map<String, Integer> map = new HashMap<>();
        map.put("张三", 90);
        map.put("李四", 85);
        map.put("张三", 95);           // key 相同,后放的覆盖前放的
        System.out.println(map);       // {李四=85, 张三=95}
        System.out.println(map.get("张三"));          // 95  根据 key 取值
        System.out.println(map.containsKey("李四"));  // true
        System.out.println(map.keySet());             // 所有 key
        System.out.println(map.values());             // 所有 value

        // 遍历 Map 方式 1: 键找值
        for (String key : map.keySet()) {
            System.out.println(key + "=" + map.get(key));
        }
        // 遍历 Map 方式 2: 键值对对象 entrySet
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + "=" + entry.getValue());
        }
        // 遍历 Map 方式 3: Lambda(JDK8+)
        map.forEach((key, value) -> System.out.println(key + "=" + value));

        /*
            五、Collections 工具类(操作集合的静态方法)
                shuffle(list)  打乱顺序
                sort(list)     升序排序(元素实现 Comparable 或传 Comparator)
                reverse(list)  反转
                max / min(list) 求最大 / 最小
        */
        List<Integer> nums = new ArrayList<>(List.of(3, 1, 2));
        Collections.sort(nums);
        System.out.println(nums);        // [1, 2, 3]
        Collections.reverse(nums);
        System.out.println(nums);        // [3, 2, 1]
        System.out.println(Collections.max(nums));   // 3
    }
}
