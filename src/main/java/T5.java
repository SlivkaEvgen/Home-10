//Напишите метод public static <T> Stream<T> zip(Stream<T> first, Stream<T> second)
//        который "перемешивает" элементы из стримов first и second, останавливается тогда,
//        когда у одного из стримов закончатся элементы.

import javax.swing.text.html.HTMLDocument;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class T5<T> {

    public static void main(String[] args){
        Stream<Integer> first = Stream.of(1,2,3,4,5,5,5);
        Stream<Integer> second = Stream.of(6,7,8,9);
        System.out.println(zip(first,second));
    }
    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second) {
        Stream<T> integer = Stream.<T>builder().build();
          Stream.concat(second,first).forEach(System.out::println);
return Stream.<T>builder().build();
    }

}
