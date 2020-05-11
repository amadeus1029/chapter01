package com.javaex.ex03;

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Scanner monthAndDay = new Scanner(System.in);
        System.out.println("월을 입력하세요");
        int month = monthAndDay.nextInt();
        String day;

        switch (month) {
            case 2:
                day = "28일";
                break;
            case 4: case 6: case 9: case 11:
                day = "30일";
                break;
            default:
                day = "31일";
        }
        System.out.println(day+" 입니다.");

        monthAndDay.close();
    }
}
