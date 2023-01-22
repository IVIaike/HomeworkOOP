package transport;

import java.util.regex.Pattern;

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


    public Car(String brand,
               String model,
               double engineVolume,
               String color,
               Integer releaseYear,
               String country,
               String transmissionType,
               String bodyType,
               String registrationNumber,
               Integer seatsNumber,
               boolean isSummerWheels,
               Key key) {
        this.brand = validateCarParameters(brand);
        this.model = validateCarParameters(model);
        this.engineVolume = validateEngineVolume(engineVolume);
        this.color = validateCarColor(color);
        this.releaseYear = validateReleaseYear(releaseYear);
        this.country = validateCarParameters(country);
        this.transmissionType = validateTransmissionType(transmissionType);
        this.bodyType = validateCarParameters(bodyType);
        this.registrationNumber = validateRegistrationNumber(registrationNumber);
        this.seatsNumber = validateSeatsNumber(seatsNumber);
        this.isSummerWheels = isSummerWheels;
    }

    public static class Key {
        private final boolean remoteEngineStart;
        private final boolean keylessAccess;

        public Key(Boolean remoteEngineStart, Boolean keylessAccess) {
            this.remoteEngineStart = validateBoolean(remoteEngineStart);
            this.keylessAccess = validateBoolean(keylessAccess);
        }

        public Boolean validateBoolean (Boolean value) {
            return value != null && value;
        }

        @Override
        public String toString() {
            return "Система доступа. Удаленный запуск двигателя: " + remoteEngineStart + ", доступ без ключа: " + keylessAccess + ".";
        }

        public boolean isRemoteEngineStart() {
            return remoteEngineStart;
        }

        public boolean isKeylessAccess() {
            return keylessAccess;
        }
    }

    //validation region - start

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
        if (value == 0 || value == null) {
            return 5;
        }
        return value;
    }

    public static String validateTransmissionType (String value){
        return (value.isBlank() || value.isEmpty() || value == null) ? " Автоматическая коробка передач" : value;
    }

    public String validateRegistrationNumber(String registrationNumber) {
        if (Pattern.matches("[авекм-ор-ух][0-9]{3}[авекм-ор-ух]{2}[0-9]{3}", registrationNumber)) {
            return registrationNumber;
        }
        else{
            return "Номер введен неверно!";
        }
    }

    public void changeTyres (int month) {
        if (month >= 4 && month <= 10) {
            isSummerWheels = true;
        }
        if ((month >=1 && month <=3) || (month >=11 && month <=12)) {
            isSummerWheels = false;
        }
    }

    //end of validation region


    @Override
    public String toString() {
        return "Автомобиль - " +
                "производитель: " + brand +
                ", модель: " + model +
                ", объем двигателя: " + engineVolume +
                ", цвет: " + color +
                ", год выпуска: " + releaseYear +
                ", страна производитель: " + country +
                ", коробка передач: " + transmissionType +
                ", тип кузова: " + bodyType +
                ", регистрационный номер: " + registrationNumber +
                ", число мест: " + seatsNumber +
                ", летние колеса: " + isSummerWheels + ".";
    }


//getters region start

    public String getBrand() {
        return brand;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public String getColor() {
        return color;
    }

    public Integer getReleaseYear() {
        return releaseYear;
    }

    public String getCountry() {
        return country;
    }

    public String getTransmissionType() {
        return transmissionType;
    }

    public String getBodyType() {
        return bodyType;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public Integer getSeatsNumber() {
        return seatsNumber;
    }

    public boolean isSummerWheels() {
        return isSummerWheels;
    }

    public Key getKey() {
        return key;
    }

//getters region end

    //setters region start

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setTransmissionType(String transmissionType) {
        this.transmissionType = transmissionType;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public void setSummerWheels(boolean summerWheels) {
        isSummerWheels = summerWheels;
    }

    public void setKey(Key key) {
        this.key = key;
    }
//setters region end
}

