import java.util.*;
import java.lang.*;
import java.lang.String;
import java.util.ArrayList;
public class diffnum {
    public static void main(String aa[]){
       
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int a[]=new int[n];
    int b[]=new int[n];
  for(int i=0;i<n;i++){
      a[i]=s.nextInt();
  }
     for(int i=0;i<n;i++){
      b[i]=s.nextInt();
  }
    for(int i=0;i<a.length;i++){
        if(a[i]%2==0){
            System.out.println(a[i]);
        }
    }
     for(int i=0;i<b.length;i++){
        if(b[i]%2!=0){
            System.out.println(b[i]);
        }
    }
    }
    
   
   
}
 



