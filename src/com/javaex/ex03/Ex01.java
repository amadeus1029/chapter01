package com.javaex.ex03;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner passTest = new Scanner(System.in);
        System.out.printf("점수: ");
        int score = passTest.nextInt();
        if(score>=60) {
            System.out.println("합격입니다");
        } else {
            System.out.println("불합격입니다");
        }

        passTest.close();
    }
}
