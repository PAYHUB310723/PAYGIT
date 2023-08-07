package demo.funda;

import java.sql.SQLOutput;
import java.util.Arrays;

public class CLIArguments {
    public static void main(String[] args) {
        for(String string : args){
            System.out.println(string);
        }
        System.out.println("******************");
        Arrays.asList(args).forEach(System.out::println);
    }
}
