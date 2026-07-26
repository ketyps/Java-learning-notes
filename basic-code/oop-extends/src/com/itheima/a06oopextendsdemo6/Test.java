package com.itheima.a06oopextendsdemo6;

public class Test {
    public static void main(String[] args) {
        Student s = new Student();
        s.lunch();

        OverseasStudent o=new OverseasStudent();
        o.lunch();
    }
}

class Person {
    public void eat() {
        System.out.println("吃米饭，吃菜");
    }

    public void drink() {
        System.out.println("喝开水");
    }
}

//留学生
class OverseasStudent extends Person{
    public void lunch(){
        this.eat();
        this.drink();

        super.eat();
        super.drink();
    }

    @Override
    public void eat() {
        System.out.println("吃意大利面");
    }

    @Override
    public void drink() {
        System.out.println("喝凉水");
    }
}

class Student extends Person{
    public void lunch(){
        eat();
        drink();
    }
}