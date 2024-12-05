// example of instance method and function
// public class practice {
// int sum(int a, int b) {
// return a + b;
// }

// public static void main(String[] args) {
// practice obj = new practice();
// System.out.println(obj.sum(4, 6));
// }
// }

// example of static method and function
// public class practice {
// static int sum(int a, int b) {
// return a + b;
// }

// public static void main(String[] args) {

// System.out.println(sum(4, 6));
// }
// }

// example of method overloading

// public class practice {
// static int sum(int a, int b) {
// return a + b;
// }

// static int sum(int a, int b, int c) {
// return a + b + c;
// }

// static int sum(int a, int b, int c, int d) {
// return a + b + c + d;
// }

// public static void main(String[] args) {
// System.out.println("sum of 3 and 4 is : " + sum(4, 3));
// System.out.println("sum of 3 and 4 and 5 is : " + sum(4, 3, 5));
// System.out.println("sum of 3 and 4 and 5 and 6 is : " + sum(4, 3, 5, 6));
// }
// }

// example of varargs

// public class practice {
// static int sum(int... arr) {
// int sum = 0;
// for (int e : arr) {
// sum = sum + e;
// }
// return sum;
// }

// public static void main(String[] args) {
// System.out.println("sum is : " + sum());
// System.out.println("sum of 3 and 4 is : " + sum(4, 3));
// System.out.println("sum of 3 and 4 and 5 is : " + sum(4, 3, 5));
// System.out.println("sum of 3 and 4 and 5 and 6 is : " + sum(4, 3, 5, 6));
// }
// }

// quick quiz 1
// import java.util.Scanner;

// public class practice {
// static int fact(int n) {
// if (n == 1) {
// return 1;
// }
// return n * fact(n - 1);
// }

// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.println("enter the number : ");
// int a = sc.nextInt();
// System.out.println("factorial of " + a + " is : " + fact(a));
// sc.close();
// }
// }