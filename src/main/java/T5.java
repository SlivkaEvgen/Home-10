import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class T5 {
    static Long a;

    public static void main(String[] args) {
        List<Integer> number1 = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<Integer> number2 = Arrays.asList(7, 8, 9, 0);

        int q = number1.size();
        int w = number2.size();
        if (q > w) {
            a = (long) w;
        }
        if (w > q) {
            a = (long) q;
        }
        Stream<Integer> first = number1.stream();
        Stream<Integer> second = number2.stream();

        zip(first, second).forEach(System.out::print);
    }

    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second) {

        return Stream.concat(first.limit(a).parallel(), second.limit(a).parallel());
    }

}
