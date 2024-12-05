//question 1 

// public class practiceSet {
//     public static void main(String[] args) {
//         float[] arr = { 5.4f, 3.4f, 5.7f, 9.7f, 8 };
//         float sum = 0;
//         for (float e : arr) {
//             sum = sum + e;
//         }
//         System.out.println("sum = " + sum);
//     }
// }

// question 2

// public class practiceSet {
//     public static void main(String[] args) {
//         int[] arr = { 2, 5, 3, 6, 7, 56, 43 };
//         int a = 8;
//         boolean c = false;// boolean mai pehle he initialize karna compulsory hota hai
//         for (int e : arr) {
//             if (a == e) {
//                 c = true;
//                 break;
//             }

//         }
//         if (c == true) {
//             System.out.println(a + " is present in array");
//         } else {
//             System.out.println(a + " is not present in array");
//         }

//     }
// }

// question 3

// public class practiceSet {
//     public static void main(String[] args) {
//         int[] marks = { 50, 30, 70 };
//         int sum = 0;
//         float avg;
//         for (int e : marks) {
//             sum = sum + e;

//         }
//         avg = sum / marks.length;
//         System.out.println("average of all marks is : " + avg);
//     }
// }

// question 4

// public class practiceSet {
//     public static void main(String[] args) {
//         int[][] arr = { { 4, 2, 6 }, { 6, 4, 3 } };
//         int[][] arr2 = { { 1, 2, 3 }, { 5, 4, 4 } };
//         int[][] result = new int[2][3];

//         for (int i = 0; i < 2; i++) {
//             for (int j = 0; j < 3; j++) {
//                 result[i][j] = arr[i][j] + arr2[i][j];
//             }
//         }

//         for (int i = 0; i < 2; i++) {
//             for (int j = 0; j < 3; j++) {
//                 System.out.print(result[i][j] + " ");
//             }
//             System.out.println();
//         }
//     }
// }

// question 5

// public class practiceSet {
//     public static void main(String args[]) {
//         int[] marks = { 100, 32, 67, 97, 77 };
//         for (int i = marks.length; i >= 1; i--) {
//             System.out.print(marks[i - 1] + "  ");
//         }
//         System.out.println();
//     }
// }

// question 6

// public class practiceSet {
//     public static void main(String[] args) {
//         int[] arr = { 43, 64, 2, 4, 7, 400, 96 };
//         int max = 0;
//         for (int i = 0; i < arr.length; i++) {
//             if (arr[i] > max) {
//                 max = arr[i];
//             }
//         }
//         System.out.println("maximum element of the array is : " + max);
//     }
// }

// or

// public class practiceSet {
//     public static void main(String[] args) {
//         int[] arr = { 43, 64, 2, 4, 7, 400, 96 };
//         int max = Integer.MIN_VALUE;
//         for (int i = 0; i < arr.length; i++) {
//             if (arr[i] > max) {
//                 max = arr[i];
//             }
//         }
//         System.out.println("maximum element of the array is : " + max);
//     }
// }

// question 7

// public class practiceSet {
//     public static void main(String[] args) {
//         int[] arr = { 43, 64, 2, 4, 7, 400, 96 };
//         int min = Integer.MAX_VALUE;
//         for (int i = 0; i < arr.length; i++) {
//             if (arr[i] < min) {
//                 min = arr[i];
//             }
//         }
//         System.out.println("minimum element of the array is : " + min);
//     }
// }

// question 8

public class practiceSet {
    public static void main(String[] args) {
        int[] arr = { 4, 3, 6, 3, 6, 97 };
        boolean sorted = true;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arr[i + 1]) {
                sorted = false;
                break;
            }
        }
        if (sorted) {
            System.out.print("array is sorted");
        } else

        {
            System.out.print("array is not sorted");
        }

    }
}