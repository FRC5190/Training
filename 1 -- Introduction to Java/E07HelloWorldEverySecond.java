public class E07HelloWorldEverySecond {
    public static void main(String[] args) {
        long reset = System.currentTimeMillis();

        // Infinite While Loop. Terminate the program manually
        while(true) {
            if (System.currentTimeMillis() - reset > 1000L) {
                System.out.println("Hello World");
                reset = System.currentTimeMillis();
            }
        }
     }
}
