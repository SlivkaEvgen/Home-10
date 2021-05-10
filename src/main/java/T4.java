import java.util.stream.Stream;

import static java.lang.Math.pow;

public class T4 {                      //GOTOVO!!!
    private static long x;

    public static void main(String[] args) {

        Stream<Long> longStream = generator(25214903917L, 11, 281474976710656L, 1);
    }
    public static Stream<Long> generator(long a, long c, long m, long seed){

        Stream.iterate(seed, n->1*(a*pow(x,n) + c) % m<1000000, n->n+1).takeWhile(n -> n < 100000000).forEach(System.out::println);
        return Stream.<Long>builder().build();
    }

}

