public class App {
    public static void main(String[] args) throws Exception {
    whiteboard wb = new whiteboard();    
    int total = wb.addNumbers(5, 3);

    System.out.println("The total is: " + String.valueOf(total));

    }
}
