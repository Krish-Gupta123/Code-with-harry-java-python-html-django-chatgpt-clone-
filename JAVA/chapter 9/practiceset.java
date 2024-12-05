//qustion 1
// class Cylinder {
//     int radius;
//     int height;

//     public int setRadius(int rad) {
//         return this.radius = rad;
//     }

//     public int setheight(int hei) {
//         return this.height = hei;
//     }

//     public int getRadius() {
//         return radius;
//     }

//     public int getHeight() {
//         return height;
//     }

// }

// public class practiceset {

//     public static void main(String[] args) {
//         Cylinder c = new Cylinder();
//         int a = 5;
//         c.setRadius(a);
//         c.setheight(8);

//         System.out.println("radius of cylinder = " + c.getRadius());
//         System.out.println("height of cylinder = " + c.getHeight());

//     }

// }

//question 2 

// class Cylinder {
//     int radius;
//     int height;

//     public int setRadius(int rad) {
//         return this.radius = rad;
//     }

//     public int setheight(int hei) {
//         return this.height = hei;
//     }

//     public int getRadius() {
//         return radius;
//     }

//     public int getHeight() {
//         return height;
//     }

//     public double surfacearea() {
//         return 2 * Math.PI * radius * height + 2 * Math.PI * radius * radius;// ismai double he rakho data type float
//                                                                              // mai error aa rhi hai
//     }

//     public double volume() {// ismai double he rakho data type float mai error aa rhi hai
//         return Math.PI * radius * radius * height;
//     }

// }

// public class practiceset {

//     public static void main(String[] args) {
//         Cylinder c = new Cylinder();
//         int a = 9;
//         c.setRadius(a);
//         c.setheight(12);

//         System.out.println("radius of cylinder = " + c.getRadius());
//         System.out.println("height of cylinder = " + c.getHeight());
//         System.out.println("surface area of cylinder = " + c.surfacearea());
//         System.out.println("volume of cylinder = " + c.volume());

//     }

// }

//question 3

// class Cylinder {
//     int radius;
//     int height;

//     public Cylinder(int rad, int h) {
//         radius = rad;
//         height = h;
//     }

//     public Cylinder(int h) {
//         radius = 6;
//         height = h;
//     }

//     public int getRadius() {
//         return radius;
//     }

//     public int getHeight() {
//         return height;
//     }

// }

// public class practiceset {

//     public static void main(String[] args) {
//         // Cylinder c = new Cylinder(3, 5);
//         Cylinder c = new Cylinder(5);

//         System.out.println("radius of cylinder = " + c.getRadius());
//         System.out.println("height of cylinder = " + c.getHeight());

//     }

// }

// question 4

// class Rectangle {
//     int length;
//     int breadth;

//     public Rectangle() {
//         length = 4;
//         breadth = 5;
//     }

//     public Rectangle(int l, int b)// creating a constructor with custom parameters
//     {
//         length = l;
//         breadth = b;
//     }

//     public int getRadius() {
//         return length;
//     }

//     public int getHeight() {
//         return breadth;
//     }

// }

// public class practiceset {

//     public static void main(String[] args) {

//         // Rectangle c = new Rectangle();
//         Rectangle c = new Rectangle(12,13);//passing custom parameters

//         System.out.println("radius of Rectangle = " + c.getRadius());
//         System.out.println("height of Rectangle = " + c.getHeight());

//     }

// }

// question 5

class Sphere {
    int radius;

    public int setRadius(int rad) {
        return radius = rad;
    }

    public int getRadius() {
        return radius;
    }

    public double volume() {
        return (4 / 3) * Math.PI * radius * radius * radius;
    }

    public double area() {
        return 4 * Math.PI * radius * radius;
    }

}

public class practiceset {
    public static void main(String[] args) {
        Sphere s = new Sphere();
        s.setRadius(5);
        System.out.println("area of sphere : " + s.area());
        System.out.println("volume of sphere : " + s.volume());

    }
}

// getter aur setter banate waqt last mai return likhna mat bhulna
// get is used for returning value set is used for setting values