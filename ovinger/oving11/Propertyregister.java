import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.Iterator;

public class Propertyregister {
  private List<Property> properties;

  public Propertyregister() {
    this.properties = new ArrayList<>();
  }

  public void addProperty(Property property) {
    properties.add(property);
  }

  public boolean removeProperty(Property property) {
    return properties.remove(property);
  }

  public List<Property> getAllProperties() {
    return new ArrayList<>(properties);
  }

  public Property searchByIdentifiers(int municipalityNumber, int lotNumber, int sectionNumber) {
    for (Property p : properties) {
        if (p.matches(municipalityNumber, lotNumber, sectionNumber)) {
            return p;
        }
    }
    return null;
  }

  public List<Property> searchByLotNumber(int lotNumber) {
    List<Property> result = new ArrayList<>();
    for (Property p : properties) {
      if (p.getLotNumber() == lotNumber) {
        result.add(p);
      }
    }
    return result;
  }

  public double averageArea() {
    if (properties.isEmpty()) return 0.0;
    OptionalDouble od = properties.stream().mapToDouble(Property::getArea).average();
    return od.isPresent() ? od.getAsDouble() : 0.0;
  }

  public int count() {
    return properties.size();
  }

  public boolean removeByIdentifiers(int municipalityNumber, int lotNumber, int sectionNumber) {
    Iterator<Property> it = properties.iterator();
    while (it.hasNext()) {
      Property p = it.next();
      if (p.matches(municipalityNumber, lotNumber, sectionNumber)) {
        it.remove();
        return true;
      }
    }
    return false;
  }
}