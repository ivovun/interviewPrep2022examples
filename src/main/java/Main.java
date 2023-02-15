import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.Arrays;
import java.util.function.Function;
import java.util.function.IntBinaryOperator;
import java.util.stream.IntStream;

public class Main {

  public static void main(String[] args) {
//    Function<String, Integer> f = (String s) -> s.chars().reduce(0, (a, b) -> 2 * a + b);
//    System.out.println(f.apply("123"));
//
//    f = (String s) -> s.chars().parallel().reduce(0, (a, b) -> 2 * a + b);
//    System.out.println(f.apply("123"));


    IntBinaryOperator intBinaryOperator = (a, b) -> 2 + a + b;

    System.out.println(IntStream.of(1, 2, 3).reduce(0, intBinaryOperator));

    System.out.println(IntStream.of(1, 2, 3).parallel().reduce(0, intBinaryOperator));


  }
}