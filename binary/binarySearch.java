
import java.util.Random;
import java.util.Scanner;

// Lớp BinarySearch cung cấp các phương thức sinh mảng ngẫu nhiên, sắp xếp và tìm kiếm nhị phân.
public class BinarySearch {

    // Phương thức chính để thực thi chương trình.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Yêu cầu người dùng nhập số lượng phần tử của mảng
        System.out.println("Enter number of array:");
        int length = scanner.nextInt();
        scanner.nextLine();

        // Yêu cầu người dùng nhập giá trị cần tìm kiếm
        System.out.println("Enter search value:");
        int search = scanner.nextInt();

        // Khởi tạo mảng và điền các giá trị ngẫu nhiên từ 0 đến length - 1
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = new Random().nextInt(length);
        }
        
        BinarySearch searcher = new BinarySearch();
        
        // Sắp xếp mảng trước khi thực hiện tìm kiếm nhị phân
        searcher.bubbleSort(array);

        // Hiển thị mảng đã được sắp xếp
        System.out.print("Sorted array: ");
        searcher.displayArray(array);

        // Gọi hàm tìm kiếm nhị phân và in ra kết quả
        int foundIndex = searcher.binarySearch(array, search, 0, length - 1);
        System.out.println("\nFound " + search + " at index: " + foundIndex);
        
        // Đóng scanner để giải phóng tài nguyên
        scanner.close();
    }

    // Hiển thị các phần tử của mảng ra màn hình với định dạng [a, b, c]
    public void displayArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            // Thêm dấu phẩy sau các phần tử, ngoại trừ phần tử cuối cùng
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.print("]");
    }

    // Thuật toán nổi bọt (Bubble Sort) để sắp xếp mảng tăng dần.
    public void bubbleSort(int[] arr) {
        boolean swapped = true;
        int j = 0;
        int tmp;
        
        // Tiếp tục lặp nếu còn xảy ra sự hoán đổi trong lần lặp trước đó
        while (swapped) {
            swapped = false;
            j++;
            
            // Duyệt qua mảng và đẩy phần tử lớn nhất về cuối
            for (int i = 0; i < arr.length - j; i++) {
                if (arr[i] > arr[i + 1]) {
                    // Hoán đổi 2 phần tử nếu phần tử trước lớn hơn phần tử sau
                    tmp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = tmp;
                    swapped = true;
                }
            }
        }
    }

    // Tìm kiếm nhị phân (Binary Search) trên mảng đã được sắp xếp.
    int binarySearch(int[] array, int value, int left, int right) {
        // Nếu left lớn hơn right tức là đã tìm hết khoảng mà không thấy giá trị
        if (left > right) {
            return -1;
        }
        
        // Tìm chỉ số phần tử ở giữa
        int middle = (left + right) / 2;
        
        if (array[middle] == value) {
            // Nếu phần tử giữa bằng giá trị cần tìm thì trả về vị trí này
            return middle;
        } else if (array[middle] > value) {
            // Nếu phần tử giữa lớn hơn giá trị cần tìm, tìm kiếm ở nửa bên trái
            return binarySearch(array, value, left, middle - 1);
        } else {
            // Nếu phần tử giữa nhỏ hơn giá trị cần tìm, tìm kiếm ở nửa bên phải
            return binarySearch(array, value, middle + 1, right);
        }
    }
}