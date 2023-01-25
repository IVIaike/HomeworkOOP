package transport;

public class Bus extends Transport{


    public Bus(String brand, String model, Integer releaseYear, String country, String color, Integer maxSpeed) {
        super(brand, model, releaseYear, country, color, maxSpeed);
    }

    @Override
    public String toString() {
        return "Автобус: производитель: " + getBrand() +
        " , модель: " + getModel() + " , цвет: " + getColor() + ", год выпуска: " + getReleaseYear() + " , страна производитель: " + getCountry();
    }
}
