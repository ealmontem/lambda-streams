package com.elvisalmonte.fundamentals;

import java.util.List;

public class App {
    public static void main(String[] args) {

        System.out.println(Employee.class.getName());
        System.out.println(Product.class.getName());

        DataBaseService<String> dbAnonimo = new DataBaseService<String>() {
            @Override
            public String getById(Long id) {
                return "";
            }

            @Override
            public List<String> getAllProducts() {
                return List.of();
            }
        };


        System.out.println(dbAnonimo.getClass().getName());

    }
}
