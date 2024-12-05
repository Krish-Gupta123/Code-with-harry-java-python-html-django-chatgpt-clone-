// yeh sab infinite loops ke programs hai khud stop karna yaad se

// question 1

// class MyThread1 extends Thread {

// public void run() {

// while (true) {
// System.out.println("Good morning");
// }
// }
// }

// class MyThread2 extends Thread {

// public void run() {

// while (true) {
// System.out.println("Welcome");
// }
// }
// }

// public class practiceSet {
// public static void main(String[] args) {
// MyThread1 t1 = new MyThread1();
// MyThread2 t2 = new MyThread2();

// t1.start();
// t2.start();
// }
// }

// question 2

// class MyThread1 extends Thread {

// public void run() {

// while (true) {
// System.out.println("Good morning");
// }
// }
// }

// class MyThread2 extends Thread {

// public void run() {

// while (true) {
// System.out.println("Welcome");

// try {
// Thread.sleep(200);
// } catch (InterruptedException e) {

// e.printStackTrace();
// }
// }
// }
// }

// public class practiceSet {
// public static void main(String[] args) {
// MyThread1 t1 = new MyThread1();
// MyThread2 t2 = new MyThread2();

// t1.start();
// t2.start();
// }
// }

// question 3

// class MyThread1 implements Runnable {

// public void run() {
// while (true)

// {
// System.out.println("Krish");
// }
// }

// }

// class MyThread2 implements Runnable {

// public void run() {
// while (true)

// {
// System.out.println("Harry");
// }
// }

// }

// public class practiceSet {
// public static void main(String[] args) {
// MyThread1 t1 = new MyThread1();
// Thread P1 = new Thread(t1);

// MyThread2 t2 = new MyThread2();
// Thread P2 = new Thread(t2);

// // P1.setPriority(6); (agar yeh nhi likha toh priority normal form ke hoti
// hai
// // that is 5)
// // P2.setPriority(4);

// System.out.println(P1.getPriority());
// System.out.println(P2.getPriority());
// }
// }

// question 4

// class MyThread1 implements Runnable {
// public void run() {

// }
// }

// public class practiceSet {
// public static void main(String[] args) {
// MyThread1 t1 = new MyThread1();
// Thread t = new Thread(t1);

// System.out.println(t.getState());

// t.start();

// System.out.println(t.getState());

// }
// }

// question 5

// class MyThread1 implements Runnable {
// public void run() {

// }
// }

// public class practiceSet {
// public static void main(String[] args) {
// MyThread1 t1 = new MyThread1();
// Thread t = new Thread(t1);

// System.out.println(t.getState());

// t.start();

// System.out.println(t.getState());

// System.out.println(t.currentThread().getState());
// //(current thread returns the reference to the currently executing
// thread(latest mai jo thread execute ho rhi hai uske baare mai information
// nikal sakte hai current thread use karke uske aage koi bhi method likhke))
// }
// }