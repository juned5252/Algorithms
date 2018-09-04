package insertionSort;

public class insertionSortTest {
    public static void display(int[] arr){
        for (int num: arr) {
            System.out.print(num+",");
        }
        System.out.println("\n");
    }

    public static void main(String[] args) {

        int[] array = {12,43,2,7,32,56,13,9,11,60};
        display(array);
        insertionSort.insertionSort(array);
        display(array);
    }
}
