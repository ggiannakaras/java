package codility;

/**
 * Write a function:
 * class Solution { public int solution(int N); }
 * which, given an integer N, returns the smallest integer that is greater than N and the sum of whose digits is equal to the sum of the digits of N.
 * Examples:
 * 1. Given N = 28, your function should return 37. The sum of the digits of 28 is equal to 2 + 8 = 10. The subsequent numbers are (with the sum of their digits in
 * brackets): 29 (11), 30 (3), 31 (4), 32 (5), 33 (6), 34 (7), 35 (8), 36 (9) and 37 (10). 37 is the smallest number bigger than 28 whose digits add up to 10.
 * 2. Given N = 734, your function should return 743. The sum of the digits of 734 and 743 are equal 7 + 3 + 4 = 7 + 4 + 3 = 14. No other integer between 735 and
 * 742 adds up to 14.
 * 3. Given N = 1990, your function should return 2089. The sum of the digits of both numbers is equal to 19 and there is no other integer between them with the
 * same sum of digits.
 * 4. Given N = 1000, your function should return 10000. The sum of the digits of both numbers is equal to 1 and there is no other integer between them with the
 * same sum of digits.
 * Assume that:
 * N is an integer within the range [1..50,000].
 */
public class NextSameDigitsSum {
    public int solution(int N) {
        int answer = N;
        int sumOfN = splitAndSum(N);
        do {
            answer++;
        } while (splitAndSum(answer) != sumOfN);

        return answer;
    }

    private int splitAndSum(int i) {
        char[] chars = ("" + i).toCharArray();
        int sum = 0;
        for (int index = 0; index < chars.length; index++) {
            sum = sum + Integer.parseInt(String.valueOf(chars[index]));
        }
        return sum;
    }
}
