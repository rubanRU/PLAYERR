import java.util.*;
import java.lang.*;
import java.util.ArrayList;
public class rotli{
    public static void main(String aa[]){
    int n;
   LinkedList<Integer>l=new LinkedList<Integer>();
   Scanner s=new Scanner(System.in);
   n=s.nextInt();
   int k=s.nextInt();
   for(int i=0;i<n;i++){
       int c=s.nextInt();
       l.add(c);
   }
   if(k>l.size()){
       System.out.print("No");
   }
 else{
       Collections.rotate(l, -k);
 }
   for(int j:l){
       System.out.print(j+" ");
   }
}
}

