package p2;

import p1.P1C1;
import p1.WhatIsTheAccess;

public class P2C1 {
    public void test(){
//     access private variable
        P1C1 p1C1 = new P1C1();
//        'privateVar' has private access in 'p1.P1C1'
//        System.out.println(p1C1.privateVar);
//        p1C1.privateMethod();
//        System.out.println(p1C1.defaultVar);
//        p1C1.defaultMethod();
//        System.out.println(p1C1.protectedVar);
//        p1C1.protectedVar();
//        System.out.println(protectedVar);
//        protectedMethod();
        System.out.println(p1C1.publicVar);
        p1C1.publicMethod();
        WhatIsTheAccess whatIsTheAccess = new WhatIsTheAccess();
        whatIsTheAccess.test();
    }
}


