package view;

import model.EastAsiaCountry;
import java.util.List;

/**
 * View class responsible for displaying information to the user.
 */
public class CountryView {
    private List<EastAsiaCountry> countryList;

    /**
     * Sets the list of countries to be displayed.
     * 
     * @param countryList The list of countries
     */
    public void setCountryList(List<EastAsiaCountry> countryList) {
        this.countryList = countryList;
    }

    /**
     * Displays the header for the country list table.
     */
    public void displayHeader() {
        System.out.printf("%-15s%-15s%-15s%-15s\n", "ID", "Name", "Total Area", "Terrain");
    }

    /**
     * Displays the list of countries currently set in the view.
     */
    public void displayList() {
        // Check if list is empty
        if (countryList == null || countryList.isEmpty()) {
            System.err.println("List is empty!");
            return;
        }
        // Iterate through list and display each country
        displayHeader();
        for (EastAsiaCountry c : countryList) {
            System.out.printf("%-15s%-15s%-15.1f%-15s\n",
                    c.getCountryCode(), c.getCountryName(), c.getTotalArea(), c.getCountryTerrain());
        }
    }

    /**
     * Displays an error message.
     * 
     * @param msg The error message to display
     */
    public void displayError(String msg) {
        System.err.println(msg);
    }

    /**
     * Displays the main menu options.
     */
    public void displayMenu() {
        System.out.println("\n                                MENU");
        System.out.println("==========================================================================");
        System.out.println("1. Input the information of 11 countries in East Asia");
        System.out.println("2. Display the information of country you've just input");
        System.out.println("3. Search the information of country by user-entered name");
        System.out.println("4. Display the information of countries sorted name in ascending order");
        System.out.println("5. Exit");
        System.out.println("==========================================================================");
    }
}
