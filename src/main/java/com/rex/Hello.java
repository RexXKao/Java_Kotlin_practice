package com.rex;

public class Hello {
    public static void main(String[] args) {
//        System.out.println("Hello world");
        String s = "abcde";
        System.out.println(s.charAt(3));
        System.out.println(s.length());
        System.out.println(s.substring(1,4));
        Person p = new Person("rex",66.5f,1.7f);
        p.hello();
        System.out.println(p.weight);
        p.weight = 66.5f;
        p.height = 1.7f;
        System.out.println(p.bmi());
        int score = 88;
        System.out.println(score > 60 && score < 90);
        char c = 'A';
        System.out.println(c > 'a');

        /*int age = 19;
        Integer age2 = 19;
        char c ='i';
        Character c2 = 'A';
        byte b = 123; 8位元的有符號整數
        float weight = 66.5f;
        float height = 1.7f;
        boolean adult = true;
        boolean enroll = false;
        String name = "Rex";*/
//        double 是64位元的浮點樹類型
//        short/long 代表16位元和64位元的有符號整數
    }
}
