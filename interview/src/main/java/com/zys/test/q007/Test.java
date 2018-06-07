package com.zys.test.q007;

/*
Q:char型变量中能不能存贮一个中文汉字?为什么?
A:
char型变量是用来存储Unicode编码的字符的，unicode编码字符集中包含了汉字，所以，char型变量中当然可以存储汉字啦。
不过，如果某个特殊的汉字没有被包含在unicode编码字符集中，那么，这个char型变量中就不能存储这个特殊汉字。补充说明：unicode编码占用两个字节，所以，char类型的变量也是占用两个字节。
 */
public class Test {
    public static void main(String[] args) {
        char c='A';
        c='1';
        c='哦';
        c='\u1068';
        c='周';
        System.out.println(c);

    }
}
