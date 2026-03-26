// Lớp Repository quản lý thao tác với Model thông qua Utils
public class Repository {
    // Tham chiếu đến thực thể Model
    private Model model;

    // Khởi tạo Repository với Model truyền vào
    public Repository(Model model) {
        this.model = model;
    }

    // Dùng Utils sinh mảng ngẫu nhiên và lưu vào Model
    public void generateArray(int length) {
        int[] newArray = Utils.generateArray(length);
        model.setArray(newArray);
    }

    // Lấy mảng dự liệu từ Model
    public int[] getArray() {
        return model.getArray();
    }

    // Dùng Utils để sắp xếp trên mảng của Model
    public void bubbleSort() {
        Utils.bubbleSort(model.getArray());
    }

    // Dùng Utils để tìm kiếm trên mảng của Model
    public int binarySearch(int value, int left, int right) {
        return Utils.binarySearch(model.getArray(), value, left, right);
    }
}
