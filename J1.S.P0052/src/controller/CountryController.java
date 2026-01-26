package controller;

import dto.CountryDTO;
import model.EastAsiaCountry;
import service.CountryService;
import view.CountryView;
import java.util.List;

public class CountryController {
    private CountryService service = new CountryService();
    private CountryView view = new CountryView();

    public void addCountry(CountryDTO dto) {
        try {
            EastAsiaCountry country = new EastAsiaCountry(dto.getCode(), dto.getName(), dto.getArea(),
                    dto.getTerrain());
            service.addCountryInformation(country);
        } catch (Exception e) {
            view.displayError(e.getMessage());
        }
    }

    public void displayAll() {
        List<EastAsiaCountry> list = service.getRecentlyEnteredInformation();
        view.setCountryList(list);
        view.displayList();
    }

    public void searchByName(String name) {
        List<EastAsiaCountry> list = service.searchInformationByName(name);
        view.setCountryList(list);
        view.displayList();
    }

    public void displaySorted() {
        List<EastAsiaCountry> list = service.sortInformationByAscendingOrder();
        view.setCountryList(list);
        view.displayList();
    }

    public void showMenu() {
        view.displayMenu();
    }
}
