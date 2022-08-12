package JAVA_SORT;
public class CountingSort {
    static void countingsort(char arr[]){

        int n = arr.length;
        char output[] = new char [256];
        int count[] = new int[256];
        for (int i = 0; i < 256; i++) {
            count[i] = 0;
        }
        for (int i = 0; i < n; i++) {
            count[arr[i]]++;
        }
        for (int i = 1; i <= 255; i++) {
            count[i] += count[i - 1];
        }
        for (int i = n - 1; i >= 0; i--) {
            output[count[arr[i]]-1] = arr[i];
            --count[arr[i]];
        }
        for (int i = 0; i < n; i++) {
            arr[i] = output[i];
        }
    }
    public static void main(String[] args) {
        char arr[] = {'g', 'e', 'e', 'k', 's', 'f', 'o', 'r', 'g', 'e', 'e', 'k', 's'};

        countingsort(arr);

        System.out.println("Organizando os chrs o array fica: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }  
}