package Sorts;

public class QuickSort {

    private static void swap(int[] arr, int firstIndex, int secondIndex) {
        int temp = arr[firstIndex];
        arr[firstIndex] = arr[secondIndex];
        arr[secondIndex] = temp;
    }

    private static int pivot(int[] arr, int pivotIndex, int endIndex) {
        int swapIndex = pivotIndex;
        for(int i = pivotIndex + 1; i <= endIndex; i++) {
            if(arr[i] < arr[pivotIndex]) {
                swapIndex++;
                swap(arr, swapIndex, i);
            }
        }
        swap(arr, pivotIndex, swapIndex);
        return swapIndex;
    }

    public static void quickSortHelper(int[] arr, int left, int right) {
        int pivotIndex = pivot(arr, left, right);
        if(left < right) {
            quickSortHelper(arr, left, pivotIndex -1);
            quickSortHelper(arr, pivotIndex + 1, right);
        }
    }

    public static void quickSort(int[] index) {
        quickSortHelper(index, 0, index.length -1);
    }

}
