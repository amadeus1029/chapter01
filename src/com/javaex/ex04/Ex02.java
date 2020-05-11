package com.javaex.ex04;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner nineNine = new Scanner(System.in);
        System.out.print("단을 입력해주세요\n단: ");
        int numb = nineNine.nextInt();
        int i = 1;
        while(i<10) {
            int result = numb * i;
            System.out.println(numb+" * "+i+" = "+result);
            i++;
        }

        nineNine.close();
    }
}
