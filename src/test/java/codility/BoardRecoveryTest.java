package codility;

import org.junit.Test;

import java.awt.*;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

// possible question (write me a test to verify)
public class BoardRecoveryTest {

    private BoardRecovery b = new BoardRecovery();

    @Test
    public void test1() {
        int U = 3;
        int L = 2;
        int [] C = {2, 1, 1, 0, 1};
        String boardRecovery = b.solution(U, L, C);
        System.out.println(boardRecovery);
        assertBoardRecovery(U, L, boardRecovery);
    }

    @Test
    public void test2() {
        int U = 2;
        int L = 3;
        int [] C = {0, 0, 1, 1, 2};
        String boardRecovery = b.solution(U, L, C);
        assertEquals(boardRecovery, b.IMPOSSIBLE);
    }

    @Test
    public void test3() {
        int U = 2;
        int L = 2;
        int [] C = {2, 0, 2, 0};
        String boardRecovery = b.solution(U, L, C);
        System.out.println(boardRecovery);
        assertBoardRecovery(U, L, boardRecovery);
    }

    private void assertBoardRecovery(int u, int l, String boardRecovery) {
        Integer[][] integers = Arrays.stream(boardRecovery.split(",")).map(strRow ->
                strRow.chars().mapToObj(c -> Character.getNumericValue((char) c)).toArray(Integer[]::new)
        ).toArray(Integer[][]::new);

        assertEquals(integers.length, 2);

        for (int i = 0; i < integers.length; i++) {
            int rowSum = 0;
            for (int j = 0; j < integers[i].length; j++) {
                rowSum = rowSum + integers[i][j];
            }

            if (i == 0) {
                assertEquals(rowSum, u);
            } else {
                assertEquals(rowSum, l);
            }
        }
    }
}
