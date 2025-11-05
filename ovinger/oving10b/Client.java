import java.util.*;

public class Client {
  public static void main(String[] args) {
    MenuRegister reg = new MenuRegister();
    Scanner scanner = new Scanner(System.in);

    reg.registerDish(new Dish("Bruschetta", DishType.STARTER, 5.5, "Tomato, basil"));
    reg.registerDish(new Dish("Caesar Salad", DishType.STARTER, 6.75, "Lettuce, dressing, croutons"));
    reg.registerDish(new Dish("Steak", DishType.MAIN, 18.0, "Grilled sirloin"));
    reg.registerDish(new Dish("Pasta Carbonara", DishType.MAIN, 12.5, "Pasta, egg, pancetta"));
    reg.registerDish(new Dish("Salmon", DishType.MAIN, 15.0, "Pan-seared salmon"));
    reg.registerDish(new Dish("Burger", DishType.MAIN, 11.0, "Beef patty, bun, toppings"));
    reg.registerDish(new Dish("Fries", DishType.SIDE, 3.0, "Fried potatoes"));
    reg.registerDish(new Dish("Soda", DishType.DRINK, 2.5, "Sparkling soft drink"));
    reg.registerDish(new Dish("Tiramisu", DishType.DESSERT, 6.0, "Mascarpone, coffee"));
    reg.registerDish(new Dish("Ice Cream", DishType.DESSERT, 4.0, "Vanilla scoop"));

    Set<String> italian = new LinkedHashSet<>(Arrays.asList("Bruschetta", "Pasta Carbonara", "Tiramisu"));
    reg.registerMenu("Italian Classic", italian);

    Set<String> steakDinner = new LinkedHashSet<>(Arrays.asList("Caesar Salad", "Steak", "Fries", "Soda"));
    reg.registerMenu("Steak Dinner", steakDinner);

    Set<String> seafood = new LinkedHashSet<>(Arrays.asList("Bruschetta", "Salmon", "Ice Cream"));
    reg.registerMenu("Seafood Special", seafood);

    Set<String> burgerMeal = new LinkedHashSet<>(Arrays.asList("Burger", "Fries", "Soda"));
    reg.registerMenu("Burger Meal", burgerMeal);
    String in;
    while (true) {
      System.out.println("1)add dish \n2)find dish  \n3)find by type  \n4)add menu  \n5)find menus by price  \n6)list menus  \n0)exit");
      in = scanner.nextLine().trim();
      if ("0".equals(in)) break;

      switch (in) {
        case "1": {
          System.out.print("name: "); String name = scanner.nextLine().trim();
          System.out.print("type (" + Arrays.toString(DishType.values()) + "): "); DishType t = DishType.valueOf(scanner.nextLine().trim());
          System.out.print("price: "); double p = Double.parseDouble(scanner.nextLine().trim());
          System.out.print("recipe: "); String r = scanner.nextLine().trim();
          reg.registerDish(new Dish(name, t, p, r));
          System.out.println("ok");
          break;
        }
        case "2": {
          System.out.print("name: "); System.out.println(reg.findDishByName(scanner.nextLine().trim()));
          break;
        }
        case "3": {
          System.out.print("type: "); DishType tt = DishType.valueOf(scanner.nextLine().trim());
          reg.findDishesByType(tt).forEach(d -> System.out.println(" - " + d));
          break;
        }
        case "4": {
          System.out.print("menu name: "); String mname = scanner.nextLine().trim();
          System.out.print("dish names (comma): "); String[] parts = scanner.nextLine().split(",");
          Set<String> names = new LinkedHashSet<>();
          for (String s : parts) names.add(s.trim());
          reg.registerMenu(mname, names);
          System.out.println("menu added");
          break;
        }
        case "5": {
          System.out.print("min: "); double min = Double.parseDouble(scanner.nextLine().trim());
          System.out.print("max: "); double max = Double.parseDouble(scanner.nextLine().trim());
          reg.findMenusByPriceRange(min, max).forEach(System.out::println);
          break;
        }
        case "6": {
          reg.allMenus().forEach(System.out::println);
          break;
        }
        default:
          System.out.println("unknown");
      }
      System.out.println();
    }
    scanner.close();
    System.out.println("bye");
  }
}