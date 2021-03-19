public class RecursiveInsertionSort {

    static void recursiveInsertion(int[] arr, int n) {
        if (n <= 1) {
            return;
        }

        recursiveInsertion(arr, n - 1);

        int last = arr[n - 1];
        int j = n - 2;

        while (j >= 0 && arr[j] > last) {
            arr[j + 1] = arr[j];
            j--;
        }
        arr[j + 1] = last;
    }

    public static void main(String[] args) {
        int[] arr = { 9, 8, 6, 7, 5, 4, 3, 2, 1 };

        recursiveInsertion(arr, arr.length);

        for (int i : arr)
            System.out.print(i + " ");
    }
}
