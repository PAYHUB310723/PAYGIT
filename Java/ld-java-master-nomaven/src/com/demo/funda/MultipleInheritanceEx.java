package com.demo.funda;

public class MultipleInheritanceEx {
    public static void main(String[] args) {
        Child child = new Child();
        //java.lang.Object
        child.toString();
    }
}


class Father {

}
class Mother {

}

// No multiple inheriteance.
class Child extends Father {

}

class Test {

}
