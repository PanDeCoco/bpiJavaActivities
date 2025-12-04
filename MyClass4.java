import java.util.Scanner;
public class MyClass4 {
  /**
   * @param args
   */
  public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Age:");
        int age = sc.nextInt();
 
        if (age < 18 ){
          System.out.println("minor");
        }
        else if (age >= 18 && age <= 59){
          System.out.println("adult");
        }
        else{
          System.out.println("senior");
        }
  }
}