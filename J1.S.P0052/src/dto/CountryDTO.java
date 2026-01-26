package dto;

/**
 * Data Transfer Object for carrying Country data between layers.
 */
public class CountryDTO {
    private String code;
    private String name;
    private float area;
    private String terrain;

    /**
     * Constructor for CountryDTO.
     * 
     * @param code    Country ID/Code
     * @param name    Name of the country
     * @param area    Total area of the country
     * @param terrain Terrain of the country
     */
    public CountryDTO(String code, String name, float area, String terrain) {
        this.code = code;
        this.name = name;
        this.area = area;
        this.terrain = terrain;
    }

    /**
     * Gets country code.
     * 
     * @return code
     */
    public String getCode() {
        return code;
    }

    /**
     * Gets country name.
     * 
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Gets total area.
     * 
     * @return area
     */
    public float getArea() {
        return area;
    }

    /**
     * Gets terrain.
     * 
     * @return terrain
     */
    public String getTerrain() {
        return terrain;
    }
}
