import java.util.Arrays;
import java.util.stream.Collectors;

public class T3 {   //решено
    public static void main(String[] args) {
        String[] array = {"1, 2, 0", "4, 5"};
        String arrays = Arrays
                .stream(String.join(",", array)
                        .replaceAll(" ", "")
                        .split(","))
                .sorted().collect(Collectors.joining(", "));
        System.out.println("\""+arrays+"\"");
    }
}
