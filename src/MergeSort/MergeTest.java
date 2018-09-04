package MergeSort;

public class MergeTest {

    static void display(int[] arr){
        for (int num: arr) {
            System.out.print(num+",");
        }
        System.out.println("\n");
    }

    public static void main(String[] args) {

        int[] array = {12,43,43,2,7,32,56,13,9,11,60};
        MergeTest.display(array);
        MergeSort.sort(array,0,10);
        MergeTest.display(array);

    }
}
