package com.guanting.jhw5;

import java.util.Scanner;

public class JHW_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        part conversion = new part();
        conversion.DecimalConversion();
        conversion.BinaryConversion();
        conversion.HexadecimalConversion();
    }
}
