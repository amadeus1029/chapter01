package com.javaex.ex03;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner checkNumber = new Scanner(System.in);
        int obj = 3;
        System.out.printf("점수를 입력하세요: ");
        int numb = checkNumber.nextInt();
        if(numb%obj == 0) {
            System.out.println("3의 배수구먼");
        } else {
            System.out.println("3의 배수가 아니구먼");
        }

        checkNumber.close();
    }
}
