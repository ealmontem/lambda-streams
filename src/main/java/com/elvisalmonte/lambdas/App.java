package com.elvisalmonte.lambdas;

public class App {
    public static void main(String[] args) {

        Print uppercase = String::toUpperCase;
        System.out.println(uppercase.nameUpperCase("Elvis"));
        Print lower = a ->a;
        System.out.println(lower.nameLowerCase("JUAN"));




//       Math substract = new Math() {
//           @Override
//           public Double excecute(Double a, Double b) {
//               return a * b;
//           }
//       };


//        Math substract = (a,b)-> a - b;
//        Math suma = (a,b) -> a * b;
//        Math divisible = (a,b) -> {
//            System.out.println("Div:");
//            return a / b;
//        };
//
//        //
//
//        System.out.println(divisible.div(2.0,2.0));
//        System.out.println(suma.sum(2.0,2.0));
//        System.out.println(substract.excecute(2.0,2.0));
//
//       // System.out.println(substract.excecute(3.0,2.0));



    }

}
