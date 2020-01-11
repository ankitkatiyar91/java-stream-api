import java.util.ArrayList;
import java.util.List;

public class DataFactory {

    public static List<ResturantMenu> getResturantMenus() {
        List<ResturantMenu> resturantMenus = new ArrayList<>();
        resturantMenus.add(new ResturantMenu("Chicken", 300, DishType.NON_VEG));
        resturantMenus.add(new ResturantMenu("Chicken", 300, DishType.NON_VEG));
        resturantMenus.add(new ResturantMenu("Potato", 500, DishType.VEG));
        resturantMenus.add(new ResturantMenu("Cheese", 200, DishType.VEG));
        resturantMenus.add(new ResturantMenu("Pizza", 600, DishType.VEG));
        resturantMenus.add(new ResturantMenu("Pizza", 600, DishType.VEG));
        return resturantMenus;
    }
}
