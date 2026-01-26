package service;

import model.EastAsiaCountry;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Service class for managing country operations (business logic).
 */
public class CountryService {
    private List<EastAsiaCountry> countryList = new ArrayList<>();

    /**
     * Adds country information to the list.
     * 
     * @param country The country object to add
     * @throws Exception if validation fails (e.g. area <= 0)
     */
    public void addCountryInformation(EastAsiaCountry country) throws Exception {
        // Validate total area
        if (country.getTotalArea() <= 0) {
            throw new Exception("Error: Total area must be greater than 0.");
        }
        // Add valid country to list
        countryList.add(country);
    }

    /**
     * Gets the list of recently entered countries.
     * 
     * @return List of countries
     */
    public List<EastAsiaCountry> getRecentlyEnteredInformation() {
        return countryList;
    }

    /**
     * Searches for countries containing the specified name.
     * 
     * @param name The name to search for
     * @return List of matching countries
     */
    public List<EastAsiaCountry> searchInformationByName(String name) {
        // Filter list using stream
        return countryList.stream()
                .filter(c -> c.getCountryName().toLowerCase().contains(name.toLowerCase()))
                .collect(Collectors.toList());
    }

    /**
     * Sorts the country list by name in ascending order.
     * 
     * @return Sorted list of countries
     */
    public List<EastAsiaCountry> sortInformationByAscendingOrder() {
        // Create a copy to sort
        List<EastAsiaCountry> sorted = new ArrayList<>(countryList);
        // Sort using comparator
        Collections.sort(sorted, (c1, c2) -> c1.getCountryName().compareToIgnoreCase(c2.getCountryName()));
        return sorted;
    }
}
