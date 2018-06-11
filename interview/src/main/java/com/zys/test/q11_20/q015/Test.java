package com.zys.test.q11_20.q015;

/*
Q:
A:
Math类中提供了三个与取整有关的方法：
ceil、floor、round，这些方法的作用与它们的英文名称的含义相对应，
例如，
ceil的英文意义是天花板，该方法就表示向上取整，
Math.ceil(11.3)的结果为12,Math.ceil(-11.3)的结果是-11；
floor的英文意义是地板，该方法就表示向下取整，
Math.floor(11.6)的结果为11,Math.floor(-11.6)的结果是-12；
最难掌握的是round方法，它表示“四舍五入”，
算法为Math.floor(x+0.5)，即将原来的数字加上0.5后再向下取整，
所以，Math.round(11.5)的结果为12，Math.round(-11.5)的结果为-11。

 */
public class Test {
    public static void main(String[] args) {
        System.out.println(Math.ceil(11.3));
        System.out.println(Math.ceil(-11.3));
        System.out.println(Math.floor(11.6));
        System.out.println(Math.floor(-11.6));
        System.out.println(Math.round(11.5));
        System.out.println(Math.round(-11.5));
        System.out.println(Math.round(11.3));
        System.out.println(Math.round(-11.3));
        System.out.println(Math.round(11.6));
        System.out.println(Math.round(-11.6));
    }
}
