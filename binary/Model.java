// Lớp Model chỉ chứa duy nhất dữ liệu mảng như một POJO
public class Model {
    // Trạng thái mảng nội bộ
    private int[] array;

    // Lấy thông tin mảng hiện tại
    public int[] getArray() {
        return array;
    }

    // Gán dữ liệu cho mảng
    public void setArray(int[] array) {
        this.array = array;
    }
}
