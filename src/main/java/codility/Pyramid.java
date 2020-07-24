package codility;

public class Pyramid {

    private char star = '*';

    public void create(int height) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(star);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Pyramid pyramid = new Pyramid();
        pyramid.create(4);
    }
}
