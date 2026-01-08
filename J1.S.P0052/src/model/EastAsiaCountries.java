package model;

public class EastAsiaCountries extends Country {
    private String countryTerrain;

    public EastAsiaCountries(String code, String name, float area, String terrain) {
        super(code, name, area);
        this.countryTerrain = terrain;
    }

    @Override
    public String toString() {
        return String.format("%-15s%-15s%-15.1f%-15s", 
            countryCode, countryName, totalArea, countryTerrain);
    }
}
