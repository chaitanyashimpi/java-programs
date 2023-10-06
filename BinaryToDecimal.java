public class BinaryToDecimal {
    public static double binarytodecimal(int num){
        double res = 0;
        int pos = 0;
        while(num > 0){
            int rem = num % 10;
            if(rem == 1){
                res += Math.pow(2, pos);
            }
            pos++;
            num /= 10;
        }

        return res;
    }
    public static void main(String[] args) {
        int bi = 1001;
        System.out.println((binarytodecimal(bi)));
    }
}
