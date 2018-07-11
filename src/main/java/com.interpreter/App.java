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

    private static void brainFuck(String s, Scanner scanner){

        int c = 0;
        //read characters
        for (int i=0; i<s.length(); i++){

            switch (s.charAt(i)){
                case '+':
                    memory[pointer] ++;
                    break;
                case '-':
                    memory[pointer] --;
                    break;
                case '>':
                    pointer ++;
                    break;
                case '<':
                    pointer --;
                    break;
                case '.':
                    System.out.println((char)memory[pointer]);
                    break;
                case ',':
                    memory[pointer] = (byte)(scanner.next().charAt(0));
                    break;
                case '[':
                    i++;
                    while (c > 0 || s.charAt(i) != '[') {
                        if(s.charAt(i) == ']'){
                            c++;
                        }else if(s.charAt(i) == '['){
                            c--;
                        }
                        i--;
                    }
                    i--;
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
        brainFuck(code, scanner);
    }
}
