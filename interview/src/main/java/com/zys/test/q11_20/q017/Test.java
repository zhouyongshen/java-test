package com.zys.test.q11_20.q017;

/*
Q:请说出作用域public，private，protected，以及不写时的区别
A:
这四个作用域的可见范围如下表所示。
说明：如果在修饰的元素上面没有写任何访问修饰符，则表示friendly。
作用域    当前类 同一package 子孙类 其他package
public    √     √          √       √
protected  √     √          √      ×
friendly   √     √          ×      ×
private    √     ×          ×      ×

备注：只要记住了有4种访问权限，4个访问范围，然后将全选和范围在水平和垂直方向上分别按排从小到大或从大到小的顺序排列，就很容易画出上面的图了。

 */
public class Test {
    public static void main(String[] args) {

    }
}
