package com.elvisalmonte.fundamentals;

public class App {
    public static void main(String[] args) {
        DataBaseService mongo = new MongoDB();
        DataBaseService postgres = new PostgresDB();
        System.out.println(mongo.getById(1L));
        System.out.println(mongo.getAllProducts());
        System.out.println(postgres.getById(2L));
        System.out.println(postgres.getAllProducts());
    }
}
