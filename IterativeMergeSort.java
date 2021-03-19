public class IterativeMergeSort {

    static void mergesort(int arr[]) {
        if (arr == null) {
            return;
        }
        if (arr.length > 1) {

            int mid = arr.length / 2;

            int[] Left = new int[mid];
            for (int i = 0; i < mid; i++) {
                Left[i] = arr[i];
            }

            int[] Right = new int[arr.length - mid];
            for (int i = mid; i < arr.length; i++) {
                Right[i - mid] = arr[i];
            }

            mergesort(Left);
            mergesort(Right);

            int i = 0, j = 0, k = 0;

            while (i < Left.length && j < Right.length) {
                if (Left[i] < Right[j]) {
                    arr[k] = Left[i];
                    i++;
                } else {
                    arr[k] = Right[j];
                    j++;
                }
                k++;
            }

            while (i < Left.length) {
                arr[k] = Left[i];
                k++;
                i++;
            }

            while (j < Right.length) {
                arr[k] = Right[j];
                j++;
                k++;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 };

        mergesort(arr);

        for (int i : arr)
            System.out.print(i + " ");
    }
}
