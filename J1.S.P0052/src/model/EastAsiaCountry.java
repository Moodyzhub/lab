package model;

public class EastAsiaCountry extends Country {
    private String countryTerrain;

    public EastAsiaCountry(String code, String name, float area, String terrain) {
        super(code, name, area);
        this.countryTerrain = terrain;
    }

    public String getCountryTerrain() {
        return countryTerrain;
    }
}
