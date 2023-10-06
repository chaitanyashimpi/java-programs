public class DecimalToBinary {

    private static long decToBin(int dec) {
        if (dec == 0) {
            return 0;
        }

        long binary = 0;
        int position = 0;

        while (dec > 0) {
            int remainder = dec % 2;
            binary += (long) (remainder * Math.pow(10, position));
            position++;
            dec /= 2;
        }

        return binary;
    }

    public static void main(String[] args) {
        int dec = 1;
        System.out.println(decToBin(dec));
    }
}
