package edu.cnm.deepdive;

public class CanisLupus extends Canis {

  static {
    System.out.println("Canis lupus static initialization block 1");
  }

  private static String description = getDescription();

  private String name;

  {
    System.out.println("CanisLupus instance initialization block");
  }

  public CanisLupus() {
    System.out.println("CanisLupus::new");
  }

  public static String getDescription() {
    System.out.println("CanisLupus::getDescription");
    return "Canis lupus is the binomial genus/species name of the gray wolf.";
  }

  @Override
  public void hunt() {
    System.out.println("Hunt other animals in packs.");
  }

  public void speak() {
    System.out.println("Howl!");
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  static {
    System.out.println("Canis lupus static initialization block 2");
  }

}
