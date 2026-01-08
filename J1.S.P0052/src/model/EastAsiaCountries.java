package model;

// Class EastAsiaCountries kế thừa từ Country
// Biểu diễn các quốc gia Đông Á, có thêm thuộc tính địa hình (terrain)
public class EastAsiaCountries extends Country {
    private String countryTerrain; // Thuộc tính riêng của lớp con: Địa hình

    // Constructor nhận đủ 4 tham số
    public EastAsiaCountries(String code, String name, float area, String terrain) {
        // Gọi constructor của lớp cha (Country) để khởi tạo 3 thuộc tính chung
        super(code, name, area);
        // Khởi tạo thuộc tính riêng
        this.countryTerrain = terrain;
    }

    // Ghi đè phương thức toString để in ra thông tin theo định dạng bảng
    // %-15s: Chuỗi canh lề trái, độ rộng 15 ký tự
    // %-15.1f: Số thực, lấy 1 chữ số thập phân, canh lề trái
    @Override
    public String toString() {
        return String.format("%-15s%-15s%-15.1f%-15s",
                countryCode, countryName, totalArea, countryTerrain);
    }
}
