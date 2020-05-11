package com.javaex.ex04;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        //입력한 줄 갯수만큼 별표 뽑기
        Scanner makeStar = new Scanner(System.in);
        System.out.print("줄을 입력하세요: ");
        int line = makeStar.nextInt();
        for(int i=0;i<line;i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        makeStar.close();
    }
}
