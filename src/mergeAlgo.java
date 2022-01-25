import java.util.Arrays;

public class mergeAlgo {
    public static void merge(int[] arr1, int[] arr2, int high){
        int i, j, k;
        i = 0;
        j = 0;
        k = 0;
        int a1 = arr1.length;
        int a2 = arr2.length;
        int[] fA = new int[high];

        while (i < a1 && j < a2){
            if(arr1[i] < arr2[j]){
                fA[k] = arr1[i];
                i++;
                k++;
            }
            else{
                fA[k] = arr2[j];
                j++;
                k++;
            }
        }

        while (i < a1){
            fA[k] = arr1[i];
            i++;
            k++;
        }
        while (j < a2){
            fA[k] = arr2[j];
            j++;
            k++;
        }
        System.out.println(Arrays.toString(fA));
    }

    public static void mergeSortAlgo(int[] array1, int low, int high){
           int mid = (low+high)/2;

           int[] arr1 = new int[mid];
           int[] arr2 = new int [mid+1];
           for(int i=0; i<mid; i++){
               arr1[i] = array1[i];
           }
           Arrays.sort(arr1);

           for(int j=0; j<(high-mid); j++)
               arr2[j] = array1[mid+j];
           Arrays.sort(arr2);
           merge(arr1, arr2, high);
    }

    public static void main(String[] args){
        int[] array = {7,1,2,9,8,23,3,44,15};
        int high = array.length;
        mergeSortAlgo(array, 0, high);
    }
}
