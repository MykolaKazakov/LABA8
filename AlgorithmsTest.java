import org.junit.Test;
import static org.junit.Assert.*;

public class AlgorithmsTest {
    @Test
    public void testFindMinPositive() {
        int[] arr = {3, -7, 5, -2, -9, 8};
        assertEquals(3, Algorithms.findMinPositive(arr));

        int[] noPositive = {-1, -2, -3};
        assertEquals(-1, Algorithms.findMinPositive(noPositive));
    }

    @Test
    public void testSumNegative() {
        int[] arr = {3, -7, 5, -2, -9, 8};
        assertEquals(-18, Algorithms.sumNegative(arr));

        int[] noNegative = {1, 2, 3};
        assertEquals(0, Algorithms.sumNegative(noNegative));
    }

    @Test
    public void testFibonacci() {
        assertEquals(0, Algorithms.fibonacci(0));
        assertEquals(1, Algorithms.fibonacci(1));
        assertEquals(55, Algorithms.fibonacci(10));
        assertEquals(-1, Algorithms.fibonacci(-5));
    }

    @Test
    public void testCalculateCurrent() {
        assertEquals(3.0, Algorithms.calculateCurrent(12.0, 4.0), 0.001);
        assertEquals(-1, Algorithms.calculateCurrent(12.0, 0.0), 0.001);
    }
}

