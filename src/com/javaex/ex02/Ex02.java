package com.javaex.ex02;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner scInfo = new Scanner(System.in);

        System.out.println("이름을 입력해주세요");
        System.out.print("이름: ");
        String scName = scInfo.nextLine();
        System.out.println("나이를 입력해주세요");
        System.out.print("나이: ");
        int scAge = scInfo.nextInt();
        System.out.println("생년월일을 입력해주세요");
        System.out.print("출생년도: ");
        int scYear = scInfo.nextInt();
        System.out.print("출생월: ");
        int scMonth = scInfo.nextInt();
        System.out.print("출생일: ");
        int scDay = scInfo.nextInt();
        System.out.println("키도 좀 입력해봐라");
        System.out.print("키: ");
        double scHeight = scInfo.nextDouble();
        System.out.println("당신의 이름은 "+scName+", 나이는 "+scAge+"살이며 "+"출생일자는 "+scYear+"년 "+scMonth+"월 "+scDay+"일 입니다."+" 키는 "+scHeight+"cm군요.");
        scInfo.close();
    }
}
