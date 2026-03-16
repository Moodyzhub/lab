# Java Coding Convention & Quality Checksheet

**Role:** Java SE 8 Expert & Code Reviewer
**Context:** Apply these strict rules to all Java code generated or reviewed.

---

## 1. MVC Architecture
- **Main:** 
    - Chỉ làm việc với Controller, DTO, Utils.
    - Scanner chỉ được sử dụng ở main, không được gọi ở bất cứ đâu khác.
    - Không gọi đến model và view, chỉ làm việc với DTO, validator, controller.
    - Main đóng vai trò như front end.
- **Controller:** 
    - Nhiệm vụ chỉ là nhận input từ main, điều hướng hoạt động của Model (Services) và View, chỉ import DTO, View, Model, Service
    - Nhận input từ main qua DTO, gửi/nhận data qua Services, Model.
    - Chỉ gửi kết quả cần hiển thị sang View.
    - Không thực hiện print thông tin gì ở controller. 
    - Cần hiển thị thông tin gì thì gọi qua View. 
    - Việc rendering khi gọi view chỉ được gọi 1 lần cho 1 luồng xử lý.
    - Không dùng if else để validate ở đây, cũng như là import utils.Validation.
- **Services:** 
    - Chứa các tính toán nghiệp vụ nếu có (Tính tổng, chu vi, diện tích, report,…). Services chỉ được gọi từ Controller và được phép import Model. 
    - Đặc biệt là Services không làm việc với input, output, View.
    - Không dùng if else để validate ở đây, cũng như là import utils.Validation.
    - Nhận data từ controller (Có thể thông qua param nếu param ít) -> xử lý nghiệp vụ và trả kết quả về controller. 
    - Chỉ được gọi đến Model nếu cần thiết, không gọi View, không input từ bàn phím, không static.
    - Chỉ được gọi từ controller, không được gọi từ bất kỳ nơi nào khác
    - Không thực hiện print thông tin gì ở đây.    
- **Model:** 
    - Chỉ làm nhiệm vụ miêu tả thực thể, không làm việc với View. 
    - Không thực hiện print thông tin gì ở đây.
- **View:** 
    - Chỉ nhận thông tin từ Controller. 
    - Không truyền qua param mà phải nhận qua thuộc tính class.
    - Không được gọi sang model.

- **Validation:**
    - Chứa mọi function để validate cho toàn bộ chương trình 
    - Nên dùng static cho function
    - Không gọi qua Model, Controller hay Service
    - Không Scanner 
- **Repository:**
    - Chỉ làm việc với dữ liệu 
    - Không xử lí nghiệp vụ.
- **Comment:**
    - Phải comment các block code quan trọng 
    - comment bằng tiếng việt và thật đơn giản và dễ hiểu.



## 2. Performance & Safety 

- **2.1 Static Access:** Sử dụng class để truy cập vào biến, method static.
- **2.2 Shadowing:** Không khai báo biến local trùng tên với biến higher level.
- **2.2 Explicit Order:** Sử dụng `()` để làm tường minh thứ tự các phép tính.
- **2.4 Utility Class:** Class chỉ có static method thì phải có `private constructor`, và khai báo class là `final`.
- **2.5 Comparisons:** - Khi so sánh giá trị của object chẳng hạn như là String thì phải dùng phương thức `.equals()` chứ không được dùng toán tử `==`.
    - Chú ý đến case sensitive khi so sánh text.
- **2.6 Resource Management:** Thực hiện xử lý open và close cursor 1 cách thích hợp.
- **2.7 Unused Variables:** Không được có biến khai báo mà không dùng ở đâu cả.
- **2.8 Initialization:** Biến có declare khi bắt đầu xử lý và thực hiện khởi tạo.
- **2.9 File Handling:** Đã close file khi hoàn thành việc output, khi gặp exception chưa?
- **2.10 String Concatenation:** Khi thực hiện cộng string thì sử dụng `StringBuilder`, không dùng `String += String`.