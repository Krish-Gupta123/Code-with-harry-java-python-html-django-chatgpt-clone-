// question 1

// import java.util.Scanner;

// public class practiceSet {
// void mul(int n) {
// for (int i = 1; i <= 10; i++) {
// System.out.println(n + " * " + i + " = " + n * i);
// }

// }

// public static void main(String args[]) {
// System.out.print("enter the number : ");
// Scanner sc = new Scanner(System.in);
// int num = sc.nextInt();

// practiceSet obj = new practiceSet();
// obj.mul(num);

// sc.close();
// }
// }

// question 2

// import java.util.Scanner;

// public class practiceSet {
// void pattern(int n) {
// for (int i = 1; i <= n; i++) {
// for (int j = 1; j <= i; j++) {
// System.out.print(" * ");
// }
// System.out.println();
// }

// }

// public static void main(String args[]) {
// System.out.print("enter the number : ");
// Scanner sc = new Scanner(System.in);
// int num = sc.nextInt();

// practiceSet obj = new practiceSet();
// obj.pattern(num);

// sc.close();
// }
// }

// question 3

// import java.util.Scanner;

// public class practiceSet {

// static int sum(int n) {
// if (n == 1) {
// return 1;
// } else {
// return n + sum(n - 1);
// }
// }

// public static void main(String args[]) {
// System.out.print("enter the number : ");
// Scanner sc = new Scanner(System.in);
// int num = sc.nextInt();

// System.out.print(sum(num));

// sc.close();
// }
// }

// question 4

// import java.util.Scanner;

// public class practiceSet {
// void pattern(int n) {
// for (int i = n; i >= 1; i--) {
// for (int j = i; j >= 1; j--) {
// System.out.print(" * ");
// }
// System.out.println();
// }

// }

// public static void main(String args[]) {
// System.out.print("enter the number : ");
// Scanner sc = new Scanner(System.in);
// int num = sc.nextInt();

// practiceSet obj = new practiceSet();
// obj.pattern(num);

// sc.close();
// }
// }

// question 5
// import java.util.Scanner;

// public class practiceSet {
// int fibo(int n) {
// if (n == 1) {
// return 0;
// } else if (n == 2) {
// return 1;
// } else {
// return fibo(n - 1) + fibo(n - 2);
// }
// }

// public static void main(String[] args) {
// System.out.println("enter the number : ");

// practiceSet obj = new practiceSet();

// Scanner sc = new Scanner(System.in);
// int num = sc.nextInt();
// System.out.print(obj.fibo(num));

// }

// }

// question 6

// public class practiceSet {
// static float avg(float... arr) {
// float sum = 0;
// float count = 0;
// for (float e : arr) {
// sum = sum + e;
// count++;

// }
// return sum / count;
// }

// public static void main(String[] args) {
// System.out.print("avg of 3,4,5,5,7 is : " + avg(3, 4, 5, 5, 7));

// }
// }

// question 7

// import java.util.Scanner;

// public class practiceSet {
// void pattern(int n) {

// if (n >= 1) {

// for (int i = 1; i <= n; i++) {
// System.out.print(" * ");
// }
// System.out.println();
// pattern(n - 1);
// }

// }

// public static void main(String args[]) {
// System.out.print("enter the number : ");
// Scanner sc = new Scanner(System.in);
// int num = sc.nextInt();

// practiceSet obj = new practiceSet();
// obj.pattern(num);

// sc.close();
// }
// }

// question 8

// import java.util.Scanner;

// public class practiceSet {
// void pattern(int n) {
// if (n >= 1) {
// pattern(n - 1);
// for (int i = 1; i <= n; i++) {
// System.out.print(" * ");
// }
// System.out.println();
// }
// }

// public static void main(String args[]) {
// System.out.print("enter the number : ");
// Scanner sc = new Scanner(System.in);
// int num = sc.nextInt();

// practiceSet obj = new practiceSet();
// obj.pattern(num);

// sc.close();
// }
// }

// question 9

import java.util.Scanner;

public class practiceSet {
    float temp(int temperature) {
        float degree_celcius = (temperature - 32) * (5.f / 9.f);
        return degree_celcius;
    }

    public static void main(String[] args)

    {
        practiceSet obj = new practiceSet();
        Scanner sc = new Scanner(System.in);

        System.out.print("enter the tempin fahrenhite : ");
        int temp = sc.nextInt();
        System.out.println("temperatue is celcius = " + obj.temp(temp));

        sc.close();

    }
}

// question 10

// import java.util.Scanner;

// public class practiceSet {

// public static void main(String args[]) {
// System.out.print("enter the number : ");
// Scanner sc = new Scanner(System.in);
// int num = sc.nextInt();

// int sum = 0;
// for (int i = 0; i <= num; i++) {
// sum = sum + i;

// }
// System.out.println("sum of first " + num + " natural numbers is " + sum);
// sc.close();
// }
// }
