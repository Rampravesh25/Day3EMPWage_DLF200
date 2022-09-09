package com.bridgelabz;

public class EmpWage {
    public static void main(String[] args) {
        System.out.println("Welcome Employees");
        int fullTime = 1;
        double check = Math.floor(Math.random() * 10) % 2;
        if (check == fullTime) {
            System.out.println("Emp is Present");
        } else {
            System.out.println("Emp is not Present");
        }

    }
}
