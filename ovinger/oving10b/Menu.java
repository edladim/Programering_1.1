import java.util.LinkedHashSet;
import java.util.Set;

public class Menu {
  private final String name;
  private final Set<Dish> dishes;

  public Menu(String name, Set<Dish> dishes) {
    this.name = name;
    this.dishes = new LinkedHashSet<>(dishes);
  }
}