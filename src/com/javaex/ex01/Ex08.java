package com.javaex.ex01;

public class Ex08 {
    public static void main(String[] args) {
        //대입연산자
        double a = 7.4;
        int b = 2;

        //산술연산자
        System.out.println("산술연산자");
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);

        //부호연산자
        int c = -3;
        int pC = +c;
        int mC = -c;

        System.out.println("부호연산자");
        System.out.println(pC);
        System.out.println(mC);

        //증감연산자
        System.out.println("증감연산자");

        int n01 = 10;
        System.out.println(n01);
        int prePlusVal = ++n01;
        System.out.println(n01);
        System.out.println(prePlusVal);
        int preMinusVal = --n01;
        System.out.println(n01);
        System.out.println(preMinusVal);

        int n02 = 10;
        System.out.println(n02);
        int postPlusVal = n02++;
        System.out.println(n02);
        System.out.println(postPlusVal);
        int postMinusVal = n02--;
        System.out.println(n02);
        System.out.println("가나다"+postMinusVal);
        
    }
}
