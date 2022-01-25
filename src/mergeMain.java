public class mergeMain {
    public static void mergeOf(int[] arr, int s, int m, int e){
        int n = m - s+1;
        int n2 = e - m;

        int[] l = new int[n];
        int[] r = new int[n2];

        for(int i=0; i<n; i++){
            l[i] = arr[s + i];
        }

        for(int j=0; j<n2; j++){
            r[j] = arr[m+1+j];

        }

        int i,j,k;
        i = 0;
        j = 0;
        k = s;

        while(i < n && j < n2){
            if(l[i] <= r[j]){
                arr[k] = l[i];
                i++;
            }
            else{
                arr[k] = r[j];
                j++;
            }
            k++;
        }

        while(i<n){
            arr[k] = l[i];
            i++;
            k++;
        }

        while (j<n2){
            arr[k] = r[j];
            j++;
            k++;
        }


    }

    public static void mergeSort(int[] arr, int s, int e){
        if(s < e){

            int m = (s + e)/2;

            mergeSort(arr, s, m);
            mergeSort(arr, m+1, e);

            mergeOf(arr, s, m, e);
        }
    }

    public static void mergePrint(int[] arr){
        int len = arr.length;
        for(int i=0; i<len; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args){
        int[] array = {9,8,4,12,7,21,1,3,20};
        mergeSort(array, 0, array.length-1);
        System.out.println("Sorted array: ");
        mergePrint(array);
    }
}
