//package com.sssso.training.exercises.y20250827;
public class CompoundAssignmentExample {
    public static void main(String[] args) {
        // Declare and initialize variable
        int num = 20;

        System.out.println("Initial value: " + num);
        num += 5;   
        num -= 3;   
        num *= 2;   
        num /= 4;  
        num %= 3;  
        System.out.println("Final result after compound operations: " + num);
    }
}
