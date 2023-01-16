public class Car {

    private String brand;
    private String model;
    private double engineVolume;
    private String color;
    private int releaseYear;
    private String country;

    public String getBrand() {
        return brand;
    }

    @Override
    public String toString() {
        return "Автомобиль - " +
                "производитель: " + brand +
                ", модель: " + model +
                ", объем двигателяЖ " + engineVolume +
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
