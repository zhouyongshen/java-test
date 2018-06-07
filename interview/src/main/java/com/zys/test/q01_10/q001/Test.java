package com.zys.test.q01_10.q001;

import com.zys.test.q01_10.q001.pack.Test4;

/**
 * Q:一个".java"源文件中是否可以包括多个类（不是内部类）？有什么限制？
 * A: 可以有多个类，但只能有一个public的类，并且public的类名必须与文件名相一致。
 *
 * ps:
      访问权限   类   包  子类  其他包

     public     ∨   ∨   ∨     ∨

     protect    ∨   ∨   ∨     ×

     default    ∨   ∨   ×     ×

     private    ∨   ×   ×     ×


 */
public class Test {
    public Test test1;
    public Test2 test2;
    public Test3 test3;
    public Test4 test4;
//    public Test5 test5;
    public Test6 test6;
    public Test7 test7;
//    public Test8 test8;
//    public Test9 test9;
//    public Test10 test10;
//    public Test11 test11;
//    public Test12 test12;

   public static class Test6 {

    }
    static class Test7 {
    }
}

class Test2 {
}




