import java.util.Scanner;

public class IT26101394Lab7Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Loop for 5 customers
        for (int i = 1; i <= 5; i++) {
            System.out.println("Customer " + i);
            
            System.out.print("Enter total bill amount: ");
            double totalAmount = scanner.nextDouble();
            
            System.out.print("Enter payment mode (C for cash, O for other): ");
            char paymentMode = scanner.next().charAt(0);
            
            if (paymentMode == 'C' || paymentMode == 'c') {
                double discount = totalAmount * 0.05; // 5% discount for cash
                double amountToBePaid = totalAmount - discount;
                
                System.out.println("Discount : " + discount);
                System.out.println("Amount to be paid: " + amountToBePaid);
            } else if (paymentMode == 'O' || paymentMode == 'o') {
                System.out.println("No discount");
                System.out.println("Amount to be paid: " + totalAmount);
            } else {
                System.out.println("Invalid Payment Mode");
            }
            
            System.out.println(); // Blank line between customers
        }
        
        scanner.close();
    }
}