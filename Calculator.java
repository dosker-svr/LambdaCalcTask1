package LambdaCalcTask1;

import java.util.function.*;

public class Calculator {
    static Supplier<Calculator> instance = Calculator::new; // что тут происходит?
    // instance - это ссылка на дефолтный конструктор класса Calculator

    BinaryOperator<Integer> plus = (x, y) -> x + y;
    BinaryOperator<Integer> minus = (x, y) -> x - y;
    BinaryOperator<Integer> multiply = (x, y) -> x * y;
    BinaryOperator<Integer> devide = (x, y) -> y == 0 ? 0 : x / y; // если второй аргумент будет равен "0", то лямда выполнится с Exception

    UnaryOperator<Integer> pow = x -> x * x;
    UnaryOperator<Integer> abs = x -> x > 0 ? x : x * -1;

    Predicate<Integer> isPositive = x -> x > 0;

    Consumer<Integer> println = System.out::println; //
}
