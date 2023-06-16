import java.util.Arrays;

public class MyArray {
    /**
     * Trong Java, kiểu mảng luôn là tham chiếu, khai báo động, lưu trong vùng nhớ Heap
     * Giá trị mặc định của các phần tử phụ thuộc vào kiểu dữ liệu cua các phần tử (kieu int thi mac dinh = 0)
     */
    public static void main(String[] args) {
        int arr[] = new int[]{1,2,3,1};
        int arr2[] = new int[4];
        double arr3[] = new double[4];
        Double arr33[] = new Double[4];
        String arr4 [] = new String[4]; // Kiểu String dạng object nên mặc định là null
//        String arr4[] = new String[4];

        System.out.println(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));
        System.out.println(Arrays.toString(arr33));
        System.out.println(Arrays.toString(arr4));

    }
}
