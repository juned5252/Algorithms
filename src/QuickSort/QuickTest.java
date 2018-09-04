package QuickSort;


import MergeSort.MergeTest;

public class QuickTest {

    static void display(int[] arr){
        for (int num: arr) {
            System.out.print(num+",");
        }
        System.out.println("\n");
    }

    public static void main(String[] args) {

        int[] array = {12,43,43,2,7,32,56,13,9,11,60};
        QuickTest.display(array);
        QuickSort.sort(array,0,10);
        QuickTest.display(array);



    }

}
