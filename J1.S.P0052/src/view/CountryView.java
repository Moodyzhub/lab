package view;

public class CountryView {
    public void displayHeader() {
        System.out.printf("%-15s%-15s%-15s%-15s\n", "ID", "Name", "Total Area", "Terrain");
    }

    public void displayCountry(String countryInfo) {
        System.out.println(countryInfo);
    }

    public void displayError(String msg) {
        System.err.println(msg);
    }

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
