package com.company;

import java.nio.channels.ScatteringByteChannel;
import java.util.function.*;

public class Calculator {
    static Supplier<Calculator> instance = Calculator::new;


    BinaryOperator<Integer> plus = (a, b) -> a + b;
    BinaryOperator<Integer> minus = (a, b) -> a - b;
    BinaryOperator<Integer> multiply = (a, b) -> a * b;
    //BinaryOperator<Integer> devide = (a, b) -> a / b; возможно деление на ноль
    BinaryOperator<Integer> devide = (a, b) -> b == 0? 0 : a / b;// при делении на ноль будем выводить ноль



    UnaryOperator<Integer> pow = a -> a * a;
    UnaryOperator<Integer> abs = a -> a > 0 ? a : a * -1;

    Predicate<Integer> isPositive = a -> a > 0;

    Consumer<Integer> println = System.out::println;

}
