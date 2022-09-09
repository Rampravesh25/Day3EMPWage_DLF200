package com.bridgelabz;

public class EmpWage {
    public static void main(String[] args) {
        System.out.println("Welcome Employees");
        int fullTime = 1;
        int perHoursWage = 20;

        double check = Math.floor(Math.random() * 10) % 2;
        if (check == fullTime) {
            System.out.println("Emp is Present");
            int Hrs = 8;
            int salary = perHoursWage * Hrs;
            System.out.println("Salary in Amount:  " + salary);
        } else {
            System.out.println("Emp is not Present");
            int Hrs = 0;
            int salary = perHoursWage * Hrs;
            System.out.println("   " + salary);
        }


    }
}
