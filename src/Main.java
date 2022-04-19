import static java.lang.System.out;

public class Main {
    public static void main (String[] args) {
        Calculator calculator = Calculator.instance.get();
        int a = calculator.plus.apply(1, 2);
        int b = calculator.minus.apply(1, 1);
//      calculator.divide.apply(a, b); // Не выполниться, деление на ноль невозможно
        calculator.printLn.accept(a);
        calculator.printLn.accept(b);
        try { // рабочий вариант
            calculator.printLn.accept(calculator.divide.apply(a, b));
        } catch (ArithmeticException e) {
            out.println("Деление на 0 запрещено");
        }
    }
}