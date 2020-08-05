package codility;

import java.util.HashSet;

/**
 * You are given two arrays A and B consisting of N integers each.
 * Index K is named fair if the four sums (A[0] + ... + A[K-1]), (A[K] + ... + A[N-1]), (B[0] + ... + B[K-1]) and (B[K] + ... + B[N-1]) are all equal. In other words, K is the
 * index where the two arrays, A and B, can be split (into two non-empty arrays each) in such a way that the sums of the resulting arrays' elements are equal.
 * For example, given arrays A = [4, -1, 0, 3] and B = [-2, 5, 0, 3], index K = 2 is fair. The sums of the subarrays are all equal: 4 + (-1) = 3; 0 + 3 = 3; -2 + 5 = 3 and 0 + 3
 * = 3. On the other hand, index K = 1 is not fair; the sums of the subarrays are: 4; (-1) + 0 + 3 = 2; -2 and 5 + 0 + 3 = 8.
 * Write a function:
 * class Solution { public int solution(int[] A, int[] B); }
 * which, given two arrays of integers A and B, returns the number of fair indexes.
 * Examples:
 * 1. Given A = [4, -1, 0, 3] and B = [-2, 5, 0, 3], your function should return 2. The fair indexes are 2 and 3. In both cases, the sums of elements of the subarrays are
 * equal to 3.
 * 2. Given A = [2, -2, -3, 3] and B = [0, 0, 4, -4], your function should return 1. The only fair index is 2. Index 4 is not fair as the subarrays containing indexes from K
 * to N - 1 would be empty.
 * 3. Given A = [4, -1, 0, 3] and B = [-2, 6, 0, 4], your function should return 0. There are no fair indexes.
 * 4. Given A = [3, 2, 6] and B = [4, 1, 6], your function should return 0.
 * 5. Given A = [1, 4, 2, -2, 5], B = [7, -2, -2, 2, 5], your function should return 2. The fair indexes are 2 and 4.
 * Write an ecient algorithm for the following assumptions:
 * N is an integer within the range [2..100,000];
 * each element of arrays A, B is an integer within the range [−1,000,000,000..1,000,000,000].
 */
public class FairSplits {
    public int solution(int[] A, int[] B) {
        int fairIndex = 2; //start index
        int minArrayLength = fairIndex + 1;
        int totalFairIndexes = 0;

        if (A.length < minArrayLength || B.length < minArrayLength)
            return 0;

        do {
            HashSet<Integer> integers = new HashSet<>();
            integers.add(sum(A, 0, fairIndex - 1));
            integers.add(sum(A, fairIndex, A.length - 1));
            integers.add(sum(B, 0, fairIndex - 1));
            integers.add(sum(B, fairIndex, B.length - 1));

            if (integers.size() == 1) {
                totalFairIndexes++;
            }

            fairIndex++;
        } while (fairIndex <= A.length - 1 && fairIndex <= B.length - 1);

        return totalFairIndexes;
    }

    private int sum(int[] array, int startIndex, int endIndex) {
        int total = 0;
        for (int i = startIndex; i <= endIndex; i++) {
            total += array[i];
        }
        return total;
    }
}
