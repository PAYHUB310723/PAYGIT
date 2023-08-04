package demo.funda;

public class ClassAndObject {
    public static void main(String[] args) {
        Car tesla = new Car("Electric");
        System.out.println("Type : " + tesla.type + " Price " + tesla.price);
        tesla.displayDetails();
        System.out.println(tesla);
        System.out.println(tesla.toString());
        Car indica = new Car("Petrol");
        Train bulletTrain = new Train();

    }
}

//class Car {
class Car extends Object {
    String type = "Gasoline";
    int price = 500;
    Car(String pType) {
        type = pType;
    }
   public void displayDetails(){
       System.out.println("Type : " + type + " Price " + price);
   }

@Override
//annotations provide metadata.
    public String toString() {
        return "Type : " + type + " Price " + price;
    }
}

class Train {
    String type = "Electric Train";
}