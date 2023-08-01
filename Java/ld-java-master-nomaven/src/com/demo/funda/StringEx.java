package com.demo.funda;

public class StringEx {
    public static void main(String[] args) {
        String message = "well, Today is Monday!, it's a good day to learn";
//        String message = "Today is Monday!";
        boolean result = message.endsWith("!");
        System.out.println(result);

//       Explore these methods to get familiar with the API
        System.out.println(message.indexOf("well"));
//        System.out.println(message.indexOf("Monday"));
//        System.out.println(message.indexOf("M"));
        System.out.println(message.lastIndexOf("n"));
        System.out.println(message.length());
        System.out.println(message.substring(7,11));
        //Find out 5 string and implement them

        // Print only the characters from the String test by removing the special characters = "welcome$abc!1test";
    }
}
