import java.util.stream.Stream;
public class T4 {

    public static void main(String[] args) {

        generator(25214903917L,11L, (long) Math.pow(2,48)).limit(10).forEach(System.out::println);
    }
    public static Stream<Long> generator(long a, long c, long m){
      return Stream.iterate(2L,e->(a*e+c)%m);

    }

}

