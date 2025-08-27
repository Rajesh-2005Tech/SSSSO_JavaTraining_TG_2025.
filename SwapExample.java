//package com.sssso.training.exercises.y20250827;

public class SwapExample {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;

        System.out.println("Before Swapping:");
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        int temp = x; 
        x = y;         
        y = temp;      
        System.out.println("After Swapping:");
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}

