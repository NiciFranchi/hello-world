# hello-world
# This is my first project in GitHub.  I like code. 

import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {   # What's this
        Scanner userInputScanner = new Scanner(System.in);
        System.out.print("What's your name? ");
        String userInputName = userInputScanner.nextLine();
        System.out.println("Hello " + userInputName + "!");
    }
}
