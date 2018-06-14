package edu.cnm.deepdive;

import java.util.ArrayList;
import java.util.List;

public class Test {

  public static void main(String[] args) {
    new Object() {

      private int data = computeSomething();

      {
        doSomething();
        System.out.println(getClass().getName());
      }

      private void doSomething() {
        System.out.println("::doSomething");
      }

      private int computeSomething() {
        System.out.println("::computeSomething");
        return 0;
      }

    };

 //   System.out.println(Canis.getDescription());
//   Canis spot = new CanisLupusFamiliaris();
//    Canis buck = new CanisLupus();
//    List<Canis> kennel = fillKennel();
//    inspectKennel(kennel);
  }

  private static List<Canis> fillKennel() {
    List<Canis> kennel = new ArrayList<>();
    kennel.add(new CanisLupusFamiliaris());
    kennel.add(new CanisLupus());
    kennel.add(new CanisLupusFamiliaris());
    kennel.add(new CanisDirus());
    kennel.add(new CanisLupus());
    kennel.add(new CanisLupusFamiliaris());
    ((CanisLupusFamiliaris) kennel.get(0)).setGoodBoy(false);
    return kennel;
  }

  private static void inspectKennel(List<Canis> kennel) {
      for (Canis canis : kennel) {
        canis.hunt();
        if (canis instanceof CanisLupus) {
          ((CanisLupus) canis).speak();
          if (canis instanceof CanisLupusFamiliaris
              && ((CanisLupusFamiliaris) canis) .isGoodBoy()) {
            System.out.println("I'm a good boy!");
          }
        }
      }
  }

}
