package controller;

import dto.CountryDTO;
import model.EastAsiaCountries;
import service.CountryService;
import view.CountryView;
import java.util.List;

// Class Controller: Điều phối luồng chương trình, kết nối View - Service - Model
public class CountryController {
    // Khởi tạo Service để xử lý logic và View để hiển thị
    private CountryService service = new CountryService();
    private CountryView view = new CountryView();

    // Hàm nhận dữ liệu từ Main (qua DTO), tạo đối tượng Model và gọi Service lưu
    // trữ
    public void addCountry(CountryDTO dto) {
        try {
            // Chuyển đổi từ DTO sang Model thực tế (EastAsiaCountries)
            EastAsiaCountries country = new EastAsiaCountries(dto.getCode(), dto.getName(), dto.getArea(),
                    dto.getTerrain());

            // Gọi service để thêm vào danh sách
            service.addCountryInformation(country);
        } catch (Exception e) {
            // Nếu có lỗi (VD: diện tích <= 0), bắt lỗi và nhờ View hiển thị
            view.displayError(e.getMessage());
        }
    }

    // Hàm hiển thị tất cả quốc gia vừa nhập
    public void displayAll() {
        // Lấy danh sách từ Service
        List<EastAsiaCountries> list = service.getRecentlyEnteredInformation();
        // Gọi hàm in danh sách
        printList(list);
    }

    // Hàm tìm kiếm theo tên
    public void searchByName(String name) {
        // Gọi service tìm kiếm
        List<EastAsiaCountries> list = service.searchInformationByName(name);
        // In kết quả tìm được
        printList(list);
    }

    // Hàm hiển thị danh sách đã sắp xếp
    public void displaySorted() {
        // Gọi service lấy danh sách đã sắp xếp
        List<EastAsiaCountries> list = service.sortInformationByAscendingOrder();
        // In danh sách
        printList(list);
    }

    // Hàm phụ trợ để in danh sách (tránh lặp code)
    private void printList(List<EastAsiaCountries> list) {
        if (list.isEmpty()) {
            view.displayError("List is empty!"); // Thông báo nếu danh sách rỗng
            return;
        }
        view.displayHeader(); // In tiêu đề bảng
        // Duyệt và in từng quốc gia
        for (EastAsiaCountries c : list) {
            view.displayCountry(c.toString());
        }
    }

    // Gọi View hiển thị menu
    public void showMenu() {
        view.displayMenu();
    }
}
