
// question 1 and 3 included
import java.util.Scanner; // import statement is always writeen on top

class Circle {
    float radius;

    Circle(float r) {
        this.radius = r;
    }

    double areaCircle() {
        return Math.PI * radius * radius;
    }

    // circle mai volume nhi hoti

}

class Cylinder extends Circle {
    float height, radius;

    Cylinder(float y, float z) {
        super(y);
        this.radius = y;
        this.height = z;
    }

    double area() {
        return 2 * Math.PI * radius * height + 2 * Math.PI * radius * radius;
    }

    double volume() {
        return Math.PI * radius * radius * height;
    }
}

public class PracticeSet {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = 1;

        float r, rc, hc;
        do {
            System.out.println(
                    "Choose 1 for Circle \nChoose 2 for Cylinder\nChoose 3 for both Circle and Cylinder\nChosse 4 for exiting program");
            int n = sc.nextInt();
            switch (n) {
                case (1):
                    System.out.println("enter radius of circle : ");
                    r = sc.nextFloat();

                    Circle C = new Circle(r);

                    System.out.println("area of circle = " + C.areaCircle());
                    break;

                case (2):

                    System.out.println("enter radius of cylinder : ");
                    rc = sc.nextFloat();

                    System.out.println("enter height of cylinder : ");
                    hc = sc.nextFloat();

                    Cylinder c = new Cylinder(rc, hc);

                    System.out.println("area of cylinder = " + c.area());
                    System.out.println("volume of cylinder = " + c.volume());
                    break;

                case 3:

                    System.out.println("enter radius of cylinder and circle : ");// radius or both is equal
                    rc = sc.nextFloat();

                    System.out.println("enter height of cylinder : ");
                    hc = sc.nextFloat();

                    Cylinder cy = new Cylinder(rc, hc);

                    System.out.println("area of circle = " + cy.areaCircle());
                    System.out.println("area of cylinder = " + cy.area());
                    System.out.println("volume of cylinder = " + cy.volume());
                    break;

                case 4:
                    System.exit(1);

                default:

                    System.out.println("invalid input");

            }
        } while (x != 0);

        sc.close();
    }

}

// question 2 and 4