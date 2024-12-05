// quick quiz 1

// class Animal {

// int food_cost;

// void home() {
// System.out.println("leaves in jungle");
// }

// int getFc() {
// return food_cost;
// }

// int setFc(int cost) {
// return this.food_cost = cost;
// }

// }

// class Dog extends Animal {

// void bark() {
// System.out.println("bhaw bhaw ");
// }
// }

// public class practice {
// public static void main(String[] args) {
// Dog d = new Dog();

// d.bark();
// d.home();
// System.out.println("cost of food = " + d.setFc(50));

// }
// }

// inheriting constructors

// class Base {
// public Base() {
// System.out.println("I am the constructor of base class");
// }

// public Base(int x) {
// System.out.println("I am the constructor of base class with value of x = " +
// x);
// }

// }

// class Derived extends Base {
// public Derived() {
// System.out.println("I am the constructor of derived class");
// }

// public Derived(int x, int y) {
// super(x);
// System.out.println("I am the constructor of derived class with value of y = "
// + y);
// }

// }

// class Child extends Derived {
// public Child() {
// System.out.println("I am the constructor of child class");
// }

// public Child(int x, int y, int z) {
// super(x, y);
// System.out.println("I am the constructor of child class with value of z = " +
// z);
// }

// }

// public class practice {
// public static void main(String[] args) {
// // Derived d = new Derived();
// // Derived d = new Derived(1, 2);
// // Derived d = new Derived(1);// produces an error 2 args or no args should
// only
// // be there
// // Child c = new Child();
// Child c = new Child(4, 5, 6);

// }
// }

// this keyword

// class Base {
// int a, b;

// public int setA(int a) {
// return this.a = a;
// }

// public int getA() {
// return a;
// }

// public int setB(int b) {
// return b = b;// agar aise he variable ka naam aur parameter ka naam same hoga
// toh bina this
// // keyword ke
// // compiler yaha toh error dikhaega ya output 0 dikhaega varies from compiler
// to
// // compiler
// // agar variable aur parameter ka naam different ho toh bina this keyword ke
// bhi
// // kaam chal jaega
// }

// public int getB() {
// return b;
// }

// }

// public class practice {
// public static void main(String[] args) {
// Base b = new Base();

// b.setA(4);
// b.setB(5);

// System.out.println(b.getA());
// System.out.println(b.getB());

// }
// }

// super keyword
// below is the code from chat gpt its easy

// In Java, the super keyword is used to refer to the immediate parent class's
// instance variable, invoke parent class methods, and invoke the parent class
// constructor. Here's how you can use super in each scenario:

// Referring to immediate parent class instance variable:

// You can use super to access the instance variables of the immediate parent
// class. Here's an example:

// class Parent {
// int parentVar = 10;
// }

// class Child extends Parent {
// int childVar = 20;

// void display() {
// System.out.println("Parent variable: " + super.parentVar);
// System.out.println("Child variable: " + childVar);
// }
// }
// In the Child class, super.parentVar is used to access the parentVar from the
// immediate parent class.

// Invoking parent class method:

// You can use super to invoke a method from the immediate parent class. Here's
// an example:

// class Parent {
// void display() {
// System.out.println("Parent class method");
// }
// }

// class Child extends Parent {
// void displayChild() {
// super.display(); // Invoking parent class method
// System.out.println("Child class method");
// }
// }
// In the Child class, super.display() is used to invoke the display method from
// the immediate parent class.

// Invoking parent class constructor:

// You can use super to invoke the constructor of the immediate parent class.
// Here's an example:

// class Parent {
// int parentVar;

// Parent(int var) {
// this.parentVar = var;
// System.out.println("Parent class constructor");
// }
// }

// class Child extends Parent {
// int childVar;

// Child(int parentVar, int childVar) {
// super(parentVar); // Invoking parent class constructor
// this.childVar = childVar;
// System.out.println("Child class constructor");
// }
// }
// In the Child class constructor, super(parentVar) is used to invoke the
// constructor of the immediate parent class (Parent). This ensures that the
// parent class's constructor is called before the child class's constructor.

// method overriding

// class Base {
// void Dog() {
// System.out.println("i am dog method of base class ");
// }

// }

// class Derived extends Base {
// @Override //not compulsory to write @Override its generally considered as
// good practice and gives better code readability
// void Dog() {
// System.out.println("i am dog method of derived class ");
// }
// }

// public class practice {
// public static void main(String[] args) {
// Derived d = new Derived();

// d.Dog();
// }
// }

// Dynamic method dispatch(V.V.V IMP for exams)

class Phone {

    void On() {
        System.out.println("welcome to nokia 33 ");

    }

    void ring() {
        System.out.println("phone is ringing ");
    }

}

class SmartPhone extends Phone {

    @Override
    void ring() {
        System.out.println("Smartphone is ringing ");
    }

    void vibrate() {
        System.out.println("Smart phone is vibrating zoozoo zoo zoo zoooo");
    }

    void Restart() {
        System.out.println("Rebooting your Samsung S24 ultra ");

    }

}

public class practice {
    public static void main(String[] args) {
        Phone obj = new SmartPhone();
        obj.ring();// can only call overrided methods

    }
}