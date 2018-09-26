public class E04RandomNumberHelloWorld {
    public static void main(String[] args) {
        int random = (int) (Math.random() * 100);
        for (int i = 0; i < random; i++) {
            System.out.println("Hello World");
        }
    }
}
