package com.bandit.program.ModelUtil.Object;

/**
 * @author jun_yu
 * super 的使用
 * 1) 类的继承中，子类的构造方法中; 默认会有super()语句存在，相当于执行父类的相应构造方法中的语句
 * 2) super() 代表执行父类无参数构造方法内容，
 * 3) super(color,foot) 代表执行父类有参数构造方法。
 */

class Animal {
    private String color;
    private int foot;

    public Animal(){
        System.out.println("我是父类无参数构造器");
    }

    public Animal(String color,int foot) {
        System.out.println("我是父类有参数构造器");
        this.color = color;
        this.foot  = foot;
    }
}


class Cat extends Animal{
    public Cat(){
//        super();                       //---------------可以省略
        System.out.println("我是子类无参数构造器");
    }
    public Cat(String color,int foot){
//        super(color,foot);             //---------------(3)
//        super();                       //---------------可以省略
        System.out.println("我是子类有参数构造器");
    }
}


class superTest {
    public static void main(String[] args) {
        Cat c = new Cat();                      //---------------(1)
        System.out.println("-------------------");
        Cat c1 = new Cat("花花",4);   //----------------(2)
    }
}

