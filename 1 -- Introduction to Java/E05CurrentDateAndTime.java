import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class E05CurrentDateAndTime {
    public static void main(String[] args) {
        // This is just one way to do it.
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        System.out.println(dtf.format(now));
    }
}
