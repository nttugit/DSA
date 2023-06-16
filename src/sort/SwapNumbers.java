package sort;

public class SwapNumbers {
    public SwapNumbers(){

    }

    public static void main(String[] args) {
        int[] numbers = {5, 10};
        System.out.println("Before swapping:");
        System.out.println("numbers[0] = " + numbers[0]);
        System.out.println("numbers[1] = " + numbers[1]);

        swap(numbers, 0, 1);

        System.out.println("After swapping:");
        System.out.println("numbers[0] = " + numbers[0]);
        System.out.println("numbers[1] = " + numbers[1]);
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
