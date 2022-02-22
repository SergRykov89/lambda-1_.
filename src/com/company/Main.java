package com.company;

public class Main {

    public static void main(String[] args) {
        Calculator calk = Calculator.instance.get();

        int a = calk.plus.apply(5, 23);
        int b = calk.multiply.apply(25, 7);
        int c = calk.pow.apply(9);
        int d = calk.devide.apply(25, 0);



        calk.println.accept(d);

    }
}
