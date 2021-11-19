package com.codewithmosh;

public class Main {

    public static void main(String[] args) {
        var employee = new Employee(50_000, 20);
        Employee.printNumberOfEmployees();
        int wage = employee.calculateWage();
        System.out.println(wage);
        var employee2 = new Employee(100_000, 20);
        Employee.printNumberOfEmployees();
        int wage2 = employee2.calculateWage();
        System.out.println(wage2);
    }
}
