
import javax.swing.JOptionPane;



// public class Main {
//     public static void main(String[] args) {
//         // Create a Scanner object for user input
//         Scanner scanner = new Scanner(System.in);

//         try {
//             // Prompt user to enter the first number
//             System.out.print("Enter the first number: ");
//             double num1 = scanner.nextDouble();

//             // Prompt user to enter the second number
//             System.out.print("Enter the second number: ");
//             double num2 = scanner.nextDouble();

//             // Perform addition
//             double sum = num1 + num2;
//             System.out.println("The sum of the two numbers is: " + sum);

//             // Perform division
//             if (num2 != 0) {
//                 double division = num1 / num2;
//                 System.out.println("The result of division is: " + division);
//             } else {
//                 System.out.println("Division by zero is not allowed.");
//             }
//         } catch (Exception e) {
//             System.out.println("Invalid input! Please enter numeric values.");
//         } finally {
//             scanner.close(); // Close the scanner
//         }
//     }
// }

public class Main {
  public static void main(String[] args) {
    float num1;
    try {
        num1 = Float.parseFloat(JOptionPane.showInputDialog("Input the first number: "));
        System.out.println("The first number is: " + num1);
    } catch (NumberFormatException e) {
        System.out.println("Invalid input! Please enter a numeric value.");
    }
  }
}
