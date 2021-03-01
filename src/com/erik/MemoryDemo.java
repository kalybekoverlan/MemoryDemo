package com.erik;

public class MemoryDemo {

    public static void main(String[] args) {
        Runtime rt= Runtime.getRuntime();
        long m1,m2;
        MyInteger someint[]=new MyInteger[1000];

        System.out.println("Max memory : "+rt.maxMemory());
        System.out.println("Total memory : "+rt.totalMemory());
        rt.gc();
        m1=rt.freeMemory();
        System.out.println("Free memory : "+m1);
        for(int i=0;i<someint.length;i++){
            someint[i]=new MyInteger(i);
        }
        m2=rt.freeMemory();
        System.out.println("Free memory after allocation  : "+m2);
        System.out.println("m1-m2  : "+(m1-m2) );
        rt.gc();
        System.out.println("Free memory after: "+rt.freeMemory() );
    }
}
