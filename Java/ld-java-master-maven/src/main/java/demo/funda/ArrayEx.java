package demo.funda;

import java.util.Arrays;
//IP STORE DAYS OF A WEEK IN AN ARRAY AND PRINT THEM
public class ArrayEx {
    public static void main(String[] args) {
        primitiveArray();
//        referenceArray();

        //Wrapper class
        int test = 100;
        String convertedString = "converted"+test;
        System.out.println(convertedString);
        Integer wrappedInt = new Integer(test);
        String convertedString1 = wrappedInt.toString();
        System.out.println(convertedString1);
        String converted = String.valueOf(wrappedInt);
        System.out.println(converted);

        //Object, String, Integer, Number, Prmitives, Abstract(Reference).
    }

    private static void referenceArray() {
        Number [] numbers = new Number[3];
//        boxing - conversion of primitive types into wrapper
        byte age = 50;
//        Byte is a number type (Byte extends Number)
        numbers[0] = new Byte(age);
        int salary = 75000;
        // implicit conversion of primitive to reference (wrapper)
//        implicit boxing
        numbers[1] =salary;
        float tax = 50.55f;
        numbers[2] = tax;
        for (Number number: numbers
             ) {
            System.out.println(number);
        }

        // reference to primitive type // unboxing
        Integer integerVar = 500;
        int intNumber = integerVar;
//        java.lang.ArrayIndexOutOfBoundsException: 3
        numbers[3] = 50;
    }

    private static void primitiveArray() {
        //        Arrays : linear, homogenous, fixed
        int numbers[] = {343,24,23,34};
        numbers[1] = 5000;
//        numbers[1] = "50";
//        numbers[1] = 50.50f;
        for(int i = 0; i< numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        Arrays.sort(numbers);
        for(int i = 0; i< numbers.length; i++) {
            System.out.println(numbers[i]);
        }
//        enhanced for loop
        for(int number : numbers) {
            System.out.print(number + "\t");
        }
        System.out.println();
//
    }
}
