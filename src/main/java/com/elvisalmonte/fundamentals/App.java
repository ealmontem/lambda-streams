package com.elvisalmonte.fundamentals;

public class App {
    public static void main(String[] args) {

       ProductDB productDB = new ProductDB();
       EmployeeDB employee = new EmployeeDB();
       productDB.getById(2L);
       employee.getById(1L);
       System.out.println(productDB.getById(2L));
        System.out.println(employee.getById(1L));

    }
}
