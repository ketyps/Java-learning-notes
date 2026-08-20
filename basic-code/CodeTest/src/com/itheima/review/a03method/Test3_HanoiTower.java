package com.itheima.review.a03method;

public class Test3_HanoiTower {
    public static void main(String[] args) {
        /*
            【挑战题】汉诺塔
            有 A、B、C 三根柱子,A 柱上有 n 个盘子,从小到大叠放(小在上大在下)
            要求借助 B 柱,把所有盘子移到 C 柱
            规则:
                1. 每次只能移动一个盘子(最上面的)
                2. 大盘子不能压在小盘子上面
            输出每次移动的步骤,预期 n=3 时共 7 步,步数 = 2^n - 1
            思路(递归):
                - 先把上面 n-1 个盘子: A -> B (借助 C)
                - 再把第 n 个(最大的)盘子: A -> C
                - 最后把 n-1 个盘子: B -> C (借助 A)
                出口: n == 1 时,直接 from -> to
        */

        System.out.println("n=3 时的移动步骤:");
        hanoi(3, 'A', 'B', 'C');
    }

    // 将 n 个盘子从 from 借助 helper 移到 to
    private static void hanoi(int n, char from, char helper, char to) {
        // TODO: 实现汉诺塔递归
        // 出口: n == 1 时 System.out.println(from + " -> " + to);
        // 三步: 递归移动 n-1 个到 helper,移动第 n 个到 to,递归移动 n-1 个到 to

        System.out.println(from + " -> " + to);   // 占位输出,实现后删除
    }
}
