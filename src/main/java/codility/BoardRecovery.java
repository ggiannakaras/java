package codility;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class BoardRecovery {

    public static String IMPOSSIBLE = "IMPOSSIBLE";

    private int sum(ArrayList<Integer> list) {
        return list.stream().mapToInt(Integer::intValue).sum();
    }

    private String listToString(ArrayList<Integer> list) {
        return list.stream().map(i -> i.toString()).collect(Collectors.joining());
    }

    public String solution(int U, int L, int[] C) {
        int totalColumns = C.length;

        StringBuilder firstRowSb = new StringBuilder();
        StringBuilder secondRowSb = new StringBuilder();

        for (int i = 0; i < totalColumns; i ++) {
            if (U < 0 || L < 0)
                return IMPOSSIBLE;

            if (C[i] == 0) {
                firstRowSb.append(0);
                secondRowSb.append(0);
            } else if (C[i] == 1) {
                if (U > 0) {
                    firstRowSb.append(1);
                    secondRowSb.append(0);
                    U--;
                } else if (L > 0) {
                    firstRowSb.append(0);
                    secondRowSb.append(1);
                    L--;
                }
            } else if (C[i] == 2) {
                firstRowSb.append("1");
                secondRowSb.append("1");
                U --;
                L --;
            } else {
                return IMPOSSIBLE;
            }
        }

        if (U > 0 || L > 0)
            return IMPOSSIBLE;

        return firstRowSb.toString() + "," + secondRowSb.toString();
    }
}


