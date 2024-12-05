import java.util.Scanner;
import java.util.Random;

public class rock_Paper_Sicors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random(); // creating rand object ("java mai kuch bhi import karte hai jaise Scanner ya
                                    // Random toh usse access karne ke pehle uska ek object banana padta hai")

        int random = rand.nextInt(100);
        System.out.println("HELLO PLAYER WELCOME TO GAME FACTORY");
        System.out.print("enter :\ns for sicor\nr for rock\np for paper : ");
        String user = sc.next().toLowerCase();
        char comp;

        // computer choosing
        if (random > 0 && random <= 33) {
            comp = 's';
        } else if (random > 33 && random < 66) {
            comp = 'r';
        } else {
            comp = 'p';
        }

        // in Java when comparing strings. In Java, you should use the equals() method
        // to compare the content of two strings, not the == operator. The == operator
        // compares object references, not the actual content of the strings

        // comparing comp and computer value
        if (comp == 'p' && user.equals("s")) {
            System.out.println("wins");
        } else if (comp == 'p' && user.equals("r")) {
            System.out.println("lose");
        } else if (comp == 'p' && user.equals("p")) {
            System.out.println("draw");
        } else if (comp == 's' && user.equals("p")) {
            System.out.println("lose");
        } else if (comp == 's' && user.equals("r")) {
            System.out.println("wins");
        } else if (comp == 's' && user.equals("s")) {
            System.out.println("draw");
        } else if (comp == 'r' && user.equals("p")) {
            System.out.println("wins");
        } else if (comp == 'r' && user.equals("s")) {
            System.out.println("lose");
        } else if (comp == 'r' && user.equals("r")) {
            System.out.println("draw");
        } else {
            System.out.println("invalid input");
        }

        System.out.println("you choose : " + user + "\nopponent choose : " + comp);
    }
}
