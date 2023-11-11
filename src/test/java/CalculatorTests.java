import org.example.Calculator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class CalculatorTests {
    @Test
    @DisplayName("Dado D10 - Deve retornar valores menores que 10")
    public void test(){
        Calculator calculator = new Calculator();
        int result = calculator.Sum(10,5);
        assertTrue(result == 15);
    }
}
