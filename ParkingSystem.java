import java.util.*;
public class ParkingSystem {
    static int totalSlots = 12, availableSlots = 0;
    static ArrayList<Car> parkedCars = new ArrayList<>();

    public static void main (String[] args) {
        Scanner keyboard = new Scanner(System.in);
        availableSlots = totalSlots;
        boolean isGoing = true;
        while(isGoing) {
            System.out.println("What would you like to do?");
            System.out.println("1. Park a car");
            System.out.println("2. Remove a car");
            System.out.println("3. View all parked cars");
            System.out.println("4. Exit");
            int choice = keyboard.nextInt();
            keyboard.nextLine();

            switch (choice) {
                case 1:
                    parkCar(keyboard);
                    System.out.println();
                    System.out.println();
                    break;
                case 2:
                    removeCar(keyboard);
                    System.out.println();
                    System.out.println();
                    break;
                case 3:
                    viewAllCars();
                    System.out.println();
                    System.out.println();
                    break;
                case 4:
                    isGoing = false;
                    System.out.println("Thank you for using our service");
                    break;
                default:
                    System.out.println("Invalid Choice, Please try again!!");
            }
        }
    }

    public static void parkCar(Scanner keyboard) {
        if (availableSlots == 0) {
            System.out.println("We are full!! No more parking spots available.");
        }
        System.out.print("Enter the state code of the vehicle: ");
        String state = keyboard.nextLine();
        System.out.print("Enter the license plate number: ");
        String plates = keyboard.nextLine();
        Car car = new Car(state, plates);
        parkedCars.add(car);
        availableSlots--;
    }

    public static void removeCar(Scanner keyboard) {
        if (availableSlots == totalSlots) {
            System.out.println("There are no parked cars.");
        }
        System.out.print("Enter the state code of the vehicle: ");
        String state = keyboard.nextLine();
        System.out.print("Enter the license plate number: ");
        String plates = keyboard.nextLine();
        Car car = new Car(state, plates);
        if (parkedCars.contains(car)) {
            parkedCars.remove(car);
            availableSlots++;
            System.out.println("Car removed successfully");
            System.out.println("Available Slots: "+ availableSlots);
        } else {
            System.out.println("The car with "+ state + " - " + plates+ " is not parked here");
        }

    }

    public static void viewAllCars() {
        System.out.println("Parked Cars: ");
        int i = 1;
        for (Car car: parkedCars) {
            System.out.println(i + ". " + car.getCar() + " - " + car.getState());
            i++;
        }
    }
}
