public class EquilateralTrianglePattern {

    public static void printPattern(int side) {
        for (int i = 1; i <= side; i++) {
            for (int j = 1; j <= side - i; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= i * 2 - 1; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int side = 5;
        printPattern(side);
    }
}