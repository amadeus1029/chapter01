package com.javaex.ex03;

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner roomNum = new Scanner(System.in);
        System.out.printf("과목을 선택하세요\n(1.자바 2.C 3.C++ 4.파이썬)\n과목번호: ");
        int codeNum = roomNum.nextInt();
        String room;
        switch(codeNum) {
            case 1 :
                room = "R101호";
                break;
            case 2 :
                room = "R202호";
                break;
            case 3 :
                room = "R303호";
                break;
            case 4 :
                room = "R404호";
                break;
            default:
                room = "상담원에게 문의하세요";
        }
        System.out.println(room);

        roomNum.close();

    }
}
