package com.demo.funda;

public class DataTypesEx {
    public static void main(String[] args) {
//       primitives only hold values
        byte age = 100;
        System.out.println(age);

//        abstract data type (user-defined) can hold values for multiple primitive types
//        can hold functionality
        Learner javaLearner;
        javaLearner = new Learner();
        byte id = javaLearner.id;
        System.out.println(id);
        javaLearner.print();

//        abstract type : system defined
        String name = new String();
        name = "Sam";
        System.out.println(name);
    }
}


// hold values and functionality (class)
class Learner {
    byte id = 1;
    void print() {
        System.out.println(id);
    }
}


// syntax
//<type><variable>=value
//byte age = 10 // literal
//Learner javaLearner = new Learner(); //instance