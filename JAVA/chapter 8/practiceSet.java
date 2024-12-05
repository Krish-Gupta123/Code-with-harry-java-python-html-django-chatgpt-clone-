// question 1
// class Employee {
//     int salary;
//     String name;

//     public int getSalary() {
//         return salary;
//     }

//     public String getName() {
//         return name;
//     }

//     public void setName() {
//         name = "krish";
//     }

// }

// public class practiceSet {
//     public static void main(String[] args) {
//         Employee krish = new Employee();
//         // krish.setname("krish");
//         // or
//         krish.setName();// initializing set name in main func
//         krish.salary = 600000;
//         System.out.println(krish.getSalary());
//         System.out.println(krish.getName());

//     }
// }

// question 2

// class Cellphone {
//     public void ring() {
//         System.out.println("Phone is ringing zooo zooo zooo - - - - -");
//     }

//     public void vibrate() {
//         System.out.println("Phone is vibrating zooo zooo zooo - - - - -");
//     }

// }

// public class practiceSet {
//     public static void main(String[] args) {
//         Cellphone redmi = new Cellphone();
//         redmi.ring();
//         redmi.vibrate();

//     }
// }

// question 3

// class Square {
//     int side;

//     int area() {
//         return side * side;
//     }

//     int perimeter() {
//         return 4 * side;
//     }

// }

// public class practiceSet {
//     public static void main(String[] args) {

//         Square sq = new Square();

//         sq.side = 5;

//         System.out.println("area = " + sq.area());

//         System.out.println("perimeter = " + sq.perimeter());

//     }
// }

// question 4

// class Rectangle {
//     float length;
//     float breadth;

//     float area() {
//         return length * breadth;
//     }

//     float perimeter() {
//         return 2 * (length + breadth);
//     }

// }

// public class practiceSet {
//     public static void main(String[] args) {

//         Rectangle rec = new Rectangle();

//         rec.length = 5;
//         rec.breadth = 7.1f;

//         System.out.println("area = " + rec.area());

//         System.out.println("perimeter = " + rec.perimeter());

//     }
// }

// question 5

class TommyVecetti {
    public void hitting() {
        System.out.println(" hitting the opponent ");
    }

    public void running() {
        System.out.println(" running from the opponent ");
    }

    public void firing() {
        System.out.println(" firing on  the opponent ");
    }
}

public class practiceSet {
    public static void main(String[] args) {
        TommyVecetti bgmi = new TommyVecetti();

        bgmi.hitting();
        bgmi.running();
        bgmi.firing();

    }
}

// question 6

// class Circle {
// float radius;

// float area() {
// return 3.14f * radius * radius;
// }

// float perimeter() {
// return 2 * 3.14f * radius;
// }

// }

// public class practiceSet {
// public static void main(String[] args) {

// Circle c = new Circle();

// c.radius = 5;

// System.out.println("area = " + c.area());

// System.out.println("perimeter = " + c.perimeter());

// }
// }