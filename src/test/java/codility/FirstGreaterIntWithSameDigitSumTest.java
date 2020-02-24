package codility;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FirstGreaterIntWithSameDigitSumTest {

    private final FirstGreaterIntWithSameDigitSum firstGreaterIntWithSameDigitSum = new FirstGreaterIntWithSameDigitSum();

    @Test
    public void test() {
        assertEquals(37, firstGreaterIntWithSameDigitSum.solution(28));
        assertEquals(743, firstGreaterIntWithSameDigitSum.solution(734));
        assertEquals(2089, firstGreaterIntWithSameDigitSum.solution(1990));
        assertEquals(10000, firstGreaterIntWithSameDigitSum.solution(1000));
    }
}
