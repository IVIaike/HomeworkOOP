package transport;
public class Car {

    private final String brand;
    private final String model;
    private double engineVolume;
    private String color;
    private final Integer releaseYear;
    private final String country;
    private String transmissionType;
    private final String bodyType;
    private String registrationNumber;
    private final Integer seatsNumber;
    boolean isSummerWheels;
    Key key;


    public Car(String brand, String model, double engineVolume, String color, Integer releaseYear, String country, Key key) {
        this.brand = validateCarParameters(brand);
        this.model = validateCarParameters(model);
        this.engineVolume = validateEngineVolume(engineVolume);
        this.color = validateCarColor(color);
        this.releaseYear = validateReleaseYear(releaseYear);
        this.country = validateCarParameters(country);
        this.transmissionType = validateCarParameters(transmissionType);
        this.bodyType = validateCarParameters(bodyType);
        this.registrationNumber = validateRegistrationNumber(registrationNumber);
        this.seatsNumber = validateSeatsNumber(seatsNumber);
        this.isSummerWheels = isSummerWheels;
    }

    public class Key {
        private String remoteEngineStart;
        private String keylessAccess;

        public Key(String remoteEngineStart, String keylessAccess) {
            this.remoteEngineStart = remoteEngineStart;
            this.keylessAccess = keylessAccess;
        }

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

    public static int validateSeatsNumber (Integer value) {
        if (value == 0) {
            return 5;
        }
        return value;
    }

    public static boolean validateSummerWheels (boolean value) {
        boolean isSummerWheel = true;

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

    public String getModel() {
        return model;
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

    public String getCountry() {
        return country;
    }

}
