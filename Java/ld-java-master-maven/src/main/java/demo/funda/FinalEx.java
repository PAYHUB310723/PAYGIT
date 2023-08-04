package demo.funda;

public class FinalEx {
    public static void main(String[] args) {
        TestFinal testFinal = new TestFinal();
        testFinal.test("Thursday");
        testFinal.test1("9:53");
    }
}

//FINAL CLASS CANNOT BE INHERITED
final class Test {

}

//class Test1 extends Test{
//
//}

//final method cannot be overridden
class Base2 {
    public void Base2Method1() {
        System.out.println("Base2Method1");
    }

    public final void Base2Method2() {
        System.out.println("Base2Method2");
    }
}

class Derived2 extends Base2 {
    //    initialize the final variable
    final String day = "Thursday";
    final String month;

    Derived2() {
//        day = "Wednesday";
//        initialize
        month = "September";
//        Variable 'month' might already have been assigned
//        month = "October";
    }

    @Override
    public void Base2Method1() {
//       month = "September";
        System.out.println("Base2Method1 Overridden");
    }
//    @Override
//    public final void Base2Method2() {
//        System.out.println("Base2Method2");
//    }
}

class TestFinal {
    public void test(final String day) {
        System.out.println(day);
//        Cannot assign a value to final variable 'day'
//        day = "Friday";
    }
    public void test1(String time) {
        System.out.println(time);
        time = "9:54";
        System.out.println(time);
    }
}

