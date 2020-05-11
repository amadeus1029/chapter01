package com.javaex.ex03;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner checkYourGrade = new Scanner(System.in);
        System.out.printf("점수를 입력하세요: ");
        char grade;
        int score = checkYourGrade.nextInt();
        if(score>=90) {
            grade = 'A';
        } else if(score>=80) {
            grade = 'B';
        } else if(score>=70) {
            grade = 'C';
        } else if(score>=60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        System.out.println(grade+"등급");

        checkYourGrade.close();
    }
}
