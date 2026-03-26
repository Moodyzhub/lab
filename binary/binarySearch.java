import java.util.Scanner;

// Lớp chính điều phối chung toàn bộ ứng dụng
public class BinarySearch {

    // Phương thức main xử lý toàn bộ luồng điền dữ liệu
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Khởi tạo các thành phần logic
        Model model = new Model();
        Repository repository = new Repository(model);
        View view = new View();

        // Yêu cầu người dùng nhập số lượng phần tử của mảng
        System.out.println("Enter number of array:");
        int length = scanner.nextInt();
        scanner.nextLine();

        // Yêu cầu người dùng nhập giá trị cần tìm kiếm
        System.out.println("Enter search value:");
        int search = scanner.nextInt();

        // Sinh mảng và tiến hành sắp xếp thông qua Repository
        repository.generateArray(length);
        repository.bubbleSort();

        // Xuất mảng đã được sắp xếp thông qua View
        System.out.print("Sorted array: ");
        view.displayArray(repository.getArray());

        // Thực hiện tìm kiếm nhị phân thông qua Repository
        int foundIndex = repository.binarySearch(search, 0, length - 1);

        // Hiển thị chỉ số tìm kiếm nhận được
        System.out.println("\nFound " + search + " at index: " + foundIndex);

        // Đóng hệ thống bộ gõ khi kết thúc
        scanner.close();
    }
}