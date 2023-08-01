package p1.p1sub;

import p1.P1C1;

//public class P1SUBC1 extends P1C1 {
public class P1SUBC1  {
    public void test(){
        P1C1 p1C1 = new P1C1();
//        'privateVar' has private access in 'p1.P1C1'
//        System.out.println(p1C1.privateVar);
//        p1C1.privateMethod();
//        System.out.println(protectedVar);
//        System.out.println(protectedMethod());
        System.out.println(p1C1.publicVar);
        p1C1.publicMethod();
    }
}
