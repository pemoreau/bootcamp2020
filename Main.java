import java.util.*;


public class Main {

  public static int nbChainesUneLettre(Collection<String> l) {
    int res = 0;
    for(String e: l) {
      if(e.length() == 1) {
        res++;
      }
    }
    return res;
  }

  public static void main(String[] args) {

    Collection<String> list = new HashSet<>();

    list.add("aaa");
    Pomme p = new Pomme();
    list.add(p.toString());
    list.add("x");

    System.out.println(list.contains("abc"));
    System.out.println(list.contains("aaa"));

    for(String e: list) {
      System.out.println("maChaine = " + e);
    }
      System.out.println("nb de chaine avec une seulle lettre = " + nbChainesUneLettre(list));

  }

}
