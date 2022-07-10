package com.neotech.Lesson18;

public class LocalVariables {
	public static void main(String[] args) {
        // System.out.println(name);
        LocalVariables obj1 = new LocalVariables();
        obj1.method1();
        boolean flag = true;
        if (flag) {
            String answer = "Yes";
            System.out.println(answer);
            System.out.println(flag);
        }
        System.out.println(flag);
        // The scope/lifetime of answer is only inside the if block
        // System.out.println(answer);
        System.out.println("----------------");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }
        // Cannot access "i" outside of for loop
        // System.out.println(i);
        System.out.println("----------------");
        int x;
        for (x = 1; x <= 5; x++) {
            System.out.println(x);
        }
        // We can access "x" outside of for loop
        // because we declared "x" outside of for loop
        System.out.println(x);
        String name = "Sedat";
        System.out.println(name);
    }
    void method1() {
        // local variables are only visible within the method
        String name = "Ozer";
        int age = 28;
        System.out.println(name);
        System.out.println(age);
    }
    void method2() {
        String name = "Parviz";
        System.out.println(name);
        // Compile Error, saying I don't see variable age
        // System.out.println(age);
    }
}
