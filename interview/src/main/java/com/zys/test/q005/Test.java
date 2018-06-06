package com.zys.test.q005;

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
    enum MyEnum{
        A,B
    }
    enum MyEnum2{
        A,B
    }
}

