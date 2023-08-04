package demo.funda;

public class DefaultConstructor {
    int x;
    float f;
    boolean b = false;

    public DefaultConstructor(){
        x = 100;
    }

    public static void main(String[] args) {
//        create reference
        DefaultConstructor defaultConstructor;
        System.out.println("Debugging!");
//        create instance
        defaultConstructor = new DefaultConstructor();
        System.out.println(defaultConstructor.x);
        System.out.println(defaultConstructor.f);
        System.out.println(defaultConstructor.b);
            }
}
