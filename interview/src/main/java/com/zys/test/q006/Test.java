package com.zys.test.q006;

/*
Q:short s1 = 1; s1 = s1 + 1;有什么错? short s1 = 1; s1 += 1;有什么错?
A:
    对于short s1 = 1; s1 = s1 + 1; 由于s1+1运算时会自动提升表达式的类型，所以结果是int型，再赋值给short类型s1时，编译器将报告需要强制转换类型的错误。
    对于short s1 = 1; s1 += 1;由于 += 是java语言规定的运算符，java编译器会对它进行特殊处理，因此可以正确编译。

 */
public class Test {
    public static void main(String[] args) {
        short s1 = 1;
//        s1 = s1 + 1;
        s1 += 1;
        System.out.println(s1);
    }
}
