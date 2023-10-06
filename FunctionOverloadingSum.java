import java.util.Scanner;
public class FunctionOverloadingSum {

    public static int sum (int a, int b){
        return a + b;
    }
    public static int sum (int a, int b, int c){
        return a + b;
    }
    public static int sum (int a, int b, int c, int d){
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println(2+4+8);
    }
}
