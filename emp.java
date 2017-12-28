import java.util.*;
import java.lang.*;
import java.util.ArrayList;
public class emp{
    public static void main(String aa[]){
    int n;
   LinkedList<Integer>l=new LinkedList<Integer>();
   Scanner s=new Scanner(System.in);
   n=s.nextInt();
   
   for(int i=0;i<n;i++){
       int c=s.nextInt();
       l.add(c);
   }
  l.removeAll(l);
  if(l.isEmpty()){
      System.out.println("Empty");
  }
}
}
