package com.elvisalmonte.lambdas;

public class App {
    public static void main(String[] args) {
       Math substract = new Math() {
           @Override
           public Double excecute(Double a, Double b) {
               return a * b;
           }
       };


        Math suma = (a,b) -> a * b;
        Math divisible = (a,b) -> {
            System.out.println("Div:");
            return a / b;
        };
        //

        System.out.println(divisible.div(2.0,2.0));
        System.out.println(suma.sum(2.0,2.0));
        System.out.println(substract.excecute(3.0,2.0));



    }

}
