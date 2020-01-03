package com.guanting.jhw2;


import java.util.Scanner;

public class JHW_2 {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("輸入英文字母:");
        String string = scanner.next();
        for(int i=string.length();i>0;i--){
            System.out.print(string.charAt(i-1));
        }
    }
}
