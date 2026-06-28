package com.itheima.test8;

public class Test {
    public static void main(String[] args) {
        /*定义一个长度为3的数组，数组存储1~3名学生对象作为初始数据，学生对象的学号，姓名各不相同。
        学生的属性：学号，姓名，年龄。
        要求1：再次添加一个学生对象，并在添加的时候进行学号的唯一性判断。
        要求2：添加完毕之后，遍历所有学生信息。
        要求3：通过id删除学生信息
        如果存在，则删除，如果不存在，则提示删除失败。
        要求4：删除完毕之后，遍历所有学生信息。
        要求5：查询数组id为“heima002”的学生，如果存在，则将他的年龄+1岁*/

        //1.创建一个数组用来存储学生对象
        Student arr[] = new Student[3];
        //2.创建学生对象并添到数组当中
        Student stu1 = new Student(1, "张三", 23);
        Student stu2 = new Student(2, "李四", 24);
        Student stu3 = new Student(3, "王五", 25);
        //3.把学生对象添加到数组当中
        arr[0] = stu1;
        arr[1] = stu2;
        arr[2] = stu3;

        //要求1:再次添加一个学生对象,并在添加的时候进行学号的唯一性判断.
        //读题拆解法
        Student stu4 = new Student(4, "赵六", 26);

        //唯一性判断
        //已存在 --- 不用添加
        //不存在 --- 就可以把学生对象添加进数组
        boolean flag = contains(arr, stu4.getId());
        if (flag) {
            //已存在 --- 不用添加
            System.out.println("当前id重复,请修改后再进行添加");
        } else {
            //不存在 --- 就可以把学生对象添加进数组
            //把stu4添加到数组当中
            //1.数组已经填满 --- 只能创建一个新数组,新数组长度=老数组+1
            //2.数组没有存满 --- 直接添加
            int cnt = getCount(arr);
            if (cnt == arr.length) {
                //已经存满
                //创建一个新的数组,长度=老数组的长度+1.
                //然后把老数组的元素,拷贝到新数组当中
                Student[] newArr = creatnewarr(arr);
                //把stu4添加进去
                newArr[cnt] = stu4;
                printArr(newArr);
            } else {
                //没有存满
                //[stu1,stu2,null]
                //getCount获取到的是2,表示数组当中已经有了2个元素
                //还有一层意思,如果下一次要添加数据,就是添加到2索引的位置
                arr[cnt] = stu4;
                printArr(arr);
            }
        }
    }

    public static Student[] creatnewarr(Student[] arr) {
        Student[] newArr = new Student[arr.length + 1];

        //循环遍历得到老数组中的每一个元素
        for (int i = 0; i < arr.length; i++) {
            //把老数组中的元素添加到新数组当中
            newArr[i] = arr[i];
        }

        //把新数组返回
        return newArr;
    }

    //定义一个方法判断数组中已经存了几个元素
    public static int getCount(Student[] arr) {
        //定义一个计数器用来统计
        int cnt = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                cnt++;
            }
        }
        return cnt;
    }

    //1.我要干嘛?
    //2.我赶这件事情,需要什么才能完成? 数组 id
    //3.调用处是否需要继续使用方法的结果? 必须返回
    public static boolean contains(Student[] arr, int id) {
        for (int i = 0; i < arr.length; i++) {
            //依次获取到数组里面的每一个学生对象
            Student stu = arr[i];
            if(stu!=null){
                //获取数组中学生对象的id
                int sid = stu.getId();
                //比较
                if (sid == id) {
                    return true;
                }
            }
            return false;
            }
        return true;
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

