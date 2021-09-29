package com.geekyscript;

public class EmployeeDemo {
    public static void main(String[] args) {
        Employee name = new Employee();
        Employee name2 = new Employee();
        name.id = 1;
        name.name = "Ramesh Mandal";
        name.address = "Chabahil";
        name.salary = 2300;
        int salary1 = name.getSalary();
        System.out.println(" Salary: " + salary1);

        name2.id = 3;
        name2.name = "Chhatra Saudh";
        name2.address = "Chuchepati";
        name2.salary = 200;
        name.printDetail();
        name2.printDetail();
        int salary = name2.getSalary();
        System.out.println("Salary: " + salary);

    }
}
