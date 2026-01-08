package root;

import controller.CountryController;
import dto.CountryDTO;
import utils.Validation;
import constants.Message;

// Class Main: Điểm bắt đầu của chương trình (có hàm main)
public class Main {
    public static void main(String[] args) {
        // Khởi tạo Controller để điều khiển chương trình
        CountryController controller = new CountryController();

        // Vòng lặp chính để menu hiện lại liên tục cho đến khi chọn Exit
        while (true) {
            // 1. Hiển thị menu
            controller.showMenu();

            // 2. Yêu cầu nhập lựa chọn (đảm bảo nhập số hợp lệ 1-5)
            int choice = Validation.getInt(Message.MSG_ENTER_CHOICE, 1, 5);

            // 3. Xử lý theo lựa chọn
            switch (choice) {
                case 1: // Nhập thông tin
                    String code = Validation.getString(Message.MSG_COUNTRY_CODE);
                    String name = Validation.getString(Message.MSG_COUNTRY_NAME);
                    float area = Validation.getFloat(Message.MSG_TOTAL_AREA);
                    String terrain = Validation.getString(Message.MSG_TERRAIN);

                    // Đóng gói vào DTO và gửi cho Controller xử lý
                    controller.addCountry(new CountryDTO(code, name, area, terrain));
                    break;
                case 2: // Hiển thị danh sách vừa nhập
                    controller.displayAll();
                    break;
                case 3: // Tìm kiếm
                    String searchName = Validation.getString(Message.MSG_SEARCH_NAME);
                    controller.searchByName(searchName);
                    break;
                case 4: // Hiển thị sắp xếp
                    controller.displaySorted();
                    break;
                case 5: // Thoát
                    return;
            }
        }
    }
}
