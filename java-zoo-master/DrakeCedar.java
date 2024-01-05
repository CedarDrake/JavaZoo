

/**
 * A BoopleSnoot is Mr. Jaffe's animal
 * 
 * @author Cedar Drake
 * @version 1.0 2023-01-5
 */
public class DrakeCedar extends Animal
{
  public DrakeCedar() {
    super("Cedar Drake", "Sliver", 0);
  }
  
  public String speak() {
      return "Radiation!";
  }
  public String getType() {
    return "Atom";
  }
  public String getName() {
      return "Plutonium";
  }
  public String getDisposition() {
      return "Explosive";
  }
}
