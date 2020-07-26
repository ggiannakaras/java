package codility;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NextSameDigitsSumTest {

    private final NextSameDigitsSum nextSameDigitsSum = new NextSameDigitsSum();

    @Test
    public void test() {
        assertEquals(37, nextSameDigitsSum.solution(28));
        assertEquals(743, nextSameDigitsSum.solution(734));
        assertEquals(2089, nextSameDigitsSum.solution(1990));
        assertEquals(10000, nextSameDigitsSum.solution(1000));
    }
}
