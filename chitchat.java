import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {   # What's this
        System.out.print("Hello, out there!");
        Scanner userInputScanner = new Scanner(System.in);
        System.out.print("What's your name? ");
        String userInputName = userInputScanner.nextLine();
        System.out.println("Hello " + userInputName + "!");
    }
}
