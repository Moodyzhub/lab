package root;

import controller.CountryController;
import dto.CountryDTO;
import utils.Validation;
import constants.Message;

/**
 * Main class to run the application.
 */
public class Main {

    /**
     * The main method to start the program.
     * 
     * @param args command line arguments
     */
    public static void main(String[] args) {
        CountryController controller = new CountryController();
        int choice;

        // Loop until user chooses to exit
        while (true) {
            // Display menu and get user choice
            controller.showMenu();
            choice = Validation.getInt(Message.MSG_ENTER_CHOICE, 1, 5);

            // Perform action based on user choice
            switch (choice) {
                case 1: {
                    // Input country information
                    String code = Validation.getString(Message.MSG_COUNTRY_CODE);
                    String name = Validation.getString(Message.MSG_COUNTRY_NAME);
                    float area = Validation.getFloat(Message.MSG_TOTAL_AREA);
                    String terrain = Validation.getString(Message.MSG_TERRAIN);
                    controller.addCountry(new CountryDTO(code, name, area, terrain));
                    break;
                }
                case 2: {
                    // Display all countries
                    controller.displayAll();
                    break;
                }
                case 3: {
                    // Search country by name
                    controller.searchByName(Validation.getString(Message.MSG_SEARCH_NAME));
                    break;
                }
                case 4: {
                    // Display countries sorted by name
                    controller.displaySorted();
                    break;
                }
                case 5: {
                    // Exit program
                    return;
                }
            }
        }
    }
}
