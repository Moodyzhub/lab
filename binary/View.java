// Lớp View chỉ chịu trách nhiệm hiển thị cấu trúc của mảng
public class View {
    
    // Hiển thị các phần tử của mảng ra màn hình
    public void displayArray(int[] arr) {
        System.out.print("[");
        if (arr != null) {
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i]);
                if (i < arr.length - 1) {
                    System.out.print(", ");
                }
            }
        }
        System.out.print("]");
    }
}
