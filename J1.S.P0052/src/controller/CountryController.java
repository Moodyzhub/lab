package controller;

import dto.CountryDTO;
import model.EastAsiaCountries;
import service.CountryService;
import view.CountryView;
import java.util.List;

public class CountryController {
    private CountryService service = new CountryService();
    private CountryView view = new CountryView();

    public void addCountry(CountryDTO dto) {
        try {
            EastAsiaCountries country = new EastAsiaCountries(dto.getCode(), dto.getName(), dto.getArea(),
                    dto.getTerrain());
            service.addCountryInformation(country);
        } catch (Exception e) {
            view.displayError(e.getMessage());
        }
    }

    public void displayAll() {
        List<EastAsiaCountries> list = service.getRecentlyEnteredInformation();
        printList(list);
    }

    public void searchByName(String name) {
        List<EastAsiaCountries> list = service.searchInformationByName(name);
        printList(list);
    }

    public void displaySorted() {
        List<EastAsiaCountries> list = service.sortInformationByAscendingOrder();
        printList(list);
    }

    private void printList(List<EastAsiaCountries> list) {
        if (list.isEmpty()) {
            view.displayError("List is empty!");
            return;
        }
        view.displayHeader();
        for (EastAsiaCountries c : list) {
            view.displayCountry(c.toString());
        }
    }

    public void showMenu() {
        view.displayMenu();
    }
}
