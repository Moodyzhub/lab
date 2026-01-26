# Java Coding Convention & Quality Checksheet

**Role:** Java SE 8 Expert & Code Reviewer
**Context:** Apply these strict rules to all Java code generated or reviewed.

---

## 1. Common Architecture & Naming (Mã 1.1 - 1.6)

### 1.1 MVC Architecture
- **Đã đúng MVC chưa?**
- **Main:** Chỉ làm việc với Controller, DTO, Utils.
- **Controller:** - Nhận input từ main qua DTO, gửi/nhận data qua Services, Model.
    - Chỉ gửi kết quả cần hiển thị sang View.
    - Không thực hiện print thông tin gì ở controller. 
    - Cần hiển thị thông tin gì thì gọi qua View. 
    - Việc rendering khi gọi view chỉ được gọi 1 lần cho 1 luồng xử lý.
    - **Note:** Tách Repository khỏi Controller từ bài thứ 2 trở đi.
- **Services:** - Nhận data từ controller (Có thể thông qua param nếu param ít) -> xử lý nghiệp vụ và trả kết quả về controller. 
    - Được giao tiếp với Model. 
    - Không thực hiện print thông tin gì ở đây.
- **Model:** - Chỉ làm nhiệm vụ miêu tả thực thể, không làm việc với View. 
    - Không thực hiện print thông tin gì ở đây.
- **View:** - Chỉ nhận thông tin từ Controller. 
    - Không truyền qua param mà phải nhận qua thuộc tính class.

### 1.2 Package Naming
- Package là chữ thường, thể hiện được ý nghĩa chung của package.

### 1.3 Class Naming & Design
- Class bắt đầu bằng chữ hoa.
- Tên class bắt đầu bằng danh từ mô tả ý nghĩa của class.
- Phải thể hiện được ý nghĩa mục đích của method.
- Đảm bảo **S trong SOLID**.
- Tên của class exception kết thúc bằng `"Exception"`.
- Tên của interface bắt đầu bằng `"I"`.

### 1.4 Method Naming
- Method bắt đầu bằng chữ thường.
- Tên method bắt đầu bằng động từ mô tả chức năng của method.
- Phải thể hiện được ý nghĩa mục đích của method.
- Đảm bảo **SRP trong SOLID**.

### 1.5 Variable Naming
- Tên biến bắt đầu bằng chữ thường và có ý nghĩa.
- Tên biến kiểu collection (list, collection) kết thúc bằng `"List"`.
- Tên biến kiểu set (Set, HashSet,...) kết thúc bằng `"Set"`.
- Tên biến kiểu Map (Map, HashMap, TreeMap,...) kết thúc bằng `"Map"`.
- Tên biến kiểu Array kết thúc bằng `Array`.
- Khi refer đến ID thì thống nhất viết là `"Id"`, không viết là `"ID"`.

### 1.6 Comments
- Comment ngắn gọn, rõ ràng. Dùng Javadoc cho class/method nếu cần. Ví dụ: `/** This method gets user by ID */`.
- Mỗi method đều phải có comment miêu tả ý nghĩa của method.
- Mỗi block source đều phải có comment giải thích block đó làm gì.

---

## 2. Coding Convention (Mã 2.1 - 2.11)

- **2.1 Formatting:** `"{"` nằm ở kết thúc của line. `"}"` nằm ở bắt đầu của line.
- **2.2 Braces:** Dù block có 1 dòng code cũng đặt trong `{ }`.
- **2.3 Line Length:** 1 line (không tính comment) không dài quá 100 kí tự. Khi dài hơn 100 ký tự thì break ở:
    - Sau toán tử logic (and, or,...).
    - Hạn chế break giữa biểu thức trong `()`.
    - Trước toán tử (+, -, *, ...).
- **2.4 Variable Declaration:** Mỗi khai báo biến để trên 1 dòng.
- **2.5 Array:** Khai báo array thống nhất theo kiểu `Type[] anArray;`.
- **2.6 Variable Placement:** Biến được khai báo tập trung ở đầu mỗi block code.
- **2.7 Statements:** Mỗi statement nằm trên 1 line.
- **2.8 Blank Lines:** Có 1 blank line giữa các method, giữa vùng khai báo biến và vùng còn lại, trước block comment, trước line comment, giữa các block code xử lý logic.
- **2.9 Spacing:** Có 1 space ở các vị trí:
    - Trước `(`.
    - Sau `","`.
    - Trước và sau các phép tính (`=`, `+`, `-`, `*`, `/`, `(trong for)...`).
- **2.10 Constants:** Tất cả hằng số cần để vào một class riêng đặt (`Constants.java`).
    - Constant viết chữ hoa, phân cách bằng `"_"`.
    - Constant khai báo `static final`.
- **2.11 Messages:** Tất cả message cần để vào một constant class riêng đặt (`Message.java`).
    - Constant viết chữ hoa, phân cách bằng `"_"`.
    - Constant khai báo `static final`.

---

## 3. Performance & Safety (Mã 3.1 - 3.10)

- **3.1 Static Access:** Sử dụng class để truy cập vào biến, method static.
- **3.2 Shadowing:** Không khai báo biến local trùng tên với biến higher level.
- **3.3 Explicit Order:** Sử dụng `()` để làm tường minh thứ tự các phép tính.
- **3.4 Utility Class:** Class chỉ có static method thì phải có `private constructor`, và khai báo class là `final`.
- **3.5 Comparisons:** - Khi so sánh giá trị của object chẳng hạn như là String thì phải dùng phương thức `.equals()` chứ không được dùng toán tử `==`.
    - Chú ý đến case sensitive khi so sánh text.
- **3.6 Resource Management:** Thực hiện xử lý open và close cursor 1 cách thích hợp.
- **3.7 Unused Variables:** Không được có biến khai báo mà không dùng ở đâu cả.
- **3.8 Initialization:** Biến có declare khi bắt đầu xử lý và thực hiện khởi tạo.
- **3.9 File Handling:** Đã close file khi hoàn thành việc output, khi gặp exception chưa?
- **3.10 String Concatenation:** Khi thực hiện cộng string thì sử dụng `StringBuilder`, không dùng `String += String`.