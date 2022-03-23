package com.ac.user.controller;

import java.lang.reflect.InvocationTargetException;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * @title: Test
 * @Author djr
 * @Date: 2021/9/7 17:50
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        /*String a = "hello2";
        final String b = "hello";
        String d = "hello";
        String c = b + 2;
        String e = d + 2;
        System.out.println(c);
        System.out.println(e);
        System.out.println((a == c));
        System.out.println((a == e));*/
    /*    ArrayList<String> arr1 = new ArrayList<String>();
        arr1.add("122");
        ArrayList<String> arr2 = new ArrayList<String>();
        arr2.add("asf");
        System.out.println(arr1.getClass());
        System.out.println(arr1.getClass() == arr2.getClass());*/
        //Direction d = Direction.FRONT;
        Direction d = Direction.BEHIND;
        System.out.println(d.getName());

    }
}
