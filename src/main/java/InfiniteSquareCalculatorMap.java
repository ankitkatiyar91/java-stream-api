import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

public class InfiniteSquareCalculatorMap {
    private static AtomicInteger current = new AtomicInteger(0);

    public static void main(String[] args) {
        // create a stream from a generator function
        Stream<Integer> numberStream = Stream.generate(() -> getCurrent());

        int squaresFor = 12;

        numberStream.map(num -> {
            System.out.println("Finding Square of: " + num);
            return num * num;
        }).limit(squaresFor).forEach(System.out::println);
    }

    public static int getCurrent() {
        System.out.println("Generating..");
        return current.incrementAndGet();
    }
}
