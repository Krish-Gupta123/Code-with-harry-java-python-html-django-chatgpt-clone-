// abstract classes

// abstract class Parent {
// public Parent() {
// System.out.println("i am a constuctor of parent class");
// }

// void Hello() {
// System.out.println("hello guys");
// }

// abstract void greet();

// abstract void greet2();
// }

// class child1 extends Parent {

// @Override
// public void greet() {
// System.out.println("Good Afternoon Sir");
// }

// @Override
// public void greet2() {
// System.out.println("Good morning Sir");
// }

// }

// abstract class child2 extends Parent {
// void method() {
// System.out.println("i am the method of child2 class");
// }

// }

// public class practice {
// public static void main(String[] args) {

// // Parent p = new Parent();// throws error(NOTE : "object of abstract class
// cant
// // be created")
// child1 c = new child1();
// // child2 c = new child2();// throws error(NOTE : "object of abstract class
// cant
// // be created")

// }
// }

// interfaces

// interface Bicycle {
// int a = 45;

// void applyBrake(int decreament);

// void speedUp(int increment);
// }

// interface Horn {
// void blowHorn1();

// void blowHorn2();
// }

// class KrishCycle implements Bicycle, Horn {

// // compulsory to declare all interfaces method as public or else it will
// throw
// // error

// public void applyBrake(int decreament)

// {
// System.out.println("Appling brakes .... ");
// }

// public void speedUp(int increment)

// {
// System.out.println("speeding up bicycle .... ");

// }

// public void blowHorn1() {
// System.out.println("pee pee pee .... ");
// }

// public void blowHorn2() {
// System.out.println("poo poo poo ... ");
// }

// }

// public class practice {
// public static void main(String[] args) {
// KrishCycle c = new KrishCycle();

// c.applyBrake(1);
// c.speedUp(1);
// c.blowHorn1();
// c.blowHorn2();

// // you cannot modify the properties of interfaces as they are final
// // c.a = 145;
// System.out.println(c.a);

// }
// }

// interface example and default methoods

// interface Camera {
// void takeSnap();

// void recordVideo();

// private void greet() {
// System.out.println("Welcome to Samsung galaxy S24 .... ");
// }

// default void record4kVideo() {
// greet();
// System.out.println("Recording 4k videos from samsung galaxy ultra pro max
// Camera interface .... ");
// }

// }

// interface Wifi {
// String[] getNetworkList();

// void connectToNetwork(String network);
// }

// class MyCellPhone {
// void calling(double cellNum) {
// System.out.println("calling " + cellNum);
// }

// void recievingCall() {
// System.out.println("Connecting ... ");
// }

// }

// class MySmartPhone extends MyCellPhone implements Camera, Wifi {

// // public void record4kVideo() {
// // System.out.println("recording 4k video from MySmartphone class");
// // }

// public void takeSnap() {
// System.out.println("capturing pic ... ");
// }

// public void recordVideo() {
// System.out.println("recording video ... ");
// }

// public String[] getNetworkList() {
// System.out.println("Getting network list ... ");
// String[] networkList = { "RG Events", "Hetal", "A 801" };
// return networkList;

// }

// public void connectToNetwork(String network) {
// System.out.println("Conneting to " + network);

// }

// }

// public class practice {
// public static void main(String[] args) {
// MySmartPhone S24 = new MySmartPhone();

// S24.record4kVideo();

// String[] Nl = S24.getNetworkList();
// for (String e : Nl) {
// System.out.println(e);
// }

// S24.connectToNetwork("OPPO");

// }
// }

// Inheritance in interface

// interface Parent {
// void meth1();

// void meth2();

// }

// interface Child extends Parent {
// void meth3();

// void meth4();
// }

// class MySample implements Child {
// public void meth1() {
// System.out.println("meth 1");
// }

// public void meth2() {
// System.out.println("meth 2");
// }

// public void meth3() {
// System.out.println("meth 3");
// }

// public void meth4() {
// System.out.println("meth 4");
// }

// }

// public class practice {
// public static void main(String[] args) {
// MySample ms = new MySample();
// ms.meth1();
// ms.meth2();
// ms.meth3();
// ms.meth4();
// }
// }

// polymorphism using interfaces

// (polymorphism ka basic simple words mai matlab hai ke khali neccessary chizo
// ka access de
// for ex: agar koi apse camera mang rha hai aur aap phone ka camera kholke
// dete ho toh aap ensure
// kare ke voh khali camera he use kare naki whatsapp kholke messages padhe ya
// call logs check kare which can be done by dynamic method dispatch)

// interface Camera {
// void takeSnap();

// void recordVideo();

// private void greet() {
// System.out.println("Welcome to Samsung galaxy S24 .... ");
// }

// default void record4kVideo() {
// greet();
// System.out.println("Recording 4k videos from samsung galaxy ultra pro max
// Camera interface .... ");
// }

// }

// interface Wifi {
// String[] getNetworkList();

// void connectToNetwork(String network);
// }

// class MyCellPhone {
// void calling(double cellNum) {
// System.out.println("calling " + cellNum);
// }

// void recievingCall() {
// System.out.println("Connecting ... ");
// }

// }

// class MySmartPhone extends MyCellPhone implements Camera, Wifi {

// // public void record4kVideo() {
// // System.out.println("recording 4k video from MySmartphone class");
// // }

// public void takeSnap() {
// System.out.println("capturing pic ... ");
// }

// public void recordVideo() {
// System.out.println("recording video ... ");
// }

// public String[] getNetworkList() {
// System.out.println("Getting network list ... ");
// String[] networkList = { "RG Events", "Hetal", "A 801" };
// return networkList;

// }

// public void connectToNetwork(String network) {
// System.out.println("Conneting to " + network);

// }

// void meth() {
// System.out.println("meth ... ");
// }

// }

// public class practice {
// public static void main(String[] args) {
// Camera S24 = new MySmartPhone();
// S24.record4kVideo();
// // S24.getNetworkList();// not allowed

// MySmartPhone MI = new MySmartPhone();
// MI.meth();
// MI.recordVideo();
// MI.getNetworkList();
// MI.calling(982128);

// }
// }