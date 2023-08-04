package demo.oops;

public class StaticVsInstanceEx {
    public static void main(String[] args) {
//        Employee.companyName  = "The Amazing Company";
        String companyName = Employee.companyName;
//        employee name is specific to an employee
//        String employeeNameTest = Employee.emplyoeeName;
        System.out.println(companyName);
        Employee employee1 = new Employee();
        employee1.employeeName = "Peter";
//        employee1.companyName = "The Fantastic Company";
        System.out.println(employee1.employeeName);
        Employee.companyName = "Wonderful Company!";
        System.out.println(employee1.companyName);
        Employee employee2 = new Employee();
        employee2.employeeName = "Sam";
        System.out.println(employee2.employeeName);
        System.out.println(employee2.companyName);
        System.out.println(Employee.companyName);
        employee2.zoomId = "z01";
        employee2.disp();
    }
}

class Employee {
//    static variable / common for all the objects of the same class
//    public final static String companyName = "The Amazing Company";
    public  static String companyName = "The Amazing Company";
    public static String zoomId;
//   each object has its own copy
 // instance variable
    public String employeeName;

    //myself :
    public void disp(){
        System.out.println("******");
        System.out.println(this.employeeName);
//        System.out.println(this.companyName);
//        System.out.println(this.zoomId);
    }
}

