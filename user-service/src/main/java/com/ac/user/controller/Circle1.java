package com.ac.user.controller;

/**
 * @title: Circle1
 * @Author djr
 * @Date: 2021/8/14 8:52
 * @Version 1.0
 */
public class Circle1 {

    static int theNumberOfCircle = 0;      //在这个类中声明一个静态变量,根据静态变量的特点
    //静态变量的特点:1、可以让这个Circle1类所有的实例共享这个 theNumberOfCicle.
    int theCase = 1;		       //即与普通变量的差别就是重新创建一个实例的时候，静态变量的值不会恢复到初始值而普通变量的值会恢复的初始值
    //静态变量可以在不创建对象的时候访问即直接用 ClassName.Static variable;
    private double radius = 1;

    //创建两个不同的构造方法
    public Circle1() {
        theNumberOfCircle++; 	       //在创建实例的时候要调用构造方法，在每个构造方法中写上这一句便于观察静态变量和普通变量的区别
        theCase ++;
    }

    public Circle1(double radius) {
        this.radius = radius;
        theNumberOfCircle++;
        theCase++;
    }

    //创建一个静态函数 		     //静态函数的特点：不需要创建对象就可以访问，可以用ClassName.staticMethod
    public static int getNumberOfCircle() {
        return theNumberOfCircle;
    }

    //创建一个普通的函数
    public double getArea() {
        return radius*radius*Math.PI;
    }
}
