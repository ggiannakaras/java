package interview;

/**
 * You would like to print a triangle on the screen. Available are the whitespace and the * characters.
 * For height = 3 you should get the following output:
 *   *
 *  ***
 * *****
 *
 * For height = 4 you should get the following output:
 *    *
 *   ***
 *  *****
 * *******
 *
 * For height = 5 you should get the following output:
 *     *
 *    ***
 *   *****
 *  *******
 * *********
 *
 * etc
 */
public class Triangle {

    private static char STAR = '*';
    private static char SPACE = ' ';

    public void createTree(int height) {
        int tempHeight = 1;
        int stars = 1;
        int whitespaces = height - 1;
        do {
            printChar(SPACE, whitespaces);
            printChar(STAR, stars);

            tempHeight++;
            stars = stars + 2;
            whitespaces--;
            System.out.println();
        } while (tempHeight <= height);
    }

    private void printChar(char c, int total) {
        for (int i = 0; i < total; i++) {
            System.out.print(c);
        }
    }

    public static void main(String[] args) {
        Triangle t = new Triangle();
        t.createTree(10);
    }
}
