public class Car {

    private String brand;
    private String model;
    private double engineVolume;
    private String color;
    private Integer releaseYear;
    private String country;

    public Car() {
    }

    public Car(String brand, String model, double engineVolume, String color, Integer releaseYear, String country) {
        this.brand = validateCarParameters(brand);
        this.model = validateCarParameters(model);
        this.engineVolume = validateEngineVolume(engineVolume);
        this.color = validateCarColor(color);
        this.releaseYear = validateReleaseYear(releaseYear);
        this.country = validateCarParameters(country);
    }

    public static double validateEngineVolume(double value) {
        if (value <= 0) {
            return 1.5;
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
    public static String validateCarColor (String value) {
        if (value == null || value.isBlank() || value.isEmpty()) {
            return "белый";
        }
        return value;
    }

    public String getBrand() {
        return brand;
    }

    @Override
    public String toString() {
        return "Автомобиль - " +
                "производитель: " + brand +
                ", модель: " + model +
                ", объем двигателя: " + engineVolume +
                ", цвет: " + color +
                ", год выпуска: " + releaseYear +
                ", страна производитель: " + country + ".";
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
