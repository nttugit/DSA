package sort;

import java.util.Arrays;

public class InsertionSort {
    /**
     * How?
     * Duyệt từ đầu đến cuối mảng
     * Tại vòng i (coi như dãy từ [0,i-1] đã sắp xếp) chèn phâ tử a[i] vào vị trí thích hợp
     * Sau vòng lặp thứ i thì dãy [0,i] đã được sắp xếp
     *
     * Draft
     */

    public static void sortAscending(int[] arr) {
        int length = arr.length;
        // Bắt đầu từ phần tử thứ 2, vì coi như phần tử đầu thuộc dãy đã sắp xếp
        for (int i = 1; i < length; i++) {
            // Duyệt ngược từ vị trí i-1 về 0
            // nếu thấy thằng nào bé hơn nó thì đổi chỗ với thằng đó
            // 3 5 2: i = 2, a[i] = 2
            // j = 1 => a[j+1] = a[j] <=> a[2] = a[1]  => 3 5 5
            // j = 0 => a[1] = a[0] <=> 3 3 5
            // j = -1 => break, a[j + 1] = a[i] <=> a[0] = 2 => 2 3 5

            // 2 5 3: i = 2, a[i] = 3
            // j = 1 => a[2] = a[1] <=> 2 5 5
           // j = 0, a[j] = 2 < 3 => break, a[j+1] <=> a[1] = 3 => 2 3 5

            int currentValue = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > currentValue) {
                arr[j + 1] = arr[j];
                j--;
            }

            // Duyệt hết mảng, giá trị j = -1, nên cộng thêm
            arr[j + 1] = currentValue;
        }
    }

    public static void main(String[] args) {
        int arr[] = new int[]{2, 5, 1, 3, 4, 6};
        System.out.println("Before sorting: " + Arrays.toString(arr));
        sortAscending(arr);
        System.out.println("After sorting: " + Arrays.toString(arr));
    }
}
