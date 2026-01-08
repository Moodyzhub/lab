package dto;

// DTO (Data Transfer Object): Dùng để đóng gói dữ liệu truyền giữa các lớp (VD: từ Main -> Controller)
// Giúp hàm nhận 1 tham số là object thay vì nhận quá nhiều tham số lẻ tẻ
public class CountryDTO {
    private String code;
    private String name;
    private float area;
    private String terrain;

    // Constructor khởi tạo dữ liệu
    public CountryDTO(String code, String name, float area, String terrain) {
        this.code = code;
        this.name = name;
        this.area = area;
        this.terrain = terrain;
    }

    // Các getter để lấy dữ liệu ra xử lý
    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public float getArea() {
        return area;
    }

    public String getTerrain() {
        return terrain;
    }
}
