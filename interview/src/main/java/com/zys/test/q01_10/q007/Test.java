package com.zys.test.q01_10.q007;

/*
Q:char型变量中能不能存贮一个中文汉字?为什么?
A:
char型变量是用来存储Unicode编码的字符的，unicode编码字符集中包含了汉字，所以，char型变量中当然可以存储汉字啦。
不过，如果某个特殊的汉字没有被包含在unicode编码字符集中，那么，这个char型变量中就不能存储这个特殊汉字。补充说明：unicode编码占用两个字节，所以，char类型的变量也是占用两个字节。

参考：java byte、short、int、long、float、double、char基本数据类型范围

    byte    8bit/1byte      负2的7次方，至2的7次方-1
    short   16bit/2byte     负2的15次方 至 2的15次方-1
    char    16bit/2byte     \u0000~\uFFFF,unicode编码
    int     32bit/4byte     负2的31次方 至 2的31次方-1
    long    64bit/8byte     负2的63次方 至 2的63次方-1
    float   32bit/4byte     2的128次方-1
    double  64bit/8byte     2的1024次方-1
 */
public class Test {
    public static void main(String[] args) {
        char c = 'A';
        c = '1';
        c = '哦';
        c = '\u1068';
        c = '周';
        System.out.println(c);

    }
}
