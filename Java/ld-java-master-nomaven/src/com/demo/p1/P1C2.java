package com.demo.p1;

public class P1C2  {

    public void test(){
//     access private variable
        P1C1 p1C1 = new P1C1();
//        'privateVar' has private access in 'com.demo.p1.P1C1'
//        System.out.println(p1C1.privateVar);
//        p1C1.privateMethod();
        System.out.println(p1C1.defaultVar);
        p1C1.defaultMethod();
        System.out.println(p1C1.publicVar);
        p1C1.publicMethod();
        WhatIsTheAccess whatIsTheAccess = new WhatIsTheAccess();
        whatIsTheAccess.test();
    }
}