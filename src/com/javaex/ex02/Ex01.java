package com.javaex.ex02;

public class Ex01 {
    public static void main(String[] args) {
        int i = 2345;
        double d = 3.14;
        String str = "굿모닝";
        char c = '한';
        String s = "한";
        String name = "이웅희";

        System.out.println("안녕하세요");
        System.out.println(name);
        System.out.println("name");
        System.out.print("안녕");
        System.out.print("허슈");
        System.out.println(str);
        System.out.println(str+str);
        System.out.println(c); //문자로 나옴
        System.out.println(c+c); //숫자로 바뀜
        System.out.println(s+s);
        System.out.println(i+d);
        System.out.println(i+c); //숫자로 바뀜
        System.out.println(i+str);
        System.out.println(c+str);
        System.out.println(d+str);
    }
}
