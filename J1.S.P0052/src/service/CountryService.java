package service;

import model.EastAsiaCountries;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CountryService {
    // Danh sách lưu trữ các quốc gia
    private List<EastAsiaCountries> countryList = new ArrayList<>();

    // Hàm thêm quốc gia mới
    public void addCountryInformation(EastAsiaCountries country) throws Exception {
        // Kiểm tra logic: Diện tích phải > 0
        if (country.getTotalArea() <= 0) {
            throw new Exception("Error: Total area must be greater than 0.");
        }
        countryList.add(country);
    }

    // Hàm lấy danh sách các quốc gia vừa nhập
    public List<EastAsiaCountries> getRecentlyEnteredInformation() {
        return countryList;
    }

    // Hàm tìm kiếm theo tên (viết đơn giản bằng vòng lặp)
    public List<EastAsiaCountries> searchInformationByName(String name) {
        List<EastAsiaCountries> result = new ArrayList<>();

        // Duyệt qua từng quốc gia trong danh sách
        for (EastAsiaCountries c : countryList) {
            // Kiểm tra tên có chứa chuỗi tìm kiếm không (bỏ qua chữ hoa/thường)
            if (c.getCountryName().toLowerCase().contains(name.toLowerCase())) {
                result.add(c);
            }
        }
        return result;
    }

    // Hàm sắp xếp danh sách theo tên (A-Z)
    public List<EastAsiaCountries> sortInformationByAscendingOrder() {
        // Tạo một danh sách mới để sắp xếp (tránh làm thay đổi danh sách gốc)
        List<EastAsiaCountries> sortedList = new ArrayList<>(countryList);

        // Sử dụng Comparator để định nghĩa quy tắc so sánh
        Collections.sort(sortedList, new Comparator<EastAsiaCountries>() {
            @Override
            public int compare(EastAsiaCountries c1, EastAsiaCountries c2) {
                return c1.getCountryName().compareTo(c2.getCountryName());
            }
        });

        return sortedList;
    }
}
