import java.util.Scanner;

public class IT26101394Lab7Q1B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        for (int i = 1; i <= 3; i++) {
            System.out.println("Student " + i);
            System.out.print("Enter marks: ");
            double m1 = scanner.nextDouble();
            double m2 = scanner.nextDouble();
            double m3 = scanner.nextDouble();
            double m4 = scanner.nextDouble();
            
            double average = (m1 + m2 + m3 + m4) / 4.0;
            System.out.println("Average is: " + average);
            
            String grade;
            if (average >= 75) {
                grade = "Distinction";
            } else if (average >= 50) {
                grade = "Credit";
            } else {
                grade = "Fail";
            }
            
            System.out.println("Overall Grade is: " + grade);
        }
        
    
    }
}