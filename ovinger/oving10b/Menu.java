import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Menu {
  private final String name;
  private final Set<Dish> dishes;

  public Menu(String name, Set<Dish> dishes) {
    this.name = name;
    this.dishes = new LinkedHashSet<>(dishes);
  }
  public String getName() {
      return name;
    }

    public Set<Dish> getDishes() {
      return dishes;
    }

    @Override
    public String toString() {
      String dishList = dishes.stream()
          .map(Dish::toString)
          .collect(Collectors.joining(", "));
      return String.format("Menu: %s | Dishes: [%s] | Total: %.2f", name, dishList);
    }
}