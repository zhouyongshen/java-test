package com.zys.test.q01_10.q004;

/*
Q:在JAVA中如何跳出当前的多重嵌套循环？
A:在Java中，要想跳出多重循环，可以在外面的循环语句前定义一个标号，然后在里层循环体的代码中使用带有标号的break 语句，即可跳出外层循环。
 */
public class Test {
    public static void main(String[] args) {

        ok:
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.println("i =" + i + ",j =" + j);
                if (j == 3) continue ok;
            }
        }
    }
}
