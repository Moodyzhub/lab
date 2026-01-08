package view;

// Class View: Chịu trách nhiệm hiển thị thông tin ra màn hình console
// Không thực hiện xử lý logic nghiệp vụ hay lưu trữ dữ liệu
public class CountryView {

    // Hiển thị dòng tiêu đề của bảng kết quả
    public void displayHeader() {
        System.out.printf("%-15s%-15s%-15s%-15s\n", "ID", "Name", "Total Area", "Terrain");
    }

    // Hiển thị thông tin một quốc gia (đã được format thành chuỗi)
    public void displayCountry(String countryInfo) {
        System.out.println(countryInfo);
    }

    // Hiển thị thông báo lỗi (dùng System.err để in chữ màu đỏ trong một số IDE)
    public void displayError(String msg) {
        System.err.println(msg);
    }

    // Hiển thị menu chức năng
    public void displayMenu() {
        System.out.println("\n                                MENU");
        System.out.println("==========================================================================");
        System.out.println("1. Input the information of 11 countries in East Asia");
        System.out.println("2. Display the information of country you've just input");
        System.out.println("3. Search the information of country by user-entered name");
        System.out.println("4. Display the information of countries sorted name in ascending order");
        System.out.println("5. Exit");
        System.out.println("==========================================================================");
    }
}
