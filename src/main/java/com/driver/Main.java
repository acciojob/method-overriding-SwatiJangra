package com.driver;

public class Main {
    public static void main(String[] args) {
        B b=new B();
        b.meth();
    }
}
class A {
    public void meth() {
        System.out.println("Invoking method from class A");
        return;
    }

}
class B extends A {
    public void meth() {
        System.out.println("Method is overridden in Extendend class B");
        return;
    }
}