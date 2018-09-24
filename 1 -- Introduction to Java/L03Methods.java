public class L03Methods {
    // This is a method
    public static void main(String[] args) {
        double sum = sum(5, 10);
        print(sum); // Calls the method below
    }

    // This is another method
    private static void print(double a) {
        System.out.println(a);
    }

    // Takes in two doubles and returns another double
    private static double sum(double a, double b) {
        return a + b;
    }
}
