import java.io.InputStream;
import java.util.*;
import java.util.stream.Collectors;

public class T2 {

    public T2() {
    }

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ivan","Peter","Dima","Kolia","Vasyl"); // dorabotat s task1

        String namesStream = names.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.joining(", "))
                .toUpperCase(Locale.ROOT);
        System.out.println(namesStream);
    }
}
