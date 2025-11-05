import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.List;


public class MenuRegister {
  private final Map<String, Dish> dishes = new LinkedHashMap<>();
  private final List<Menu> menus = new ArrayList<>();

  public void registerDish(Dish dish) {
    dishes.put(dish.getName(), dish);
  }

  public Dish findDishByName(String name) {
    return dishes.get(name);
  }

  public List<Dish> findDishesByType(DishType type) {
    return dishes.values().stream()
        .filter(d -> d.getType() == type)
        .toList();
  }
}


