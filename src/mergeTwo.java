import java.util.Arrays;

public class mergeTwo {
    public static void MergeSort(int[] arr1, int[] arr2, int[] f1){
        int a1l = arr1.length;
        int a2l = arr2.length;
        int i,j,k;
        i = 0;
        j=0;
        k = 0;
        while (i<a1l && j<a2l){
            if(arr1[i] < arr2[j]){
                f1[k] = arr1[i];
                i++;
                k++;
            }
            else{
                f1[k] = arr2[j];
                j++;
                k++;
            }
        }

        while(i<a1l){
            f1[k] = arr1[i];
            i++;
            k++;
        }

        while (j<a2l){
            f1[k] = arr2[j];
            j++;
            k++;
        }
        System.out.println(Arrays.toString(f1));
    }


    public static void main(String[] args){
        int[] arrayOne = {12,23,34,45,56,59};
        int[] arrayTwo = {11,22,34,44,66,70};
        int both = arrayOne.length + arrayTwo.length;
        int[] finalArray = new int[both];
        MergeSort(arrayOne,arrayTwo,finalArray);
    }
}
