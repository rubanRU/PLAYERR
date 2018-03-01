import java.util.*;
public class priq{
  public static void main(String aa[]){
      int h;
      PriorityQueue<Integer>a=new PriorityQueue<Integer>();
      PriorityQueue<Integer>b=new PriorityQueue<Integer>();
      Scanner n=new Scanner(System.in);
      int b1=n.nextInt();
      h=n.nextInt();
      for(int i=0;i<b1;i++){
          int u=n.nextInt();
          a.add(u);
      }
       for(int i=0;i<h;i++){
          int pp=n.nextInt();
          b.add(pp);
      }
      for(int i=0;i<h;i++){

          a.add(b.peek());
          b.poll();
      }
      System.out.println(Collections.max(a));


    }
}
