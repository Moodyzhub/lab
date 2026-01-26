package model;

/**
 * Base class representing generic country information.
 */
public class Country {
    protected String countryCode;
    protected String countryName;
    protected float totalArea;

    /**
     * Default constructor.
     */
    public Country() {
    }

    /**
     * Constructor with parameters.
     * 
     * @param countryCode Country ID/Code
     * @param countryName Name of the country
     * @param totalArea   Total area of the country
     */
    public Country(String countryCode, String countryName, float totalArea) {
        this.countryCode = countryCode;
        this.countryName = countryName;
        this.totalArea = totalArea;
    }

    /**
     * Gets the country code.
     * 
     * @return Country code
     */
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * Gets the country name.
     * 
     * @return Country name
     */
    public String getCountryName() {
        return countryName;
    }

    /**
     * Gets the total area.
     * 
     * @return Total area
     */
    public float getTotalArea() {
        return totalArea;
    }
}
