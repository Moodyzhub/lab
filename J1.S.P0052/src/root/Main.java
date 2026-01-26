package root;

import controller.CountryController;
import dto.CountryDTO;
import utils.Validation;
import constants.Message;

public class Main {
    public static void main(String[] args) {
        CountryController controller = new CountryController();
        int choice;

        while (true) {
            controller.showMenu();
            choice = Validation.getInt(Message.MSG_ENTER_CHOICE, 1, 5);

            switch (choice) {
                case 1: {
                    String code = Validation.getString(Message.MSG_COUNTRY_CODE);
                    String name = Validation.getString(Message.MSG_COUNTRY_NAME);
                    float area = Validation.getFloat(Message.MSG_TOTAL_AREA);
                    String terrain = Validation.getString(Message.MSG_TERRAIN);
                    controller.addCountry(new CountryDTO(code, name, area, terrain));
                    break;
                }
                case 2: {
                    controller.displayAll();
                    break;
                }
                case 3: {
                    controller.searchByName(Validation.getString(Message.MSG_SEARCH_NAME));
                    break;
                }
                case 4: {
                    controller.displaySorted();
                    break;
                }
                case 5: {
                    return;
                }
            }
        }
    }
}
