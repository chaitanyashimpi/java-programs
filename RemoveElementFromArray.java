import java.util.Arrays;

public class RemoveElementFromArray {
    public  static void removeElement(int[] array, int r){
        int[] result = new int[array.length];
        int i = 0;

        for (int k : array) {
            if (k != r) {
                result[i] = k;
                i++;
            }
        }

        for (int j = 0; j < i; j++) {
            System.out.print(result[j] + " ");
        }

    }
    public static void main(String[] args) {
        int[] array = {1,2,4,5,2,1,4,2};
        int removeThis = 2;
        removeElement(array, removeThis);
    }
}


// [1,2,3,3,2,1]

//[1,3,3,1,_,_]

//