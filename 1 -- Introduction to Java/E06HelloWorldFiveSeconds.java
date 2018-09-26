public class E06HelloWorldFiveSeconds {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        while (System.currentTimeMillis() - startTime < 5000L) {
            System.out.println("Hello World");
        }
        System.out.println(System.currentTimeMillis() - startTime);
    }
}
