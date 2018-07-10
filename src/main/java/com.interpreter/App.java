package com.interpreter;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {

    private static int pointer = 0;
    private static int length = 65535;
    private static byte memory[] = new byte[length];

    private static void brainFuck(String s){

        //read characters
        for (int i=0; i<s.length(); i++){

            switch (s.charAt(i)){
                case '+':
                    break;
                case '-':
                    break;
                case '>':
                    break;
                case '<':
                    break;
                case '.':
                    break;
                case ',':
                    break;
                case '[':
                    break;
                case ']':
                    break;
            }

        }
    }

    public static void main( String[] args ){
        System.out.println(">>>");
        Scanner scanner = new Scanner(System.in);
        String code = scanner.nextLine();
        brainFuck(code);
    }
}
