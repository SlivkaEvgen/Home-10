import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class T2 {

    public T2() {
    }

    public static void main(String[] args) {
        List<String> names = Arrays.asList("IVan","Peter","Dima","KOlia","VAsyl");

        String namesStream = names.stream().map(String::toUpperCase)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.joining(", "));
        System.out.println(namesStream);
    }
}
