public class Exercise6 {
    public static void main(String[] args) {
        int stars = 5;

        // display the square
        for (int i = 0; i < stars; i++) {
            for (int j = 0; j < stars; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        // display the pyramid
        for (int i = 0; i < stars; i++) {
            for (int j = 0; j < stars - (i + 1); j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i + 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}