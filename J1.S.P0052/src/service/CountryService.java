package service;

import model.EastAsiaCountries;
import java.util.*;
import java.util.stream.Collectors;

public class CountryService {
    private List<EastAsiaCountries> countryList = new ArrayList<>();

    public void addCountryInformation(EastAsiaCountries country) throws Exception {
        if (country.getTotalArea() <= 0) {
            throw new Exception("Error: Total area must be greater than 0.");
        }
        countryList.add(country);
    }

    public List<EastAsiaCountries> getRecentlyEnteredInformation() {
        return countryList;
    }

    public List<EastAsiaCountries> searchInformationByName(String name) {
        return countryList.stream()
                .filter(c -> c.getCountryName().toLowerCase().contains(name.toLowerCase()))
                .collect(Collectors.toList());
    }

    public List<EastAsiaCountries> sortInformationByAscendingOrder() {
        List<EastAsiaCountries> sorted = new ArrayList<>(countryList);
        Collections.sort(sorted, (c1, c2) -> c1.getCountryName().compareToIgnoreCase(c2.getCountryName()));
        return sorted;
    }
}
