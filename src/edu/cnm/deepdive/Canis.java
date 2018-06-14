package edu.cnm.deepdive;

public abstract class Canis {

  public static final String NAMER = "Carl Linnaeus";

  private static String description = getDescription();

  private String name = getName();

  static{
    System.out.println("Canis static initialization block 1");
  }

  protected Canis() {
    System.out.println("Canis::new");
  }
  {
    System.out.println("Canis instance initialization block");
  }
  public abstract void hunt();

  public static String getDescription() {
    System.out.println("Canis:getDescription");
    return "Canis is an order or caniform carnivores with long snouts.";
  }

  static {
    System.out.println("Canis static initialization block 2");
  }

  private String getName() {
    System.out.println("Canis::getName");
    return "I have no name";
  }
}
