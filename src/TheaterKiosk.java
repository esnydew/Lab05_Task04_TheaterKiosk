import java.util.Scanner;

// Pseudocode begins on next line.
/*
class TheaterKiosk
    main()
        // Declarations
            num userAge
            num DRINKING_AGE = 21
        // IPO
        output "Please enter your age>> "
        input userAge
        if userAge >= DRINKING_AGE then
            output "You're 21 or older! You get a wristband."
        endif
    return
endClass
*/

public class TheaterKiosk {
    static void main() {
        // Declarations
            Scanner in = new Scanner(System.in);
            int userAge;
            int DRINKING_AGE = 21;
        // IPO
            System.out.print("Please enter your age>> ");
            userAge = in.nextInt();
            if (userAge >= DRINKING_AGE) {
                System.out.println("You're 21 or older! You get a wristband.");
            }
    }
}
