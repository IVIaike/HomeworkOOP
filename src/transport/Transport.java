package transport;

public class Transport {
    private final String brand;
    private final String model;
    private final Integer releaseYear;
    private final String country;
    private String color;
    private Integer maxSpeed;


    public Transport(String brand,
                     String model,
                     Integer releaseYear,
                     String country,
                     String color,
                     Integer maxSpeed) {
        this.brand = validateCarParameters(brand);
        this.model = validateCarParameters(model);
        this.releaseYear = validateReleaseYear(releaseYear);
        this.country = validateCarParameters(country);
        this.color = validateColor(color);
        this.maxSpeed = validateMaxSpeed(maxSpeed);
    }

    private String validateColor(String value) {
        if (value == null || value.isBlank() || value.isEmpty()) {
            return "белый";
        }
        return value;
    }

    private Integer validateMaxSpeed(Integer value) {
        if (value == 0) {
            return 180;
        }
        return value;
    }

    public static int validateReleaseYear (Integer value) {
        if (value == 0) {
            return 2000;
        }
        return value;
    }

    public static String validateCarParameters (String value) {
        return validateString(value, "default");
    }
    public static String validateString(String value, String defaultValue) {
        if (value == null || value.isBlank() || value.isEmpty()) {
            return defaultValue;
        }
        return value;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public Integer getReleaseYear() {
        return releaseYear;
    }

    public String getCountry() {
        return country;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(Integer maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}
