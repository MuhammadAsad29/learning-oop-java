class Vehicle {
    String brand;
    int year;
    Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }
    void startEngine() {
        System.out.println("The engine is start:\n");
    }
    void stopEngine() {
        System.out.println("The engine is stopped:\n");
    }
}
class Car extends Vehicle {
    int number_Of_Doors;
    Car(String brand, int year, int number_Of_Doors) {
        super(brand, year);
        this.number_Of_Doors = number_Of_Doors;
    }
    void honk() {
        System.out.println("The car is honking:\n");
    }
}
class Bike extends Vehicle {
    boolean has_Carrier;
    Bike(String brand, int year, boolean hasCarrier) {
        super(brand, year);
        this.has_Carrier = has_Carrier;
    }
    void kickStart() {
        System.out.println("The bike is kick-started:\n");
    }
}
class ElectricCar extends Car {
    int batteryCapacity;
    ElectricCar(String brand, int year, int number_Of_Doors, int battery_Capacity) {
        super(brand, year, number_Of_Doors);
        this.batteryCapacity = battery_Capacity;
    }
    void chargeBattery() {
        System.out.println("The car is charged:\n");
    }
}
public class Main {
    public static void main(String[] args) {
        Car car = new Car("Toyota", 2021, 4);
        car.startEngine();
        car.honk();
        car.stopEngine();

        Bike bike = new Bike("Honda", 2020, true);
        bike.startEngine();
        bike.kickStart();
        bike.stopEngine();

        ElectricCar EV = new ElectricCar("Tesla", 2022, 4, 100);
        EV.startEngine();
        EV.honk();
        EV.chargeBattery();
        EV.stopEngine();
    }
}