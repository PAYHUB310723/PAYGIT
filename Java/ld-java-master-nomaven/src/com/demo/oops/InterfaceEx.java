package com.demo.oops;


public class InterfaceEx {
    public static void main(String[] args) {
//        Flyer flyerReference = new Flyer();
        Flyer flyer = new Bird();
        flyer.fly();
        Flyer flyer1 = new Aeroplane();
        flyer1.fly();
//        flyer.sing();
//        Bird bird = (Bird)flyer;
//        bird.sing();
//        Singer singer = new Arlan();
//        singer.sing();
    }
}

// Flyer, Aeroplane, Bird
 interface  Flyer {
    public abstract void fly();
//    abstract void fly();
//    public void fly();
//  public and abstract by default
//    void fly();
}
interface Singer {
    void sing();
}
class Arlan implements Singer{

    @Override
    public void sing() {
        System.out.println("Lupang Hinirang");
    }
}
class Bird implements Flyer,Singer{

    @Override
    public void fly() {
        System.out.println("Eats food, gets energy, flaps the wings, to fly");
    }

    @Override
    public void sing() {
        System.out.println("Twee, twee, twee  & twee....");
    }
}
abstract class Aeroplane implements Flyer {

    @Override
    public void fly() {
        System.out.println("Combustion of fuel gets energy, and uses properller to fly");

    }
    public void land() {

    }

    public abstract void fuel();
}
class Football implements Flyer {

    @Override
    public void fly() {
        System.out.println("The player kicks the football and it flies....");

    }
}

//abstract class Flyer {
//    public abstract void fly();
//}
//class Bird extends Flyer{
//
//    @Override
//    public void fly() {
//        System.out.println("Eats food, gets energy, flaps the wings, to fly");
//    }
//}
//class Aeroplane extends Flyer {
//
//    @Override
//    public void fly() {
//        System.out.println("Combustion of fuel gets energy, and uses properller to fly");
//
//    }
//}
//class Football extends Flyer {
//
//    @Override
//    public void fly() {
//        System.out.println("The player kicks the football and it flies....");
//
//    }
//}
