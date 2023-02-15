package ex1;

import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.stream.Stream;

public class Main {

  public static void main(String[] args) {

    //Priority Queue = A FIFO data structure that serves elements
    // with the highest priorities first before elements with lower priority
    Queue<String> queue = new PriorityQueue<>(Collections.reverseOrder());
    queue.offer("B");
    queue.offer("C");
    queue.offer("A");
    queue.offer("F");
    queue.offer("D");
    while (!queue.isEmpty()) {
      System.out.println(queue.poll());
    }
  }

  public int compare(int s1, int s2) {
    if (s1 < s2) {
      return 1;
    } else if (s1 > s2) {
      return -1;
    } else {
      return 0;
    }
  }


  private static void flatMap_explanation() {
    var list = List.of(2, 10, 15, 1, 9);

    System.out.println(" MAP RESULT :");
    list.stream()
        .map(i -> i + 10).forEach(System.out::println);

    System.out.println("FLAT MAP RESULT :");
    list.stream()
        .flatMap(i -> Stream.of(i + 10, i + 20)).forEach(System.out::println);
  }
}

