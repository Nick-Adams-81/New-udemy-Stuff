package Sorts;
import java.util.Arrays;


public class Main {

    public static void main(String[] args) {

        int[] nums1 = {92, 7, 34, 13, 21, 11, 3, 98};
        int[] nums2 = {5, 43, 12, 11, 90, 76, 14, 123};
        int[] nums3 = {54, 1, 23, 14, 76, 456, 321, 97};

        System.out.println("Unsorted: " + Arrays.toString(nums1));
        BubbleSort.bubbleSort(nums1);
        System.out.println("Bubble Sort: " + Arrays.toString(nums1));
        System.out.println("");
        System.out.println("Unsorted: " + Arrays.toString(nums2));
        SelectionSort.selectionSort(nums2);
        System.out.println("Sorted: " + Arrays.toString(nums2));
        System.out.println("");
        System.out.println("Unsorted: " + Arrays.toString(nums3));
        InsertionSort.insertionSort(nums3);
        System.out.println("Sorted: " + Arrays.toString(nums3));

        int[] array1 = {1, 3, 7, 8};
        int[] array2 = {2, 4, 5, 6};
        System.out.println(Arrays.toString(MergeSort.merge(array1, array2)));

        int[] mergeArr = {3, 1, 4, 2};
        System.out.println("Unsorted: " + Arrays.toString(mergeArr));
        System.out.println("Sorted: " + Arrays.toString(MergeSort.mergeSort(mergeArr)));

        int[] myArray = {4, 6 ,1, 7, 3, 2, 5};

        System.out.println(Arrays.toString(myArray));

        QuickSort.quickSort(myArray);
        System.out.println(Arrays.toString(myArray));
    }
}
