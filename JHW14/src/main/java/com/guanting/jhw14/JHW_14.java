package com.guanting.jhw14;

public class JHW_14 {
    public static void main(String[] args) {
    String str = "I $am 5a$ go68od#@$ st-ude[nt].";
    String strChange = "";

    int strlength = str.length();
    for (int i = 0; i < strlength; i++) {
        if (str.charAt(i) == (char) 46||str.charAt(i) == (char) 32 || str.charAt(i) > (char) 64 && str.charAt(i) < (char) 91 || str.charAt(i) > (char) 96 && str.charAt(i) < (char) 123) {
            strChange += str.charAt(i);
        }
    }
    System.out.println(strChange);
}
}
