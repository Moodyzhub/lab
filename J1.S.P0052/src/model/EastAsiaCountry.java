package model;

/**
 * Class representing generic country information in East Asia.
 */
public class EastAsiaCountry extends Country {
    private String countryTerrain;

    /**
     * Constructor for East Asia Country.
     * 
     * @param code    Country ID/Code
     * @param name    Name of the country
     * @param area    Total area of the country
     * @param terrain Terrain of the country
     */
    public EastAsiaCountry(String code, String name, float area, String terrain) {
        super(code, name, area);
        this.countryTerrain = terrain;
    }

    /**
     * Gets the terrain of the country.
     * 
     * @return Country terrain
     */
    public String getCountryTerrain() {
        return countryTerrain;
    }
}
