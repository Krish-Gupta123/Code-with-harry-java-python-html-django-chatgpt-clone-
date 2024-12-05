// creating threads

// method 1 (by extending thread class)

// class MyThread1 extends Thread {

// @Override
// public void run()

// {
// int i = 0;
// while (i < 100) {
// System.out.println("i am my thread 1 ");

// i++;
// }
// }
// }

// class MyThread2 extends Thread {
// @Override// not compulsory to write just used for better code readibility
// public void run()

// {
// int i = 0;
// while (i < 100) {
// System.out.println("i am my thread 2 ");

// i++;
// }
// }

// }

// public class practice {
// public static void main(String[] args) {
// MyThread1 t1 = new MyThread1();
// MyThread2 t2 = new MyThread2();

// t1.start();
// t2.start();
// }
// }

// method 2 (by implementing runnable interface)

// class MyThread1 implements Runnable {
// @Override
// public void run()

// {
// int i = 0;
// while (i < 100) {
// System.out.println("i am my thread 1 ");

// i++;
// }
// }
// }

// class MyThread2 implements Runnable {
// @Override
// public void run()

// {
// int i = 0;
// while (i < 100) {
// System.out.println("i am my thread 2 ");

// i++;
// }
// }
// }

// public class practice {
// public static void main(String[] args) {
// MyThread1 bullet1 = new MyThread1();
// Thread t1 = new Thread(bullet1);

// MyThread2 bullet2 = new MyThread2();
// Thread t2 = new Thread(bullet2);

// t1.start();
// t2.start();

// }
// }

// comonly used constructors in threads(yeh pura aache se notes mai jitna hai
// utna toh nhi samja par jitna harry bhai ne code kiya hai utna samjhgaya)

// class MyThread1 extends Thread {
// public MyThread1(String name) {
// super(name);
// }

// public void run() {

// System.out.println("thankyou");
// }
// }

// public class practice {
// public static void main(String[] args) {
// MyThread1 t1 = new MyThread1("krish");
// MyThread1 t2 = new MyThread1("harry");

// System.out.println("t1 name = " + t1.getName());
// System.out.println("t2 name = " + t2.getName());
// //System.out.println("t1 Id = "+ t1.getId());// dont use this as getId is
// // deprecated from java methods
// t1.start();
// t2.start();
// }
// }

// setting priority amoung threads

// class MyThread1 extends Thread {
// public MyThread1(String name) {
// super(name);
// }

// public void run() {
// int i = 0;
// while (i < 10) {
// System.out.println("t1 name = " + getName());
// }
// }
// }

// class MyThread2 extends Thread {
// public MyThread2(String name) {
// super(name);
// }

// public void run() {
// int i = 0;
// while (i < 10) {

// System.out.println("t2 name = " + getName());
// }
// }
// }

// class MyThread3 extends Thread {
// public MyThread3(String name) {
// super(name);
// }

// public void run() {
// int i = 0;
// while (i < 10) {
// System.out.println("t3 name = " + getName());
// }
// }
// }

// class MyThread4 extends Thread {
// public MyThread4(String name) {
// super(name);
// }

// public void run() {
// int i = 0;
// while (i < 10) {
// System.out.println("t1 name = " + getName());
// }
// }
// }

// public class practice {
// public static void main(String[] args) {
// MyThread1 t1 = new MyThread1("krish");
// MyThread2 t2 = new MyThread2("harry");
// MyThread3 t3 = new MyThread3("raghav");
// MyThread4 t4 = new MyThread4("gupta");

// t1.setPriority(Thread.MAX_PRIORITY);
// t2.setPriority(Thread.NORM_PRIORITY);
// t3.setPriority(Thread.MIN_PRIORITY);
// t4.setPriority(Thread.MIN_PRIORITY);

// t1.start();
// t2.start();
// t3.start();
// t4.start();

// }
// }

// java thread methods

// 1.) join method

// class MyThread1 extends Thread {

// public void run() {
// int i = 1;
// while (i < 10) {
// System.out.println("i am thread 1");
// i++;
// }
// }
// }

// class MyThread2 extends Thread {

// public void run() {
// int i = 1;
// while (i < 10) {

// System.out.println("i am thread 2");
// i++;
// }
// }
// }

// public class practice {
// public static void main(String[] args) {
// MyThread1 t1 = new MyThread1();
// MyThread2 t2 = new MyThread2();

// t1.start();

// try {
// t1.join();// --> The join method allows one thread to wait for the completion
// of another
// } catch (Exception e) {
// System.out.println(e);
// }
// t2.start();
// }
// }

// 2.) sleep method

// class MyThread1 extends Thread {

// public void run() {
// int i = 1;
// while (i < 10) {
// System.out.println("i am thread 1");
// try {
// Thread.sleep(500);// Thread.sleep causes the current thread to suspend
// execution for a specified
// // period.
// } catch (InterruptedException e) {

// e.printStackTrace();
// }
// i++;
// }
// }
// }

// class MyThread2 extends Thread {

// public void run() {
// int i = 1;
// while (i < 10) {

// System.out.println("i am thread 2");
// i++;
// }
// }
// }

// public class practice {
// public static void main(String[] args) {
// MyThread1 t1 = new MyThread1();
// MyThread2 t2 = new MyThread2();

// t1.start();
// t2.start();
// }
// }