package LambdaCalcTask1;

public class Main {
    public static void main(String [] args) {
        Calculator calc = Calculator.instance.get();
/* что находится в calc - создаётся объект, т.к. instance - это ссылка на дефолтный конструктор класса Calculator
* и видимо при вызове конструктора, создаётся объект. */
        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1, 1);
        int c = calc.devide.apply(a, b); // если второй аргумент будет равен "0", то лямда выполнится с Exception
        calc.println.accept(c);
    }
}
