package JAVA_SORT;
public class SelectionSort {

    static void selectionSort(int arr[]){
        int n = arr.length;
        for (int i = 0; i < n - 1 ; i++) {
            int min_idx = i ;
            for (int j = i; j < n ; j++) {
                if(arr[j] < arr[min_idx]){
                    min_idx = j;
                }
            }
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp ;
        }
    }
    static void printArray(int arr[]){
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {64, 25, 12, 22, 11};
        selectionSort(arr);
        System.out.println("Array Organizado: ");
        printArray(arr);
    }
}
