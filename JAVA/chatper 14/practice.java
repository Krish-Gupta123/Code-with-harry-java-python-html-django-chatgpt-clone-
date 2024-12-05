// ERROR TYPES

// 1.) Syntax error
// public class practice
// {
// public static void main(String[] args)
// {
// // syntax error
// // int a = 5 //Error : no semicolon
// // b = 9 // Error : b not declared

// }
// }

// 2.) logical error
// write a program to print all prime numbers from 1 to 10
// public class practice {
// public static void main(String[] args) {

// for (int i = 1; i < 5; i++) {
// System.out.println(2 * i + 1);// printing 9 also which is not a prime number
// }

// }
// }

// 3.) Runtime error
// caused due to invalid user input

// import java.util.Scanner;

// public class practice {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);

// System.out.println("enter the number you want to divide with 1000");
// int a = sc.nextInt();// runtime error when user enters string or 0
// System.out.println("ans = " + 1000 / a);

// sc.close();
// }
// }

// try and catch block

// public class practice {
// public static void main(String[] args) {
// int a = 23;
// int b = 0;

// // without try
// // System.out.println("The result is " + c);

// // with try
// try {
// int c = a / b;
// System.out.println("The result is " + c);
// } catch (Exception e) {
// System.out.println("sry we cant solve this");
// System.out.println(e);
// }

// }
// }

// handling specific exceptions

// import java.util.Scanner;

// public class practice {
// public static void main(String[] args) {
// int[] arr = new int[3];
// arr[0] = 300;
// arr[1] = 200;
// arr[2] = 400;

// Scanner sc = new Scanner(System.in);
// System.out.println("welcome");
// System.out.println("enter the value of array index : ");
// int a = sc.nextInt();

// System.out.println("enter the value u want to divide with array index value
// :");
// int b = sc.nextInt();

// try {
// System.out.println("value of entered array index is : " + arr[a]);
// System.out.println("array index value divided by entered num = " + arr[a] /
// b);
// } catch (ArithmeticException e) {
// System.out.println("arithmetic exception occured");
// System.out.println(e);
// } catch (ArrayIndexOutOfBoundsException e) {
// System.out.println("ArrayIndexOutOfBounds exception occured");
// System.out.println(e);
// } catch (Exception e) {
// System.out.println("some other exception occured");
// System.out.println(e);
// }

// sc.close();
// }
// }

// Nested try catch block

// import java.util.Scanner;

// public class practice {
// public static void main(String[] args) {

// int[] arr = new int[3];
// arr[0] = 5;
// arr[1] = 10;
// arr[2] = 15;

// Scanner sc = new Scanner(System.in);

// System.out.println("\nenter the array index : ");
// int a = sc.nextInt();

// try {
// System.out.println("welcome to nested try catch topic");

// try {
// System.out.println("value of array element at index " + a + " is " + arr[a]);

// } catch (ArrayIndexOutOfBoundsException e) {
// System.out.println("ArrayIndexOutOfBoundsException ocuured");
// System.out.println("Exception ocurred in level 2");
// }
// } catch (Exception e) {
// System.out.println("Exception in level 1");
// }

// sc.close();
// }
// }

// quick quiz
// WAP that allows you to keep accessing the array until a valid index is
// entered by the user (just a minute change in above code)

// import java.util.Scanner;

// public class practice {
// public static void main(String[] args) {

// int[] arr = new int[3];
// arr[0] = 5;
// arr[1] = 10;
// arr[2] = 15;

// Scanner sc = new Scanner(System.in);

// boolean b = true;
// while (b) {
// System.out.println("\nenter the array index : ");
// int a = sc.nextInt();

// try {
// System.out.println("welcome to nested try catch topic");

// try {
// System.out.println("value of array element at index " + a + " is " + arr[a]);
// b = false;

// } catch (ArrayIndexOutOfBoundsException e) {
// System.out.println("ArrayIndexOutOfBoundsException ocuured");
// System.out.println("Exception ocurred in level 2");
// }
// } catch (Exception e) {
// System.out.println("Exception in level 1");
// }
// }
// sc.close();
// }
// }

// Exception class in java
// import java.util.Scanner;

// class ageException extends Exception {
// @Override
// public String toString() {
// return "I am toString";
// }

// @Override
// public String getMessage() {
// return "i am getMessege";
// }
// }

// public class practice {
// public static void main(String[] args) {

// Scanner sc = new Scanner(System.in);
// System.out.println("enter your age : ");
// int age = sc.nextInt();

// if (age < 10) {
// try {
// // throw new ageException();
// //throw new ArithmeticException();
// throw new ArithmeticException("i am customized toString");// agar getMessage
// // mai kuch dalna hai to aise pass kardeneka directly aur toString mai last
// mai add ho jaengi yeh string after exception name
// } catch (Exception e) {
// System.out.println(e);
// System.out.println(e.getMessage());
// e.printStackTrace();
// System.out.println(e.toString());

// }
// sc.close();
// }

// sc.close();
// }
// }

// Throw and Throws keyword

// import java.util.Scanner;

// class NegativeRadiusException extends Exception {
// @Override
// public String toString() {
// return "i am toString (**RADIUS CAN'T BE NEGATIVE**)";
// }

// @Override
// public String getMessage() {
// return "i am getMessage (**RADIUS CAN'T BE NEGATIVE**)";
// }

// }

// public class practice {

// public static int divide(int a, int b) throws ArithmeticException {
// int r = a / b;
// return r;
// }

// public static double area(int r) throws NegativeRadiusException {

// if (r < 0) {
// throw new NegativeRadiusException();
// }
// double area = Math.PI * r * r;
// return area;
// }

// public static void main(String[] args) {

// Scanner sc = new Scanner(System.in);

// System.out.println("Enter a and b : ");
// int num_1 = sc.nextInt();
// int num_2 = sc.nextInt();

// try {
// int c = divide(num_1, num_2);
// // upar wale divide func mai already bola hai throws ArithmeticException iska
// // matlab jo bhi usse use kar rha hai usse apna code mai dhyaan rakhna chaiye
// ke
// // yeh exception aa sakta hai toh usse handle coder ko karna hai jo use kar
// rha
// // hai isliye maine try catch mai surround kar diya ke exception aayi toh bhi
// // code ruke na na koi error aaye
// System.out.println(" result = " + c);
// } catch (Exception e) {
// System.out.println(e);
// }

// System.out.println("part 2");
// System.out.println("enter radius of radius : ");
// int radius = sc.nextInt();

// try {
// double Area = area(radius);
// System.out.println(Area);
// } catch (Exception e) {
// System.out.println("Exception Occured");
// }

// sc.close();

// }
// }

// finally block in java(bich mai catch ke baad break karlo ya exception aaye ya
// nhi aaye finally hamesha execute hota hai)

// public class practice {
// public static int greet() {
// try {
// int a = 50;
// int b = 10;
// int c = a / b;
// return c;
// } catch (Exception e) {
// System.out.println(e);
// } finally {
// System.out.println("finally block");
// }
// return -1;
// }

// public static void main(String[] args) {
// int k = greet();
// System.out.println(k);

// int a = 7;
// int b = 9;
// while (true) {
// try {
// int c = a / b;
// System.out.println(c);

// }

// catch (Exception e) {
// System.out.println(e);
// break;
// } finally {
// System.out.println("Finally block .....");
// }
// b--;
// }

// try {
// System.out.println(50 / 3);
// } finally {
// System.out.println("Yes this is finally");
// }

// }
// }