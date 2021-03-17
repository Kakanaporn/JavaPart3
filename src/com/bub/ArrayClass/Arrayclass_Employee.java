package com.bub.ArrayClass;

import com.bub.ooplab.Employee;

public class Arrayclass_Employee {
  public static void mainmain(String[] args) {
    Employee[] employees = new Employee[3];
    employees[0] = new Employee("Luke", "Skywalker", 24, 10000, "frontend");
    employees[1] = new Employee("Tony", "Stark", 24, 200000, "backend");

    System.out.println(employees[0].firstname);
    System.out.println(employees[1].firstname);
    System.out.println(employees[0].getSalary());
    System.out.println(employees[1].getSalary());
  }

}

