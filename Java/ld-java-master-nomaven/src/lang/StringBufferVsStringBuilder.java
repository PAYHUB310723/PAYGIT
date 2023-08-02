package lang;

public class StringBufferVsStringBuilder {
    public static void main(String[] args) {
        long startTime = System.nanoTime();
        for (int i = 0; i < 100; i++) {
        }
        ;
        long estimatedTime = System.nanoTime() - startTime;
        System.out.println(estimatedTime);
        long startTime1 = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
        }
        ;
        long estimatedTime1 = System.nanoTime() - startTime1;
        System.out.println(estimatedTime1);
        int N = 77777777;
        long t;
        // {{{{{
        {
            StringBuffer sb = new StringBuffer();
            t = System.currentTimeMillis();
            for (int i = N; i-- > 0;) {
                sb.append("1");
            }
            System.out.println("BUFFER");
            System.out.println(System.currentTimeMillis() - t);
            // System.out.println(sb);
        }
        // }}}}}
        {
            StringBuilder sb = new StringBuilder();
            t = System.currentTimeMillis();
            for (int i = N; i > 0; i--) {
                sb.append("1");
            }
            System.out.println("BUILDER");

            System.out.println(System.currentTimeMillis() - t);
        }
        {
            System.out.println("STRING");

            String string = "1";
            t = System.currentTimeMillis();
            for (int i = 77777; i-- > 0;) {
//            for (int i = N; i-- > 0;) {
                string += i;
            }
            System.out.println(System.currentTimeMillis() - t);
            // System.out.println(sb);
        }
    }
}