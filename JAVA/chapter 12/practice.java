// packages accessing and creating

// (ye concept waise toh yaha khali practice ke liye kar rha hu lekin yeh code
// dekhke nhi samjega video no 65 dekh lo ek bbar samjh ne ke liye)

// method 1 to access scanner from util package

// import java.util.Scanner;// import scanner from java.lang

// public class practice {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.println("enter your name : ");
// String name = sc.next();
// System.out.println("name : " + name);
// sc.close();
// }
// }

// method 2 to access everything from util package

// import java.util.*;// import everything from java.lang

// public class practice {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.println("enter your name : ");
// String name = sc.next();
// System.out.println("name : " + name);
// sc.close();
// }
// }

// method 3 to access scanner from util package without importing

// public class practice {
// public static void main(String[] args) {

// java.util.Scanner s = new java.util.Scanner(System.in);
// System.out.println("enter your name : ");
// String name = s.next();
// System.out.println("name : " + name);
// s.close();

// }
// }