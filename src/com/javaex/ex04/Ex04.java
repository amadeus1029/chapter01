package com.javaex.ex04;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        //1부터 특정 숫자까지 합을 구하기
        Scanner plusToNum = new Scanner(System.in);
        System.out.print("숫자를 입력하세요: ");
        int num = plusToNum.nextInt();
        int result = 0;
        for(int i=1;i<=num;i++) {
            result = result + i;
        }
        System.out.println("1부터 "+num+"까지의 정수의 합은 "+result+" 입니다.");
    }
}
