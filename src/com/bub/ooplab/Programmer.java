package com.bub.ooplab;

public class Programmer extends Employee {

  public Programmer(String firstnameInput, String lastnameIput, int ageInput, int salaryInput,
      String positionInput) {
    super(firstnameInput, lastnameIput, ageInput, salaryInput, positionInput);
    // TODO Auto-generated constructor stub
  }

  public Programmer() {
    this("Anonymous", "Anonymous", 25, 9000, "Backend");
  }


  public void createWebsite(String template, String titleName) {
    System.out.println("Web " + titleName + ", Template: " + template);
  }

  public void installWindows(String version, String productKey) {
    System.out.println("Windows ver. " + version + ", Key: " + productKey);
  }

  public static void main(String[] args) {

    Programmer programmer = new Programmer();
    programmer.work();
    System.out.println(programmer.getSalary());
  }

}
