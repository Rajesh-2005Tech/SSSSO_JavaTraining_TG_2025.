//package com.sssso.training.exercises.y20250827;
public class RemainderExe2{
    public static void main(String[] args) {

        int number = 15;
        int remainder = number % 2;
        System.out.println("Number: " + number);
        System.out.println("Remainder when divided by 2: " + remainder);
        if (remainder == 0) {
            System.out.println(number + " is Even");
        } else {
            System.out.println(number + " is Odd");
        }
    }
}
