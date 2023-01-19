package transport;
public class Main {
    public static void main(String[] args) {

        Car car6 = new Car("Lada", "Granta", 1.7, "желтый", 2015, "Россия");
        Car car7 = new Car("Audi", "A8 50 L TDI quattro", 3.0, "черный", 2020, "Германия");
        Car car8 = new Car("BMW", "Z8", 3.0, "черный", 2021, "Германия");
        Car car9 = new Car("KIA", "Sportage 4th generation", 2.4, "красный", 2018, "Южная корея");
        Car car10 = new Car("Hyundai", "Avante", 1.6, "оранжевый", 2016, "Южная корея");
        Car car11 = new Car("", "", 0, ";tknsq", 2010," ");

        System.out.println(car6);
        System.out.println(car7);
        System.out.println(car8);
        System.out.println(car9);
        System.out.println(car10);
        System.out.println(car11);

    }
}