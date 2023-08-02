package oops;

public class AbstractClassEx {

   public static void main(String[] args) {
      Mobile mobile = null;
      // Cannot instantiate the type Mobile
      // mobile = new Mobile();

      Mobile mobile1 = null;
      // dynamic polymorphsim (the compiler does not know it.)
      double randomValue = Math.random();
      if (randomValue < 0.5) {
         mobile1 = new SmartPhone();
      } else {
         mobile1 = new FeaturePhone();
      }
      mobile1.calling();
   }
}

// Mainly used for inheritance
abstract class Mobile {
    String internalMemorySize = "8gb";

   // absract methods do not have a body
   public abstract void calling();

   public abstract void texting();

   public void fm() {
      System.out.println("98.3 fm");
   }
}

class SmartPhone extends Mobile {

   public void calling() {
      System.out.println("Dial using virtual keys");
   }

   public void texting() {
      System.out.println("Text using virtual keys");
   }

}

class FeaturePhone extends Mobile {

   public void calling() {
      System.out.println("Dial using physical keys");
   }

   public void texting() {
      System.out.println("Text using physical keys");
   }

}

