import java.util.Scanner;
public class MyClass {
  public static void main(String args[]) {
        // Create Scanner object
        Scanner sc = new Scanner(System.in);

        // Ask for input
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        // Output
        System.out.println("Hello, " + name + "!");
  }
}