package insertionSort;

public class insertionSort {

    public static void insertionSort(int[] arr){

        for (int i = 1; i < arr.length;i++){
            int value = arr[i];
            int hole = i;
            while(hole >= 0 && arr[hole-1] > value){
                arr[hole] = arr[hole-1];
                hole = hole - 1;
            }

            arr[hole] = value;
        }

    }

}
