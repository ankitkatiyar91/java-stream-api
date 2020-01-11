public class ResturantMenu {
    private String name;
    private Integer calories;
    private DishType type;

    public ResturantMenu(String name, Integer calories, DishType type) {
        this.name = name;
        this.calories = calories;
        this.type = type;
    }

    public Integer getCalories() {
        return calories;
    }

    public void setCalories(Integer calories) {
        this.calories = calories;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DishType getType() {
        return type;
    }

    @Override
    public String toString() {
        return "ResturantMenu{" +
                "name='" + name + '\'' +
                ", calories=" + calories +
                ", type=" + type +
                '}';
    }
}


