import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class DistinctMenuIteams {

    public static void main(String[] args) {
        List<ResturantMenu> resturantMenus = DataFactory.getResturantMenus();

        List<String> distinctDishes = resturantMenus.stream().map(ResturantMenu::getName).distinct().collect(Collectors.toList());
        System.out.println(distinctDishes);
        System.out.println(distinctDishes.stream().sorted().collect(Collectors.joining(", ")));
        System.out.println(distinctDishes.stream().sorted(Comparator.reverseOrder()).collect(Collectors.joining(", ")));
    }


}
