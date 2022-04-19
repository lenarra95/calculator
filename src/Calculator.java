import java.util.function.*;

import static java.lang.System.out;

public class Calculator {
    static Supplier<Calculator> instance = Calculator::new;

    BinaryOperator<Integer> plus = (x, y) -> x + y;
    BinaryOperator<Integer> minus = (x, y) -> x - y;
    BinaryOperator<Integer> multiply = (x, y) -> x * y;
    BinaryOperator<Integer> divide = (x, y) -> x / y;

    UnaryOperator<Integer> pow = x -> x * x;
    UnaryOperator<Integer> ads = x -> x > 0 ? x : x * - 1;

    Predicate<Integer> isPositive = x -> x > 0;

    Consumer<Integer> printLn = out::println;
}
