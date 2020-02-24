package codility;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FindFairIndexTest {

    final FindFairIndex f = new FindFairIndex();

    @Test
    public void test1() {
        int[] array1 = {4, -1, 0, 3};
        int[] array2 = {-2, 5, 0, 3};
        assertEquals(2, f.solution(array1, array2));
    }

    @Test
    public void test2() {
        int[] array1 = {2, -2, -3, 3};
        int[] array2 = {0, 0, 4, -4};
        assertEquals(1, f.solution(array1, array2));
    }

    @Test
    public void test3() {
        int[] array1 = {4, -1, 0, 3};
        int[] array2 = {-2, 6, 0, 4};
        assertEquals(2, f.solution(array1, array2));
    }

    @Test
    public void test4() {
        int[] array1 = {3, 2, 6};
        int[] array2 = {4, 1, 6};
        assertEquals(0, f.solution(array1, array2));
    }

    @Test
    public void test5() {
        int[] array1 = {1, 4, 2, -2, 5};
        int[] array2 = {7, -2, -2, 2, 5};
        assertEquals(2, f.solution(array1, array2));
    }
}
