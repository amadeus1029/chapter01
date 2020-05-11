package com.javaex.ex04;

public class Ex08 {
    public static void main(String[] args) {
        //6의 베수이자 14의 배수인 가장 작은 정수 찾기
        int i = 1;
        while(true) {
            if(i%6==0&&i%14==0) {
                System.out.println(i);
                break;
            }
            i++;
        }
    }
}
