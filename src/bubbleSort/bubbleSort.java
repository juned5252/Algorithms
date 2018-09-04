package bubbleSort;

public class bubbleSort {

    public static void bubbleSort(int[] arr) {

        for (int z = 0; z < arr.length - 1;z++) {       // n times 10
            for (int a = 0; a < arr.length-1-z; a++) {  // n times 10
                if (arr[a] > arr[a + 1]) {
                    int temp = arr[a];                  // n * n == n^2
                    arr[a] = arr[a + 1];                 // 10 * 10 = 100
                    arr[a + 1] = temp;
                }
            }
        }
    }
}




