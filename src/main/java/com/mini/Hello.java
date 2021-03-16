package com.mini;

public class Hello {
    String id;
    String name;
    int english;
    int math;
    public Hello(){
        super();
    }
    public Hello(String id,String name,int english,int math){
        this.id = id;
        this.name = name;
        this.english = english;
        this.math = math;
    }
    public void print(){
        System.out.print(id + "\t"+name+"\t"+english+"\t"+math+"\t"+(math+english)/2);
    }
}
