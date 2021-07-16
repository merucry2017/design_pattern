package com.example.demo;

public class ClientDemo {

    public static void main(String[] args) {
        Variables variables = new Variables();

        Variable x = new Variable();
        Variable y = new Variable();
        Variable z = new Variable();

        variables.put(x, 10);
        variables.put(y, 20);
        variables.put(z, 30);
        /**
         * 计算x * (y + z / x) - x
         */
        ArithmeticExpression expression =
                new Subtract(
                        new Multiply(x,
                                new Plus(
                                    y, new Division(z, x)
                        )),x
                );
        System.out.println(expression.interpret(variables));
    }
}
