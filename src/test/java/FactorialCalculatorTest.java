import org.example.FactorialCalculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FactorialCalculatorTest {

    @Test
    void testFactorialOfZero() {
        assertEquals(1, FactorialCalculator.calculateFactorial(0), "Факториал 0 должен быть равен 1");
    }

    @Test
    void testFactorialOfOne() {
        assertEquals(1, FactorialCalculator.calculateFactorial(1), "Факториал 1 должен быть равен 1");
    }

    @Test
    void testFactorialOfThree() {
        assertEquals(6, FactorialCalculator.calculateFactorial(3), "Факториал 3 должен быть равен 6");
    }

    @Test
    void testFactorialOfFive() {
        assertEquals(120, FactorialCalculator.calculateFactorial(5), "Факториал 5 должен быть равен 120");
    }

    @Test
    void testFactorialOfNegativeNumber() {
        assertThrows(IllegalArgumentException.class,
                () -> FactorialCalculator.calculateFactorial(-1),
                "Ожидалось выбрасывание IllegalArgumentException для отрицательного числа");
    }

    @Test
    void testFactorialOfTen() {
        assertEquals(3628800, FactorialCalculator.calculateFactorial(10), "Факториал 10 должен быть равен 3628800");
    }

    @Test
    void testFactorialSequence() {
        assertAll(
                () -> assertEquals(1, FactorialCalculator.calculateFactorial(0), "Факториал 0 должен быть равен 1"),
                () -> assertEquals(1, FactorialCalculator.calculateFactorial(1), "Факториал 1 должен быть равен 1"),
                () -> assertEquals(2, FactorialCalculator.calculateFactorial(2), "Факториал 2 должен быть равен 2"),
                () -> assertEquals(6, FactorialCalculator.calculateFactorial(3), "Факториал 3 должен быть равен 6")
        );
    }

    @Test
    void testFactorialOfLargeNumber() {
        assertDoesNotThrow(() -> FactorialCalculator.calculateFactorial(15),
                "Вычисление факториала 15 должно выполняться без исключений");
    }
}
