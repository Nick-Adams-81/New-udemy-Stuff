package Sorts;
import java.util.Arrays;


public class Main {

    public static void main(String[] args) {
        int[] nums = {92, 7, 34, 13, 21, 11, 3, 98};

        System.out.println("Unsorted: " + Arrays.toString(nums));
        BubbleSort.bubbleSort(nums);
        System.out.println("Sorted: " + Arrays.toString(nums));
    }
}
