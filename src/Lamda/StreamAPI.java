package Lamda;

import java.util.stream.IntStream;

public class StreamAPI {
    int[] a = {-1,-2,-3,5,10,15};

    public StreamAPI() {
        IntStream.of(a).filter(value -> value<0).forEach(System.out::println);
    }

}
