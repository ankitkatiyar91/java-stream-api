import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class CollectAndThen {

    public static void main(String[] args) {
        List<ResturantMenu> resturantMenus = DataFactory.getResturantMenus();

        Map<DishType, List<ResturantMenu>> collect = resturantMenus.stream().collect(groupingBy(ResturantMenu::getType));
        System.out.println("Collect By Type:" + collect);
        Map<DishType, ResturantMenu> collect1 = resturantMenus.stream()
                .collect(groupingBy(ResturantMenu::getType, collectingAndThen(maxBy(Comparator.comparingInt(ResturantMenu::getCalories)), Optional::get)));
        System.out.println("Collect By Type with Max Calories:" + collect1);

        Integer maxCalories = resturantMenus.stream().map(ResturantMenu::getCalories).collect(collectingAndThen(maxBy(Integer::compareTo), Optional::get));
        System.out.println("Max Calories:" + maxCalories);

    }
}
