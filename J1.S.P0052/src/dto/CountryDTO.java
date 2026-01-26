package dto;

public class CountryDTO {
    private String code;
    private String name;
    private float area;
    private String terrain;

    public CountryDTO(String code, String name, float area, String terrain) {
        this.code = code;
        this.name = name;
        this.area = area;
        this.terrain = terrain;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public float getArea() {
        return area;
    }

    public String getTerrain() {
        return terrain;
    }
}
