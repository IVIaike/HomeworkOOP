package transport;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Car car1 = new Car("Lada", "Granta", 1.7, "желтый", 2015, "Россия","механическая 4 ст", "седан", "х303ао196", 4, true, 176, new Car.Key(true, false));
        Car.Key keycar1 = new Car.Key(true,false);
        Car car2 = new Car("Audi", "A8 50 L TDI quattro", 3.0, "черный", 2020, "Германия", "автомат-робот", "кроссовер", "м440вк196", 6, true, 224, new Car.Key(true, true));
        Car.Key keycar2 = new Car.Key(true, true);
        Car car3 = new Car("BMW", "Z8", 3.0, "черный", 2021, "Германия", "атомат-робот", "кроссовер", "в223ау177", 6, true, 265, new Car.Key(true, true));
        Car.Key keycar3 = new Car.Key(true,true);
        Car car4 = new Car("KIA", "Sportage 4th generation", 2.4, "красный", 2018, "Южная корея", "автоматическая 4 ступени", "кроссовер", "в345ах172", 4,true, 175, new Car.Key(true, false));
        Car.Key keycar4 = new Car.Key(true,false);
        Car car5 = new Car("Hyundai", "Avante", 1.6, "оранжевый", 2016, "Южная корея", "", "седан", "x166fv177", 4, true, 168, new Car.Key(false,false));
        Car.Key keycar5 = new Car.Key(false,false);
        Bus bus1 = new Bus("Ikarus", "Ikar", 2008, "Belarus", "Green", 95);
        Bus bus2 = new Bus("Львив", "Л1", 2010, "Украина", "желтый", 89);
        Bus bus3 = new Bus("Ssang Young", "Flying pigeon", 2014, "China", "Blue", 125);


        System.out.println(car1);
        System.out.println(keycar1);
        System.out.println(car2);
        System.out.println(keycar2);
        System.out.println(car3);
        System.out.println(keycar3);
        System.out.println(car4);
        System.out.println(keycar4);
        System.out.println(car5);
        System.out.println(keycar5);
        System.out.println(bus1);
        System.out.println(bus2);
        System.out.println(bus3);
    }
}