package access;

// private is only in this file, public is everywhere accessible
// default access modifier (when you don't specify any thing) --> In same package it accessible bot not in different package
public class A {
    protected int num;
    String name;
    int[] arr;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public A (int num, String name) {
        this.num = num;
        this.name = name;
        this.arr = new int[num];
    }
}
