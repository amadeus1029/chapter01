package com.javaex.ex04;

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner noZero = new Scanner(System.in);
        System.out.println("숫자를 입력하세요. [0이면 종료]");
        int result= 0;
        int i;
        do {
            i = noZero.nextInt();
            result = result + i;
            System.out.println("합계: "+result);
        } while (i!=0);
        System.out.println("종료");
        noZero.close();
    }
}
