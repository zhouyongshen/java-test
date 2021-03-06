package com.zys.test.q01_10.q003;

/*
Q:说说&和&&的区别。
A:&和&&都可以用作逻辑与的运算符，表示逻辑与（and），
当运算符两边的表达式的结果都为true时，整个运算结果才为true，
否则，只要有一方为false，则结果为false。

&&还具有短路的功能，即如果第一个表达式为false，
则不再计算第二个表达式，例如，对于if(str != null && !str.equals(“”))表达式，
当str为null时，后面的表达式不会执行，所以不会出现NullPointerException如果将&&改为&，
则会抛出NullPointerException异常。
If(x==33 & ++y>0) y会增长，If(x==33 && ++y>0)不会增长

&还可以用作位运算符，当&操作符两边的表达式不是boolean类型时，
&表示按位与操作，我们通常使用0x0f来与一个整数进行&运算，
来获取该整数的最低4个bit位，例如，0x31 & 0x0f的结果为0x01。

 */
public class Test {
    public static void main(String[] args) {
        int a=1&1;
        System.out.println(a);
        a=1&0;
        System.out.println(a);
        a=0&1;
        System.out.println(a);
        a=2&1;
        System.out.println(a);
        a=1&2;
        System.out.println(a);
        a=2&2;
        System.out.println(a);
        a=3&2;
        System.out.println(a);
        a=2&3;
        System.out.println(a);
        a=12&5;
        System.out.println(a);
        a=1|2;
        System.out.println(a);

    }
}
