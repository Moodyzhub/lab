package constants;

// Class này chứa các chuỗi thông báo cố định dùng trong chương trình
// Mục đích: Tránh việc gõ lại chuỗi nhiều lần ("Magic Strings") gây lỗi chính tả và khó bảo trì
public class Message {
    public static final String MSG_ENTER_CHOICE = "Enter your choice: "; // Thông báo nhập lựa chọn menu
    public static final String MSG_INVALID_CHOICE = "Please input number from 1 to 5."; // Thông báo lỗi nhập sai menu
    public static final String MSG_COUNTRY_CODE = "Enter code of country: "; // Nhập mã quốc gia
    public static final String MSG_COUNTRY_NAME = "Enter name of country: "; // Nhập tên quốc gia
    public static final String MSG_TOTAL_AREA = "Enter total Area: "; // Nhập diện tích
    public static final String MSG_TERRAIN = "Enter terrain of country: "; // Nhập địa hình
    public static final String MSG_SEARCH_NAME = "Enter the name you want to search for: "; // Nhập tên cần tìm
}
