package com.javaex.ex03;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner checkNumType = new Scanner(System.in);
        System.out.printf("숫자를 입력하세요\n숫자: ");
        int number = checkNumType.nextInt();
        String numType;

        if(number >= 0) {
            if(number == 0) {
                numType = "0";
            } else {
                if(number%2 == 0) {
                    numType = "짝수";
                } else {
                    numType = "홀수";
                }
            }
        } else {
            numType = "음수";
        }
        System.out.println(numType+"입니다.");

        checkNumType.close();
    }
}
