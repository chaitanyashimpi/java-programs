import java.util.Scanner;

public class BinomialCoefficient {
    // (n!)/(k!(n-k)!)
    public static int fact(int n){
        int fact = 1;
        if(n == 0) return fact;
        fact = n * fact(n-1);
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        System.out.println((fact(n)/(fact(k)* (fact(n-k)))));
    }
}
