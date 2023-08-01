package p1;



public class P1C1 {
    private String privateVar = "private Var";
     String defaultVar = "defaultVar";

    protected String protectedVar = "protectedVar";

    public String publicVar = "publicVar";
    private void privateMethod(){
        System.out.println("private method!");
        int i = 10;
        int j = 0;
        // x and y 10/ y= 0;
        int result = i/j;
    }
     void defaultMethod(){
        System.out.println("private method!");
        int i = 10;
        int j = 0;
        // x and y 10/ y= 0;
//        int result = i/j;
    }

    protected void protectedMethod(){
        System.out.println("protected method!");
        int i = 10;
        int j = 0;
        // x and y 10/ y= 0;
//        int result = i/j;
    }

    public void publicMethod(){
        System.out.println("public method!");
        int i = 10;
        int j = 0;
    }
}


