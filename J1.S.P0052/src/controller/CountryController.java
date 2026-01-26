package controller;

import dto.CountryDTO;
import model.EastAsiaCountry;
import service.CountryService;
import view.CountryView;
import java.util.List;

/**
 * Controller class to handle requests from Main and interact with Service and
 * View.
 */
public class CountryController {
    private CountryService service = new CountryService();
    private CountryView view = new CountryView();

    /**
     * Adds a new country to the list.
     * 
     * @param dto Data Transfer Object containing country information
     */
    public void addCountry(CountryDTO dto) {
        try {
            // Create country model from DTO
            EastAsiaCountry country = new EastAsiaCountry(dto.getCode(), dto.getName(), dto.getArea(),
                    dto.getTerrain());
            // Call service to add country
            service.addCountryInformation(country);
        } catch (Exception e) {
            // Display error message if adding fails
            view.displayError(e.getMessage());
        }
    }

    /**
     * Displays all countries currently in the list.
     */
    public void displayAll() {
        // Get list from service and display via view
        List<EastAsiaCountry> list = service.getRecentlyEnteredInformation();
        view.setCountryList(list);
        view.displayList();
    }

    /**
     * Searches for countries by name and displays the result.
     * 
     * @param name The name or partial name to search for
     */
    public void searchByName(String name) {
        // Get filtered list from service and display
        List<EastAsiaCountry> list = service.searchInformationByName(name);
        view.setCountryList(list);
        view.displayList();
    }

    /**
     * Displays all countries sorted by name in ascending order.
     */
    public void displaySorted() {
        // Get sorted list from service and display
        List<EastAsiaCountry> list = service.sortInformationByAscendingOrder();
        view.setCountryList(list);
        view.displayList();
    }

    /**
     * Displays the main menu.
     */
    public void showMenu() {
        view.displayMenu();
    }
}
