package sort;


import java.util.Arrays;

public class BubbleSort {
    /**
     * How?
     * Duyệt từ đầu đến cuối mảng
     * Nếu phần tử đúng trước mà lớn hơn phần tử đứng sau thì đổi chỗ
     * Sau mỗi vòng lặp tihf phần tử lớn nhất (hoặc nhỏ nhất) sẽ trôi xuống dưới
     * (Các phần tử khác sẽ nổi lên trên cứ như nổi bọt)
     * <p>
     * Draft
     * 2 5 1 3 4 6
     * 1: 2 5 1 3 4 6 (i = 0)
     * 2: 2 1 5 3 4 6 (i = 1), swap(5,1) vì 5 > 1
     * 3: 2 1 3 5 4 6 (i = 2), swap(5,3)
     * 4: 2 1 3 4 5 6 (i = 3), swap(5,4)
     * 5: 2 1 3 4 5 6 (i = 4), không swap
     * Tương tự, thực hiện arr.length lần lặp như vậy
     */

    public static void sortAscendingInteger(int arr[]) {
        int length = arr.length;
        for (int i = 0; i < length; i++) {
            // Phải chạy lại từ đầu, và không cần duyệt qua các phần tử sắp xếp
            // Nhưng nếu lần đầu duyệt mảng đã sắp xếp, có cần chạy hết length không?
            System.out.println("Sort lan thu "+ i + " : " + Arrays.toString(arr));
            for (int j = 0; j < length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
//                    int temp = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j+1] = temp;
                    SwapNumbers.swap(arr, j, j + 1);
                }
            }
        }
    }

    public static void sortAscendingIntegerImprovement(int arr[]) {
        int length = arr.length;
        for (int i = 0; i < length; i++) {
            // Thêm cờ để check, khi không phát hiện lần swap nào, nghĩa là đã sắp xếp
            boolean isSorted = true;
            System.out.println("Sort lan thu "+ i + " : " + Arrays.toString(arr));
            for (int j = 0; j < length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    SwapNumbers.swap(arr, j, j + 1);
                    isSorted = false;
                }
            }
            if(isSorted)
                break;
        }
    }

    public static void sortDescendingInteger(int arr[]) {
        int length = arr.length;
        for (int i = 0; i < length; i++) {
            // Thêm cờ để check, khi không phát hiện lần swap nào, nghĩa là đã sắp xếp
            boolean isSorted = true;
            for (int j = 0; j < length - i - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    SwapNumbers.swap(arr, j, j + 1);
                    isSorted = false;
                }
            }
            if(isSorted)
                break;
        }
    }

    public static void main(String[] args) {
        int arr[] = new int[]{2, 5, 1, 3, 4, 6};
        System.out.println("Before sorting: " + Arrays.toString(arr));
        sortAscendingInteger(arr);
        System.out.println("After sorting: " + Arrays.toString(arr));

        int arr2[] = new int[]{2, 5, 1, 3, 4, 6};
        System.out.println("Before sorting: " + Arrays.toString(arr2));
        sortAscendingIntegerImprovement(arr2);
        System.out.println("After sorting: " + Arrays.toString(arr2));
        sortDescendingInteger(arr2);
        System.out.println("After sorting (descending): " + Arrays.toString(arr2));
    }
}
