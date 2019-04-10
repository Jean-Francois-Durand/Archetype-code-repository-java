package test;

import org.junit.Test;
import sample.Calculator;
import static org.junit.Assert.assertEquals;

public class CalculatorTest {

        @Test
        public void GivenTwoIntegersWhenMultiplyingThenReturnResult() {
            Calculator calc = new Calculator();

            // assert statements
            assertEquals(2, calc.multiply(1, 2));
            assertEquals(42, calc.multiply(7, 6));
            assertEquals(-84, calc.multiply(6, -14));
        }

        @Test
        public void GivenAZeroIntegerWhenMultiplyingThenReturnZero() {
            Calculator calc = new Calculator();

            // assert statements
            assertEquals(0, calc.multiply(42, 0));
            assertEquals(0, calc.multiply(0, 0));
        }

        @Test
        public void GivenTwoIntegersWhenAdditionningThenReturnResult() {
            Calculator calc = new Calculator();

            // assert statements
            assertEquals(3, calc.add(1, 2));
            assertEquals(42, calc.add(19, 23));
            assertEquals(19, calc.add(19, 0));
            assertEquals(-42, calc.add(-5, -37));
        }

        @Test
        public void GivenTwoIntegersWhenSubstractingThenReturnResult() {
            Calculator calc = new Calculator();

            // assert statements
            assertEquals(-1, calc.substract(1, 2));
            assertEquals(-4, calc.substract(19, 23));
            assertEquals(19, calc.substract(19, 0));
            assertEquals(32, calc.substract(-5, -37));
        }

        @Test
        public void GivenTwoNonZeroIntegersWhenDividingThenReturnResult() {
            Calculator calc = new Calculator();

            // assert statements
            assertEquals(0, calc.divide(1, 2));
            assertEquals(21, calc.divide(42, 2));
            assertEquals(-6, calc.divide(-19, 3));
        }

        @Test
        public void GivenAZeroIntegerWhenDividingThenReturnZero() {
            Calculator calc = new Calculator();

            // assert statements
            assertEquals(0, calc.divide(42, 0));
            assertEquals(0, calc.divide(0, 42));
        }

    @Test
    public void GivenTwoNonZeroIntegersWhenModuloThenReturnResult() {
        Calculator calc = new Calculator();

        // assert statements
        assertEquals(1, calc.modulo(3, 2));
        assertEquals(0, calc.modulo(42, 2));
        assertEquals(-4, calc.modulo(-19, 5));
    }

    @Test
    public void GivenAZeroIntegerWhenModuloThenReturnZero() {
        Calculator calc = new Calculator();

        // assert statements
        assertEquals(0, calc.modulo(42, 0));
        assertEquals(0, calc.modulo(0, 42));
    }
}