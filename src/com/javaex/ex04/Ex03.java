package com.javaex.ex04;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner nineNine = new Scanner(System.in);
        System.out.print("단을 입력해주세요\n단: ");
        int numb = nineNine.nextInt();
        for(int i=1;i<10;i++) {
            int result = numb * i;
            System.out.println(numb+" * "+i+" = "+result);
        }

        nineNine.close();
    }
}
