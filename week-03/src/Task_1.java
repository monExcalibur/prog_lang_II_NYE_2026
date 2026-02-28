public class Task_1 {


    public static void main(String[] args) {

        Car myCar = new Car("Toyota", "Corolla", 2015);

        myCar.displayInfo();
        myCar.startEngine();
        myCar.stopEngine();
    }
}

class Car {
    String brand;
    String model;
    int year;

    Car(String b, String m, int y) {
        brand = b;
        model = m;
        year = y;
    }

    void displayInfo() {
        System.out.println("Brand: " + brand + ", Model: " + model + ", Year: " + year);
    }

    void startEngine() {
        System.out.println("The car is starting!");
    }

    void stopEngine() {
        System.out.println("The car is stopping!");
    }
}