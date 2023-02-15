package ex1;

import java.util.function.Function;

public class NonAssociativeEx1 {

  public void ex1(){

    Function<String, Integer> f = (String s) -> s.chars().reduce(0, (a, b) -> 2 * a + b);
    System.out.println(f);

  }

}
