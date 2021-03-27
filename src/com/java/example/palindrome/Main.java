package com.java.example.palindrome;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input string");
        String word = sc.nextLine();
        String mWord = word.toLowerCase(Locale.ROOT);
        String nWord = mWord.replaceAll(" ","");
        String rev = "";

        int len = nWord.length();
        for (int i = len -1; i>=0;i--){
            rev += nWord.charAt(i);

        }
        System.out.println(rev);

        if (nWord.equals(rev)){
            System.out.println(word + " is Palindrome String");
        }
        else {
            System.out.println(word + " is not Palindrome String");
        }







    }
}
