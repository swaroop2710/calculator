import org.example.Calculator;
import static org.junit.Assert.*;
import org.junit.Test;
public class Caltesting {
    private static final double DELTA = 1e-15;
    Calculator calculator = new Calculator();
    @Test
    public void factorialTruePositive(){
        assertEquals("Finding factorial of a number for True Positive", 720, calculator.factorial(6), DELTA);
        assertEquals("Finding factorial of a number for True Positive", 1, calculator.factorial(1), DELTA);
        assertEquals("Finding factorial of a number for True Positive", 6, calculator.factorial(3), DELTA);
        assertEquals("Finding factorial of a number for True Positive", 24, calculator.factorial(4), DELTA);
        assertEquals("Finding factorial of a number for True Positive", 1, calculator.factorial(0), DELTA);
    }

    @Test
    public void factorialFalsePositive(){
        assertNotEquals("Finding factorial of a number for False Positive", 113, calculator.factorial(5), DELTA);
        assertNotEquals("Finding factorial of a number for False Positive", 10, calculator.factorial(6), DELTA);
        assertNotEquals("Finding factorial of a number for False Positive", 42, calculator.factorial(4), DELTA);
        assertNotEquals("Finding factorial of a number for False Positive", 9, calculator.factorial(2), DELTA);
        assertNotEquals("Finding factorial of a number for False Positive", 0, calculator.factorial(0), DELTA);
    }
}
