package com.itheima.test8;

public class Test4 {
    public static void main(String[] args) {
        /*定义一个长度为3的数组，数组存储1~3名学生对象作为初始数据，学生对象的学号，姓名各不相同。
        学生的属性：学号，姓名，年龄。

        要求5：查询数组id为“2”的学生，如果存在，则将他的年龄+1岁*/

        //1. 创建一个数组用来存储学生对象
        Student[] arr = new Student[3];
        //2. 创建学生对象并添加到数组当中
        Student stu1 = new Student(1, "zhangsan", 23);
        Student stu2 = new Student(2, "lisi", 24);
        Student stu3 = new Student(3, "wangwu", 25);

        //3. 把学生对象添加到数组当中
        arr[0] = stu1;
        arr[1] = stu2;
        arr[2] = stu3;

        //4.想要找到id为2的学生的索引
        int index = getIndex(arr,2);

        //5.判断索引
        if(index>=0){
            //存在,则将他的年龄+1岁
            arr[index].setAge(arr[index].getAge()+1);
            printArr(arr);
        }else{
            //不存在,则直接提示
            System.out.println("当前id不存在,修改失败");
        }
    }

    //1.我要干嘛? 找到id在数组中的索引
    //2.我需要什么? 数组id
    //3.调用处是否需要继续使用方法的结果? 是
    public static int getIndex(Student[] arr, int id) {
        for (int i = 0; i < arr.length; i++) {
            //依次得到每一个学生对象
            Student stu = arr[i];
            //对stu进行一个非空判断
            if (stu != null) {
                int sid = stu.getId();
                if (sid == id) {
                    return i;
                }
            }
        }
        return -1;
    }

    public static void printArr(Student[] arr) {
        for (int i = 0; i < arr.length; i++) {
            Student stu = arr[i];
            if (stu != null) {
                System.out.println(stu.getId() + "," + stu.getName() + "," + stu.getAge());
            }
        }
    }
}