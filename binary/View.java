import java.util.Scanner;

// Lớp View chịu trách nhiệm hiển thị và tương tác với người dùng
public class View {
    // Scanner để nhận đầu vào từ bàn phím
    private Scanner scanner = new Scanner(System.in);

    // Yêu cầu người dùng nhập số lượng phần tử của mảng
    public int inputLength() {
        System.out.println("Enter number of array:");
        int length = scanner.nextInt();
        scanner.nextLine();
        return length;
    }

    // Yêu cầu người dùng nhập giá trị cần tìm kiếm
    public int inputSearchValue() {
        System.out.println("Enter search value:");
        return scanner.nextInt();
    }

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

    // In thông báo khi mảng đã được sắp xếp
    public void displaySortedMessage() {
        System.out.print("Sorted array: ");
    }

    // In thông báo kết quả tìm kiếm
    public void displaySearchResult(int searchValue, int foundIndex) {
        System.out.println("\nFound " + searchValue + " at index: " + foundIndex);
    }

    // Đóng scanner
    public void closeScanner() {
        scanner.close();
    }
}
