import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFlatMap {

    public static void main(String[] args) {
        // Find all the unique character in a sequence of words
        List<String> word = Arrays.asList("Hello", "World");
        String uniqueCharacters = word.stream()
                .map(s -> s.split(""))
                .flatMap(Arrays::stream)
                .map(String::toLowerCase)
                .distinct()
                .sorted().
                        collect(Collectors.joining(","));

        System.out.println("Unique Chars: " + uniqueCharacters);
    }
}
