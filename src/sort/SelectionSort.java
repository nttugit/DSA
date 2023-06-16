package sort;

import java.util.Arrays;

public class SelectionSort {

    /**
     * How?
     * Chạy từ đầu đến cuối mảng
     * Tai vòng lặp thứ i, tìm phần tử nhỏ nhất từ [i+1,n-1], nếu nhỏ hơn a[i] thì đổi chỗ cho a[i]
     * Sau vòng lặp thứ i, thì dãy [0,i] đã được sắp xếp
     * Draft
     *    2 5 1 3 4 6
     * 1: 1 5 2 3 4 6 swap(a[i], min) <=> swap(a[0], a[2])
     * 2: 1 2 5 3 4 6 swap(a[1], ...)
     * 3: 1 2 3 5 4 6 swap(a[2], ...)
     * 4: 1 2 3 4 5 6 swap(a[3], ...)
     * 5: 1 2 3 4 5 6, không swap, vì a[4] < min
     */

    public static void sortAscending(int arr[]){
        int length = arr.length;
        for(int i =0; i < length; i ++){
            int minIndex = i;
            for(int j = i +1; j < length; j++){
                if(arr[j] < arr[minIndex]){
                    // gán minIndex và tiếp tục duyệt xem có giá trị nào bé hơn nó nua hay không
                    minIndex = j;
                }
            }
            SwapNumbers.swap(arr,i,minIndex);
        }
    }

    public static void main(String[] args) {
        int arr[] = new int[]{2, 5, 1, 3, 4, 6};
        System.out.println("Before sorting: " + Arrays.toString(arr));
        sortAscending(arr);
        System.out.println("After sorting: " + Arrays.toString(arr));
    }
}
