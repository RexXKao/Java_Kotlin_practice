package com.rex;

public class Hello {
    public static void main(String[] args) {
//        System.out.println("Hello world");
        Person p = new Person("rex",66.5f,1.7f);
        p.hello();
        System.out.println(p.weight);
        p.weight = 66.5f;
        p.height = 1.7f;
        System.out.println(p.bmi());
        /*int age = 19;
        Integer age2 = 19;
        char c ='i';
        Character c2 = 'A';
        byte b = 123;
        float weight = 66.5f;
        float height = 1.7f;
        boolean adult = true;
        boolean enroll = false;
        String name = "Rex";*/
    }
}
