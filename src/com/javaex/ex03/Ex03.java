package com.javaex.ex03;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner countSalary = new Scanner(System.in);
        int money = 10000;
        int time,salary;

        System.out.printf("근무시간을 입력하세요: ");
        time = countSalary.nextInt();
        if(time<=8) {
            salary = time * money;
        } else {
            salary = (8 * money) + ((time-8)*(int)(money*1.5));
        }
        System.out.println(salary);

        countSalary.close();
    }
}
