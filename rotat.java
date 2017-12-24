import java.util.*;
import java.lang.*;
import java.util.ArrayList;
public class rotat {
     public static void main(String aa[]){
     int n;
     Scanner s=new Scanner(System.in);
     n=s.nextInt();
     int k=s.nextInt();
     ArrayList<Integer>a=new ArrayList<Integer>();
     for(int i=0;i<n;i++){
        int c=s.nextInt();
        a.add(c);
     }
     Collections.rotate(a,k );
     for(int d:a){
         System.out.printf("%d ", d);
     }

    }

}
