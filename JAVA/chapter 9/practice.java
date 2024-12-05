// getteres setters and access modifiers
// quick quiz 1 is also included in this only

// class Employee {
// private int id;// cannot be accesed in main class directly
// private String name;

// public String setName(String naam) {
// return this.name = naam;
// }

// public int setId(int num) {
// return this.id = num;
// }

// public String getName() {
// return name;
// }

// public int getId() {
// return id;
// }

// }

// public class practice {
// public static void main(String[] args) {
// Employee krish = new Employee();

// krish.setId(6);
// krish.setName("mera naam krish hai");

// System.out.println(krish.getId());
// System.out.println(krish.getName());

// }
// }

// constructors

// class Employee {

// private int id;
// private String name;

// public Employee() {
// id = 0;
// name = "krish";
// }

// public Employee(String myname) {
// id = 5;
// name = myname;

// }

// public Employee(int ids, String myname) {
// id = ids;
// name = myname;

// }

// public int getId() {
// return id;
// }

// public String getName() {
// return name;
// }

// public int setId(int num) {
// return this.id = num;
// }

// public String setName(String myname) {
// return this.name = myname;
// }

// }

// public class practice {
// public static void main(String[] args) {

// // Employee em = new Employee("harry");
// // Employee em = new Employee();
// // Employee em = new Employee(50, "harry");
// Employee em = new Employee();//can also initialize by setter

// System.out.println("id = " + em.getId() + " name = " + em.getName());

// }
// }

// refer above code for quick quiz 2 concept same he hai