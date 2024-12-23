package org.example;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FactorialCalculatorTestNGTest {

    @Test
    public void testFactorialOfZero() {
        Assert.assertEquals(FactorialCalculator.calculateFactorial(0), 1, "Факториал 0 должен быть равен 1");
    }

    @Test
    public void testFactorialOfOne() {
        Assert.assertEquals(FactorialCalculator.calculateFactorial(1), 1, "Факториал 1 должен быть равен 1");
    }

    @Test
    public void testFactorialOfThree() {
        Assert.assertEquals(FactorialCalculator.calculateFactorial(3), 6, "Факториал 3 должен быть равен 6");
    }

    @Test
    public void testFactorialOfFive() {
        Assert.assertEquals(FactorialCalculator.calculateFactorial(5), 120, "Факториал 5 должен быть равен 120");
    }

    @Test
    public void testFactorialOfNegativeNumber() {
        try {
            FactorialCalculator.calculateFactorial(-1);
            Assert.fail("Ожидалось выбрасывание IllegalArgumentException для отрицательного числа");
        } catch (IllegalArgumentException e) {
            // Expected exception
        }
    }

    @Test
    public void testFactorialOfTen() {
        Assert.assertEquals(FactorialCalculator.calculateFactorial(10), 3628800, "Факториал 10 должен быть равен 3628800");
    }

    @Test
    public void testFactorialSequence() {
        Assert.assertEquals(FactorialCalculator.calculateFactorial(0), 1, "Факториал 0 должен быть равен 1");
        Assert.assertEquals(FactorialCalculator.calculateFactorial(1), 1, "Факториал 1 должен быть равен 1");
        Assert.assertEquals(FactorialCalculator.calculateFactorial(2), 2, "Факториал 2 должен быть равен 2");
        Assert.assertEquals(FactorialCalculator.calculateFactorial(3), 6, "Факториал 3 должен быть равен 6");
    }

    @Test
    public void testFactorialOfLargeNumber() {
        try {
            FactorialCalculator.calculateFactorial(15);
        } catch (Exception e) {
            Assert.fail("Вычисление факториала 15 должно выполняться без исключений");
        }
    }
}
