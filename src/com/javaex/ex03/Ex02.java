package com.javaex.ex03;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner countMoney = new Scanner(System.in);
        System.out.printf("근무시간을 입력하세요: ");
        int workTime = countMoney.nextInt();
        int salary;
        if(workTime<=8) {
            salary = workTime*8;
        } else {
            salary = (8*10000)+((workTime-8)*12000);
        }
        System.out.println(salary);

        countMoney.close();
    }
}
