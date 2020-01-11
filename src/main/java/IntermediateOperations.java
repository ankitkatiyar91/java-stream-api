import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class IntermediateOperations {

    public static void main(String[] args) {
        List<ResturantMenu> resturantMenus = new ArrayList<>();
        resturantMenus.add(new ResturantMenu("Paneer", 100, DishType.VEG));
        resturantMenus.add(new ResturantMenu("Chicken", 300, DishType.NON_VEG));
        resturantMenus.add(new ResturantMenu("Potato", 500, DishType.VEG));
        resturantMenus.add(new ResturantMenu("Cheese", 200, DishType.VEG));
        resturantMenus.add(new ResturantMenu("Pizza", 600, DishType.VEG));

        System.out.println("Thread: " + Thread.currentThread().getName());

        Long time = System.nanoTime();
        Stream<ResturantMenu> stream = resturantMenus.stream();
        System.out.println("Dishes: " + streamFilter(stream));
        System.out.println("Time Taken: " + (System.nanoTime() - time));
        time = System.nanoTime();

        System.out.println("Dishes: " + streamFilter(resturantMenus.parallelStream()));
        System.out.println("Time Taken: " + (System.nanoTime() - time));

        try {
            System.out.println("Trying old stream again ###########");
            System.out.println("Dishes: " + streamFilter(stream));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private static List<String> streamFilter(Stream<ResturantMenu> stream) {
        return stream.filter((item) -> {
            System.out.println("Thread: " + Thread.currentThread().getName() + " Filter: " + item.getName() + " Calories:" + item.getCalories());
            return item.getCalories() < 300;
        }).map(item -> {
            System.out.println("Thread: " + Thread.currentThread().getName() + " Mapping: " + item.getName());
            return item.getName();
        }).collect(Collectors.toList());
    }


}
