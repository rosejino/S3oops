import java.util.Scanner;
import java.time.Year;
 class Vehicle {
    String brand;
    String model;
    int year;
    double basePrice;
    Vehicle(String brand, String model, int year, double basePrice) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.basePrice = basePrice;
    }
    void displayInfo() {
        System.out.println("Brand " + brand);
        System.out.println("Model " + model);
        System.out.println("Year " + year);
        System.out.println("BasePrice " + basePrice);
    }
    void calculateResaleValue() {
        int currentYear = Year.now().getValue();
        int age = currentYear - year;
        double Resalevalue = basePrice * Math.pow(0.85, age);
        System.out.println("Resale Value: " + Resalevalue);
    }
}
class Car extends Vehicle {
    int numberofDoors;
    Car(String brand, String model, int year, double basePrice, int numberofDoors) {
        super(brand, model, year, basePrice);
        this.numberofDoors = numberofDoors;
    }
    void calculateInsurance() {
        double Insurance = 0.05 * basePrice + 1000 * numberofDoors;
        System.out.println(" Insurance: " + Insurance);
    }
    void calculateMaintenanceCost() {
        int age = Year.now().getValue() - year;
        double MaintenanceCost = 3000 * age + 500 * numberofDoors;
        System.out.println("  Maintenance Cost: " + MaintenanceCost);
    }
    void CarDetails() {
        displayInfo();
        System.out.println("Number of Doors : " + numberofDoors);
        calculateInsurance();
        calculateMaintenanceCost();
        calculateResaleValue();
    }
}
class Motorcycle extends Vehicle {
    boolean hasSidecar;
    Motorcycle(String brand, String model, int year, double basePrice, boolean hasSidecar) {
        super(brand, model, year, basePrice);
        this.hasSidecar = hasSidecar;
    }
    void calculateInsurance() {
        double Insurance;
        if (hasSidecar == true) {
            Insurance = 0.025 * basePrice + 1500;
        } else {
            Insurance = 0.025 * basePrice + 1000;
        }
        System.out.println("Insurance: " + Insurance);
    }
    void calculateMaintenanceCost() {
        int age = Year.now().getValue() - year;
        double MaintenanceCost;
        if (hasSidecar == true) {
            MaintenanceCost = 2000 * age + 1000;
        } else {
            MaintenanceCost = 2000 * age + 500;
        }
        System.out.println("  Maintenance Cost: " + MaintenanceCost);
    }
    void MotorcycleDetails() {
        displayInfo();
        System.out.println("Side car : " + hasSidecar);
        calculateInsurance();
        calculateMaintenanceCost();
        calculateResaleValue();
    }
}
public class VehicleDetails {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Brand:");
        String brand = sc.nextLine();
        System.out.println("Enter Model:");
        String model = sc.nextLine();
        System.out.println("Enter Year:");
        int year = sc.nextInt();
        System.out.println("Enter Base Price:");
        double basePrice = sc.nextDouble();
        System.out.println("Enter Number of Doors:");
        int numberofDoors = sc.nextInt();
        System.out.println("Enter Side car (true/false):");
        boolean hasSidecar = sc.nextBoolean();
        Car c1 = new Car(brand, model, year, basePrice, numberofDoors);
        System.out.println("\nCar Details:");
        c1.CarDetails();
        Motorcycle m1 = new Motorcycle(brand, model, year, basePrice, hasSidecar);
        System.out.println("\nMotorcycle Details:");
        m1.MotorcycleDetails();
    }
}