// question 1

// abstract class pen {
// abstract void write();

// abstract void refil();
// }

// class camlin extends pen {
// public void write() {
// System.out.println("writing with camlin .. ");
// }

// public void refil() {
// System.out.println("refiling camlin by buying new refil .. ");
// }
// }

// public class PracticeSet {
// public static void main(String[] args) {
// camlin c = new camlin();
// c.write();
// c.refil();

// }
// }

// question 2

// abstract class pen {
// abstract void write();

// abstract void refil();
// }

// class FountainPen extends pen {
// public void write() {
// System.out.println("writing with camlin .. ");
// }

// public void refil() {
// System.out.println("refiling camlin by buying new refil .. ");
// }

// void changeNib() {
// System.out.println("changng the nib ...");
// }
// }

// public class PracticeSet {
// public static void main(String[] args) {
// FountainPen c = new FountainPen();
// c.write();
// c.refil();
// c.changeNib();

// }
// }

// question 3

// class Monkey {
// void jump() {
// System.out.println("jumping .... ");
// }

// void bite() {
// System.out.println("bitting ... ");
// }

// }

// interface BasicAnimal {
// void eat();

// void sleep();
// }

// class Human extends Monkey implements BasicAnimal {

// @Override
// public void eat() {
// System.out.println("eating ... ");
// }

// @Override
// public void sleep() {
// System.out.println("sleeping ... ");
// }
// }

// public class PracticeSet {
// public static void main(String[] args) {
// Human h = new Human();
// h.eat();
// h.sleep();
// h.bite();
// h.jump();
// }

// }

// question 4

// (polymorphism ka basic simple words mai matlab hai ke khali neccessary chizo
// ka access de
// for ex: agar koi apse camera mang rha hai aur aap phone ka camera kholke
// dete ho toh aap ensure
// kare ke voh khali camera he use kare naki whatsapp kholke messages padhe ya
// call logs check kare which can be done by dynamic method dispatch)

// abstract class Telephone {
// abstract void ring();

// abstract void lift();

// abstract void disconnect();

// }

// class MySmartPhone extends Telephone {
// public void ring() {
// System.out.println("ringing ... ");
// }

// public void lift() {
// System.out.println("lifting ... ");
// }

// public void disconnect() {
// System.out.println("disconnect ... ");
// }

// void call() {
// System.out.println("calling ... ");
// }

// void pic() {
// System.out.println("taking pic ... ");
// }

// }

// public class PracticeSet {
// public static void main(String[] args) {
// Telephone t = new MySmartPhone();
// t.ring();
// t.lift();
// // t.pic();// throws error

// MySmartPhone m = new MySmartPhone();
// m.disconnect();
// m.call();

// }
// }

// question no 5

// class Monkey {
// void jump() {
// System.out.println("jumping .... ");
// }

// void bite() {
// System.out.println("bitting ... ");
// }

// }

// interface BasicAnimal {
// void eat();

// void sleep();
// }

// class Human extends Monkey implements BasicAnimal {

// @Override
// public void eat() {
// System.out.println("eating ... ");
// }

// @Override
// public void sleep() {
// System.out.println("sleeping ... ");
// }
// }

// public class PracticeSet {
// public static void main(String[] args) {
// Monkey m1 = new Human();
// m1.jump();
// m1.bite();
// // m1.sleep(); //--> Cannot use speak method because the reference is monkey
// // which does not have speak method
// }

// }

// question no 6 and 7

// interface SmartTVRemote {
// void netflix();

// void home();

// void youtube();
// }

// interface TVRemote extends SmartTVRemote {
// void on();

// void off();

// }

// class TV implements TVRemote {
// public void netflix() {
// System.out.println("netflix ... ");
// }

// public void home() {
// System.out.println("home ... ");
// }

// public void youtube() {
// System.out.println("youtube ... ");
// }

// public void on() {
// System.out.println("on ... ");
// }

// public void off() {
// System.out.println("off ... ");
// }
// }

// public class PracticeSet {
// public static void main(String[] args) {
// TV r = new TV();

// r.on();
// r.off();
// r.youtube();
// r.netflix();
// r.home();
// }
// }