package sample;

public class Calculator {
    public int add(int x, int y) {
        return x + y;
    }

    public int substract(int x, int y) {
        return x - y;
    }

    public int multiply(int x, int y) {
        return x * y;
    }

    public int divide(int x, int y) {
        if (y != 0)
            return x / y;
        else
            return 0;
    }

    public int modulo(int x, int y) {
        if (y != 0)
            return x % y;
        else
            return 0;
    }
}
