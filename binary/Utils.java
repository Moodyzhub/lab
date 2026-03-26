import java.util.Random;

// Lớp Utils chứa các tiện ích thuật toán xử lý mảng
public class Utils {

    // Khởi tạo và trả về mảng số nguyên ngẫu nhiên
    public static int[] generateArray(int length) {
        int[] array = new int[length];
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            array[i] = random.nextInt(length);
        }
        return array;
    }

    // Thuật toán Bubble Sort sắp xếp mảng tăng dần
    public static void bubbleSort(int[] array) {
        if (array == null) return;
        boolean swapped = true;
        int j = 0;
        int tmp;
        
        // Vòng lặp sắp xếp các phần tử liên tiếp
        while (swapped) {
            swapped = false;
            j++;
            for (int i = 0; i < array.length - j; i++) {
                if (array[i] > array[i + 1]) {
                    tmp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = tmp;
                    swapped = true;
                }
            }
        }
    }

    // Thuật toán Binary Search dùng đệ quy để tìm kiếm
    public static int binarySearch(int[] array, int value, int left, int right) {
        if (left > right) {
            return -1;
        }
        
        int middle = (left + right) / 2;
        
        if (array[middle] == value) {
            return middle;
        } else if (array[middle] > value) {
            return binarySearch(array, value, left, middle - 1);
        } else {
            return binarySearch(array, value, middle + 1, right);
        }
    }
}
