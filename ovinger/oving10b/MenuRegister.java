import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
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
        .filter(dish -> dish.getType() == type)
        .toList();
  }

  public void registerMenu(String menuName, Set<String> dishNames) {
    Set<Dish> menuDishes = new LinkedHashSet<>();
    for (String name : dishNames) {
      menuDishes.add(dishes.get(name));
    }
    menus.add(new Menu(menuName, menuDishes));
  }

  public List<Menu> findMenusByPriceRange(double min, double max) {
    return menus.stream()
        .filter(menu -> {
            double price = menu.totalPrice();
            return price >= min && price <= max;})
        .toList();
  }

  public List<Menu> allMenus() {
    return new ArrayList<>(menus);
  }
}


