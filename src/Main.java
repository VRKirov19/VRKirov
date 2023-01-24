import java.util.*;

public class Main {
    public static void main(String[] args) {
        Deque<String> stack = new ArrayDeque<>();
      Scanner scanner = new Scanner(System.in);
      String input = scanner.nextLine();
      while(!input.equals("print")) {
          ArrayDeque<Object> queue;
          if(input.equals("cancel")){
              if(queue.isEmpty()) {
                  System.out.println("Printer is on stand by");
              }
              else{
                  System.out.println("Canceled" + queue.poll());
              }
              else{
                  queue.offer(input);
              }
              input = scanner.nextLine();
          }
          while(!queue.isEmpty()){
              System.out.println(queue.poll());
          }
      }
    }
}