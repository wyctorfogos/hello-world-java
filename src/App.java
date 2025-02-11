import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        System.out.println("Let's register our new car!");

        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter car branch: ");
        String carBranch = scanner.nextLine();
        
        System.out.print("Enter car color: ");
        String carColor = scanner.nextLine();
        
        System.out.print("Enter owner name: ");
        String ownerName = scanner.nextLine();
        
        Car myNewCar = new Car(carBranch, ownerName, carColor);
        
        System.out.println("Car registered successfully!");
        System.out.println("Branch: " + myNewCar.getCarBranch());
        System.out.println("Color: " + myNewCar.getCarColor());
        System.out.println("Owner: " + myNewCar.getCarOwnerName());
        System.out.println("Inspection Date: " + myNewCar.getCarInspectionDate()+ "\n");
        
        scanner.close();
    }
}
