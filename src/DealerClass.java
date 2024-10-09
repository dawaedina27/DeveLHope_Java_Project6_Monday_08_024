import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.Callable;


public class DealerClass {
    private String dealerName;
    private double dealerBalance;
    private ArrayList<Car> carInventory;


    public DealerClass(String dealerName, double initialBalance) {
        this.dealerName = dealerName;
        this.dealerBalance = initialBalance;
        this.carInventory = new ArrayList<Car>();

    }

    public void DisplayAllCars() {
        if (carInventory.isEmpty()) {
            System.out.println("The inventory is empty. No cars available.");
        } else {
            System.out.println("Cars in the inventory: ");
            for (int i = 0; i < carInventory.size(); i++) {
                System.out.println((i + 1) + ", " + carInventory.get(i));
            }
        }
    }

    public void addCar(Car car) {
        carInventory.add(car);
        System.out.println("Added to the inventory successfully " + car.getClass().getName());
    }

    public void sellCar(int carPosition) {
        if (carPosition < 0 || carPosition >= carInventory.size()) {
            System.out.println("Incorrect car selection");
        } else {
            Car car = carInventory.get(carPosition);
            double sellingPrice = car.sell();
            dealerBalance += sellingPrice;
            carInventory.remove(carPosition);
            System.out.println("Car sold at: UGX" + sellingPrice + car.getClass().getName());
            System.out.println("Udated dealer balance: UGX" + dealerBalance);

        }
    }

    public void dealerMenu(){
        Scanner scanner = new Scanner(System.in);
        int choice;

        while (true){
            System.out.println("\n ******* DEALER MANAGEMENT MENU *******");
            System.out.println("1. Add cars to the Car Inventory");
        }

    }
}

