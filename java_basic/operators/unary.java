//--------------------- Unary + - +++ --- ! ~ -----------------------

package com.corejava.java_basic.operators;

public class Unary {
    public static void main(String[] args) {
        int a = 10, b = 20 ;
        //---------------- unary - & + -------------------
        System.out.println(+a);
        System.out.println(-b);
        
        //---------------- unary +++ -------------------
        System.out.println(a++);
        System.out.println(++a);
                
        //---------------- unary --- -------------------
        System.out.println(--b);
        System.out.println(b--);
        
        //---------------- unary ~ -------------------
        System.out.println(~a);
        System.out.println(~-b);
        
        //---------------- unary ! -------------------
        System.out.println(!(a>b));
        System.out.println(!(b>a));
    }
}
