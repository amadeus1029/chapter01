package com.javaex.ex01;

public class Ex06 {
    public static void main(String[] args) {
        int num1 = 1;
        float num2 = 1.0F;

        float result = num1 + num2; //int로 쓰면 에러난다잉
        System.out.println(result);

        float var01 = 12.5F;
        int var02 = (int)var01; //강제 타입변환
        int var03 = (int)12.5;  //위와 마찬가지

        System.out.println(var02);
        System.out.println(var03);

        //정상 축소변환
        int iValue01 = 10;
        byte bValue01 = (byte)iValue01;

        System.out.println(bValue01);

        //비정상 축소변환
        int iValue02 = 2923123;
        byte bValue02 = (byte)iValue02;

        System.out.println(bValue02);

        //이런것도 되나?
        double dValue01 = 1239.232183821321;
        int iValue03 = 1234;

        float result03 = (int)dValue01+iValue03; //형변환 선언 안해주면 안됨 ㅋㅋ

        System.out.println(result03);


    }
}
