package Homework_Employee;

public class Main {

    public static void main(String[] args) {


        Employee albina = new Employee("Albina", 500, 6);

        System.out.println("Employee's name is: "+albina.getName()); // Employee's name is: Albina
        System.out.println("Employee's salary is: "+albina.getSalary()); // Employee's salary is: 500
        System.out.println("Employee's workHour is: "+albina.getWorkHour()); //Employee's workHour is: 6


        System.out.println(albina.addSalary()); //  500
        System.out.println(albina.addForWork()); // 500
        System.out.println("--------------------------------------------------------");

        Employee john = new Employee("John", 450, 8);

        System.out.println("Employee's name is: "+john.getName()); // Employee's name is: John
        System.out.println("Employee's salary is: "+john.getSalary()); // Employee's salary is: 450
        System.out.println("Employee's workHour is: "+john.getWorkHour()); // Employee's workHour is: 8


        System.out.println(john.addSalary()); //  460
        System.out.println(john.addForWork()); // 465





    }

}
