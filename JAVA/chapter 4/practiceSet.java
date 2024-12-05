// question 2 

// import java.util.Scanner;

// public class practiceSet {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("enter your maths marks : ");
//         int a = sc.nextInt();

//         System.out.print("enter your phy marks : ");
//         int b = sc.nextInt();

//         System.out.print("enter your chem marks : ");
//         int c = sc.nextInt();

//         int d = (a + b + c) / 3;

//         if (a >= 33 && b >= 33 && c >= 33 && d >= 40) {
//             System.out.print("pass");
//         } else {
//             System.out.println("fail");
//         }

//     }
// }

// question 3

import java.util.Scanner;

public class practiceSet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter your income in lakhs : ");
        float income = sc.nextFloat();
        float tax = 0;
        if (income < 2.5) {
            tax = tax + 0;
        } else if (income >= 2.5 && income <= 5) {
            tax = tax + 0.05f * (income - 2.5f);
        } else if (income >= 5 && income <= 10) {
            tax = tax + 0.05f * (5 - 2.5f);
            tax = tax + 0.2f * (income - 5);
        }

        else if (income >= 10) {
            tax = tax + 0.05f * (5 - 2.5f);
            tax = tax + 0.2f * (10 - 5);
            tax = tax + 0.3f * (income - 10);
        }

        System.out.print("tax = " + tax + "lakhs");

    }
}

// question 4

// import java.util.Scanner;

// public class practiceSet {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.print("pls enter the number of the day : ");
// int num = sc.nextInt();

// switch (num) {
// case 1 -> System.out.println("its monday");
// case 2 -> System.out.println("its tuesday");
// case 3 -> System.out.println("its wednesday");
// case 4 -> System.out.println("its thursday");
// case 5 -> System.out.println("its friday");
// case 6 -> System.out.println("its saturday");
// case 7 -> System.out.println("its sunday");
// }

// }
// }

// question 5

// import java.util.Scanner;

// public class practiceSet {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.print("enter the year : ");
// int year = sc.nextInt();

// if (year % 4 == 0) {
// System.out.println("its a leap year");

// }

// else {
// System.out.println("its not a leap year");
// }

// }
// }

// question 6

// import java.util.Scanner;

// public class practiceSet {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);

// System.out.print("enter the website url : ");
// String url = sc.nextLine();

// if (url.endsWith(".com")) {
// System.out.print("Above is a commercial website");
// }

// else if (url.endsWith(".org")) {
// System.out.print("Above is a organization website");
// }

// else if (url.endsWith(".in")) {
// System.out.print("Above is a indian website");
// }

// }
// }
