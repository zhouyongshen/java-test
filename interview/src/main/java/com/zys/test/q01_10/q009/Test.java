package com.zys.test.q01_10.q009;

/*
    Q:请设计一个一百亿的计算器
    A:
    首先要明白这道题目的考查点是什么，
    一是大家首先要对计算机原理的底层细节要清楚、
    要知道加减法的位运算原理和知道计算机中的算术运算会发生越界的情况，
    二是要具备一定的面向对象的设计思想。

    首先，计算机中用固定数量的几个字节来存储的数值，
    所以计算机中能够表示的数值是有一定的范围的，
    为了便于讲解和理解，我们先以byte 类型的整数为例，
    它用1个字节进行存储，表示的最大数值范围为-128到+127。
    -1在内存中对应的二进制数据为11111111，
    如果两个-1相加，不考虑Java运算时的类型提升，
    运算后会产生进位，二进制结果为1,11111110，
    由于进位后超过了byte类型的存储空间，所以进位部分被舍弃，
    即最终的结果为11111110，也就是-2，
    这正好利用溢位的方式实现了负数的运算。
    -128在内存中对应的二进制数据为10000000，
    如果两个-128相加，不考虑Java运算时的类型提升，
    运算后会产生进位，二进制结果为1,00000000，
    由于进位后超过了byte类型的存储空间，所以进位部分被舍弃，
    即最终的结果为00000000，也就是0，这样的结果显然不是我们期望的，
    这说明计算机中的算术运算是会发生越界情况的，
    两个数值的运算结果不能超过计算机中的该类型的数值范围。
 */
public class Test {
    public static void main(String[] args) {
        // 参见： java.math.BigInteger
    }
}

class BigInteger {
    int sign;
    byte[] val;

    public BigInteger(String val) {

    }

    public BigInteger add(BigInteger another) {
        return null;
    }

    public BigInteger subtract(BigInteger another) {
        return null;
    }

    public BigInteger multiply(BigInteger another) {
        return null;
    }

    public BigInteger divide(BigInteger another) {
        return null;
    }
}
