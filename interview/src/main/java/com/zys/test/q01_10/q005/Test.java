package com.zys.test.q01_10.q005;

/*
Q:switch语句能否作用在byte上，能否作用在long上，能否作用在String上?
A:在switch（expr1）中，expr1只能是一个整数表达式或者枚举常量（更大字体），整数表达式可以是int基本类型或Integer包装类型，由于，byte,short,char都可以隐含转换为int，所以，这些类型以及这些类型的包装类型也是可以的。显然，long和String类型都不符合switch的语法规定，并且不能被隐式转换成int类型，所以，它们不能作用于swtich语句中。
 */
public class Test {

    public static void main(String[] args) {
        int a = 1;
        switch (a) {
            case 1:
                System.out.println(1);
                break;
            case 2:
                System.out.println(2);
                break;
            default:
                System.out.println("not find");
        }
//        String s = "1";
//        switch (s) {
//            case "1":
//                System.out.println(1);
//            case "2":
//                System.out.println(2);
//            default:
//                System.out.println("not find");
//        }
        MyEnum e = MyEnum.A;
        switch (e) {
            case A:
                System.out.println(1);
                break;
            case B:
                System.out.println(2);
                break;
            default:
                System.out.println("not find");
        }
        MyEnum2 e2 = MyEnum2.A;
        switch (e2) {
            case A:
                System.out.println(1);
                break;
            case B:
                System.out.println(2);
                break;
            default:
                System.out.println("not find");
        }


    }

    enum MyEnum {
        A, B
    }

    enum MyEnum2 {
        A, B
    }
}

