import java.util.Random;

// Lớp Model xử lý logic nghiệp vụ và dữ liệu
public class Model {
    // Trạng thái mảng nội bộ
    private int[] array;

    // Khởi tạo mảng ngẫu nhiên
    public void generateArray(int length) {
        array = new int[length];
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            array[i] = random.nextInt(length);
        }
    }

    // Lấy thông tin mảng hiện tại
    public int[] getArray() {
        return array;
    }

    // Thuật toán Bubble Sort sắp xếp mảng
    public void bubbleSort() {
        if (array == null) return;
        boolean swapped = true;
        int j = 0;
        int tmp;
        
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

    // Thuật toán Binary Search tìm kiếm giá trị
    public int binarySearch(int value, int left, int right) {
        if (left > right) {
            return -1;
        }
        
        int middle = (left + right) / 2;
        
        if (array[middle] == value) {
            return middle;
        } else if (array[middle] > value) {
            return binarySearch(value, left, middle - 1);
        } else {
            return binarySearch(value, middle + 1, right);
        }
    }
}
