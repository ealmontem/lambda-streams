package com.elvisalmonte.lambdas;
@FunctionalInterface
public interface Print {

    String nameUpperCase(String name);

    default String nameLowerCase(String name){
       return name.toLowerCase();
    };


}
