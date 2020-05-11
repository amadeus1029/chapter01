package com.javaex.ex01;

public class Ex05 {
    public static void main(String[] args) {
        final double PI = 3.14; // 상수를 선언할 때는 이름을 대문자로 써준대요
        double result01 = 5*5*PI;
        System.out.println(result01);

        /*PI = 3.141592; 상수로 선언한 것이기 때문에 에러 발생*/
        double result02 = 5*5*PI;
        System.out.println(result02);
    }
}
