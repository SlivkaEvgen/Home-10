
import java.util.stream.Stream;

public class T5 {

    public static void main(String[] args){
        Stream<Integer> first = Stream.of(1,2,3,4,5);
        Stream<Integer> second = Stream.of(6,7,8,9);
       zip(first,second).forEach(System.out::print);
    }
    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second) {

         return Stream.concat(first,second).parallel();

    }

}
