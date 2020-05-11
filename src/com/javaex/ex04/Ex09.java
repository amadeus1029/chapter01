package com.javaex.ex04;

import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        Scanner checkMultiple = new Scanner(System.in);
        while(true) {
            System.out.println("숫자를 입력하세요.");
            int num = checkMultiple.nextInt();
            if(num == 0) {
                System.out.println("종료");
                break;
            } else if (num<0) {
                System.out.println("0이상의 값을 입력해주세요");
            } else {
                if(num%3 == 0) {
                    System.out.println("3의 배수입니다.");
                } else {
                    System.out.println("3의 배수가 아닙니다.");
                }
            }
        }
        checkMultiple.close();
    }
}
