package com.interpreter;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {

    private static int ptr;
    private static int length = 65535;
    private static byte memory[] = new byte[length];

    private static void brainfuck(String s){

    }

    public static void main( String[] args ){
        System.out.println(">>>");
        Scanner scanner = new Scanner(System.in);
        String code = scanner.nextLine();
        System.out.println(code);
    }
}
