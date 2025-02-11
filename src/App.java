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
        
        System.out.print("Enter owner email: ");
        String ownerEmail = scanner.nextLine();
        
        Car myNewCar = new Car(carBranch, ownerName, carColor, ownerEmail);
        
        myNewCar.showCarDetail();
        
        scanner.close();
    }
}
