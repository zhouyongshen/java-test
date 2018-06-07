package com.zys.test.q01_10.q008;

/*
Q:用最有效率的方法算出2乘以8等於几?
A:
    2 << 3，
    因为将一个数左移n位，就相当于乘以了2的n次方，
    那么，一个数乘以8只要将其左移3位即可，而位运算cpu直接支持的，效率最高，
    所以，2乘以8等於几的最效率的方法是2 << 3。
 */
public class Test {
    public static void main(String[] args) {
        System.out.println(2<<3);
        System.out.println(2<3);
        System.out.println(16>>3);
    }
}
