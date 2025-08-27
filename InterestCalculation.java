//package com.sssso.training.exercises.y20250827;
public class InterestCalculation {
    public static void main(String[] args) {
        double principal = 20000;  
        double rate = 5;       
        int time = 3;        

        double simpleInterest = (principal * rate * time) / 100;
        double compoundInterest = principal * (Math.pow((1 + rate / 100), time)) - principal;
        System.out.println("Principal: " + principal);
        System.out.println("Rate of Interest: " + rate + "%");
        System.out.println("Time (years): " + time);
        System.out.println("Simple Interest: " + simpleInterest);
        System.out.println("Compound Interest: " + compoundInterest);
    }
}
