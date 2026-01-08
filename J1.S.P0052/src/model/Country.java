package model;

// Class Country là lớp cha, biểu diễn các thông tin chung của một quốc gia
public class Country {
    // Các thuộc tính dùng protected để lớp con (EastAsiaCountries) có thể truy cập
    // trực tiếp
    protected String countryCode; // Mã quốc gia
    protected String countryName; // Tên quốc gia
    protected float totalArea; // Tổng diện tích

    // Constructor mặc định (không tham số)
    public Country() {
    }

    // Constructor đầy đủ tham số để khởi tạo đối tượng nhanh
    public Country(String countryCode, String countryName, float totalArea) {
        this.countryCode = countryCode;
        this.countryName = countryName;
        this.totalArea = totalArea;
    }

    // Các hàm getter để lấy giá trị thuộc tính (theo tính đóng gói Encapsulation)
    public String getCountryCode() {
        return countryCode;
    }

    public String getCountryName() {
        return countryName;
    }

    public float getTotalArea() {
        return totalArea;
    }
}
