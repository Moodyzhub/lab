// Lớp Controller điều phối logic giữa View và Model
public class Controller {
    // Thuộc tính tham chiếu đến Model và View
    private Model model;
    private View view;

    // Khởi tạo Controller với Model và View cụ thể
    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    // Thực thi luồng chính của chương trình
    public void execute() {
        // Sử dụng view để lấy dữ liệu đầu vào
        int length = view.inputLength();
        int search = view.inputSearchValue();

        // Sử dụng model để tạo mảng và sắp xếp (logic nghiệp vụ)
        model.generateArray(length);
        model.bubbleSort();

        // Sử dụng view để hiển thị kết quả từ model
        view.displaySortedMessage();
        view.displayArray(model.getArray());

        // Sử dụng model để thực hiện tìm kiếm nhị phân
        int foundIndex = model.binarySearch(search, 0, length - 1);

        // Sử dụng view để hiển thị chỉ số tìm được
        view.displaySearchResult(search, foundIndex);

        // Đóng scanner khi kết thúc
        view.closeScanner();
    }
}
