import java.util.Arrays;
import java.util.Collections;

public class sortingMethod {
    public static void main(String[] args){
        int[] array = {12,2,34,33,56,6,77,8,45};
        Arrays.sort(array);
        System.out.println("After sorting of array: "+ Arrays.toString(array));

        Integer[] arrayTwo = {2,34,4,5,43,9,85,45,56,3,22};
        Arrays.sort(arrayTwo, Collections.reverseOrder());
        System.out.println("After sorting and descending: "+Arrays.toString(arrayTwo));
    }
}
