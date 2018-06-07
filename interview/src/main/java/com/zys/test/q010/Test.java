package com.zys.test.q010;

/*
Q:使用final关键字修饰一个变量时，是引用不能变，还是引用的对象不能变？
A:
使用final关键字修饰一个变量时，是指引用变量不能变，引用变量所指向的对象中的内容还是可以改变的
 */
public class Test {
    public static void main(String[] args) {
        final StringBuffer a = new StringBuffer("immutable");
        //执行如下语句将报告编译期错误：
//        a=new StringBuffer("");

//        但是，执行如下语句则可以通过编译：
        a.append(" broken!");
    }
}
