package lang;

public class NanoMilliTimeEx {
    public static void main(String[] args) {
        long startTime = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
        }
        ;
        long estimatedTime = System.nanoTime() - startTime;
        System.out.println(estimatedTime);
        long startTime1 = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
        }
        ;
        long estimatedTime1 = System.currentTimeMillis() - startTime1;
        System.out.println(estimatedTime1);
    }
}
