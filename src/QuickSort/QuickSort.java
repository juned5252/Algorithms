package QuickSort;


// Java program for implementation of QuickSort
class QuickSort
{
    // we should first implement the partition method
    static int partition(int arr[], int low, int high)
    {
        int pivot = arr[high];
        int pindex = (low-1); // index of smaller element
        for (int j=low; j<high; j++)
        {
            // If current element is smaller than or
            // equal to pivot
            if (arr[j] <= pivot)
            {
                pindex++;

                // swap arr[i] and arr[j]
                int temp = arr[pindex];
                arr[pindex] = arr[j];
                arr[j] = temp;
            }
        }
         pindex++;
        // swap arr[i+1] and arr[high] (or pivot)
        int temp = arr[pindex];
        arr[pindex] = arr[high];
        arr[high] = temp;

        return pindex;
    }

    static void sort(int arr[], int low, int high)
    {
        if (low < high)
        {
            /* pi is partitioning index, arr[pi] is
              now at right place */
            int pi = partition(arr, low, high);

            // Recursively sort elements before
            // partition and after partition
            sort(arr, low, pi-1);
            sort(arr, pi+1, high);
        }
    }

}