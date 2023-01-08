/* Question:
5a. create an enum: size which indicates the size of pizza: small, medium, large. create a class called test which has an instance of size, constructor, method called order pizza which has a switch statement in it having case labels of size.
a driver class for main method creates an instance if test and orders pizza
 */

enum Size {
 SMALL, MEDIUM, LARGE, EXTRALARGE
}

class Test {
 Size pizzaSize;
 public Test(Size pizzaSize) {
   this.pizzaSize = pizzaSize;
 }
 public void orderPizza() {
   switch(pizzaSize) {
     case SMALL:
       System.out.println("I ordered a small size pizza.");
       break;
     case MEDIUM:
       System.out.println("I ordered a medium size pizza.");
       break;
     default:
       System.out.println("I don't know which one to order.");
       break;
   }
 }
}

class Main {
 public static void main(String[] args) {
   Test t1 = new Test(Size.MEDIUM);
   t1.orderPizza();
 }
}
