package multithreading;

public class TimeEx {
    public static void main(String[] args) {
        {
            nanoSeconds();
            milliSeconds();
        }
    }

    private static void nanoSeconds() {
        long gameMoveStartTime = System.nanoTime();
        for(int ctr=0; ctr < 1000000; ctr++) {

        }
        long gameMoveEndTime = System.nanoTime();
        long moveTime = gameMoveEndTime - gameMoveStartTime;

        System.out.println("The move has taken : " + moveTime + " nano seconds");
    }
    private static void milliSeconds() {
        long gameMoveStartTime = System.currentTimeMillis();
        for(int ctr=0; ctr < 1000000; ctr++) {

        }
        long gameMoveEndTime = System.currentTimeMillis();
        long moveTime = gameMoveEndTime - gameMoveStartTime;

        System.out.println("The move has taken : " + moveTime + " milli seconds");
    }
}
