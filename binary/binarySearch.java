// Lớp chính để chạy chương trình theo cấu trúc MVC
public class BinarySearch {

    // Phương thức main là điểm bắt đầu của ứng dụng
    public static void main(String[] args) {
        // Khởi tạo các thành phần MVC
        Model model = new Model();
        View view = new View();
        Controller controller = new Controller(model, view);

        // Bắt đầu luồng thực thi thông qua controller
        controller.execute();
    }
}