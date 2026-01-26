package service;

import model.EastAsiaCountry;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class CountryService {
    private List<EastAsiaCountry> countryList = new ArrayList<>();

    public void addCountryInformation(EastAsiaCountry country) throws Exception {
        if (country.getTotalArea() <= 0) {
            throw new Exception("Error: Total area must be greater than 0.");
        }
        countryList.add(country);
    }

    public List<EastAsiaCountry> getRecentlyEnteredInformation() {
        return countryList;
    }

    public List<EastAsiaCountry> searchInformationByName(String name) {
        return countryList.stream()
                .filter(c -> c.getCountryName().toLowerCase().contains(name.toLowerCase()))
                .collect(Collectors.toList());
    }

    public List<EastAsiaCountry> sortInformationByAscendingOrder() {
        List<EastAsiaCountry> sorted = new ArrayList<>(countryList);
        Collections.sort(sorted, (c1, c2) -> c1.getCountryName().compareToIgnoreCase(c2.getCountryName()));
        return sorted;
    }
}
