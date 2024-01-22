package mock.io;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class CalculatorTest {

    @Test
    public void testAdd() {
        // Create a mock Calculator
        Calculator calculatorMock = mock(Calculator.class);

        // Set up the behavior of the add method in the mock
        when(calculatorMock.add(2, 3)).thenReturn(5);

        // Use the mock in your test
        int result = calculatorMock.add(2, 3);

        // Verify that the add method was called with the specified arguments
        verify(calculatorMock).add(2, 3);

        // Verify the result
        assertEquals(5, result);
    }
}
