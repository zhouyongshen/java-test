package com.zys.test.q11_20.q013;

/*
Q:是否可以从一个static方法内部发出对非static方法的调用？

A:不可以。因为非static方法是要与对象关联在一起的，必须创建一个对象后，才可以在该对象上进行方法调用，而static方法调用时不需要创建对象，可以直接调用。也就是说，当一个static方法被调用时，可能还没有创建任何实例对象，如果从一个static方法中发出对非static方法的调用，那个非static方法是关联到哪个对象上的呢？这个逻辑无法成立，所以，一个static方法内部不可以发出对非static方法的调用

 */
public class Test {

    public static void main(String[] args) {

    }
}
