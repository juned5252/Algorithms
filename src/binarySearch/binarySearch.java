package binarySearch;

public class binarySearch {

    public static int binarySearch(int[] arr, int key){

        int high = arr.length-1;
        int low = 0;
        int mid;


        while (true){
            mid = (low + high)/2;

            if (arr[mid] == key) {
                return mid;
            }
            else if (low > high)
                return 0;
            else {
                if (arr[mid] < key)
                    low = mid+1;
                else high = mid-1;
            }
        }
    }
}