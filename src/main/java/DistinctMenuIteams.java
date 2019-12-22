import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class DistinctMenuIteams {

    public static void main(String[] args) {
        List<ResturantMenu> resturantMenus = new ArrayList<>();
        resturantMenus.add(new ResturantMenu("Chicken", 300));
        resturantMenus.add(new ResturantMenu("Chicken", 300));
        resturantMenus.add(new ResturantMenu("Potato", 500));
        resturantMenus.add(new ResturantMenu("Cheese", 200));
        resturantMenus.add(new ResturantMenu("Pizza", 600));
        resturantMenus.add(new ResturantMenu("Pizza", 600));

        List<String> distinctDishes = resturantMenus.stream().map(ResturantMenu::getName).distinct().collect(Collectors.toList());
        System.out.println(distinctDishes);
        System.out.println(distinctDishes.stream().sorted().collect(Collectors.joining(", ")));
        System.out.println(distinctDishes.stream().sorted(Comparator.reverseOrder()).collect(Collectors.joining(", ")));
    }
}
