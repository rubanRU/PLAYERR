import java.util.*;
import java.util.ArrayList;
public class inde {
    public static void main(String aa[]){
      int n;

      Scanner s=new Scanner(System.in);
      ArrayList<Integer>a1=new ArrayList<Integer>();
      n=s.nextInt();
      int a[]=new int[n];
      int b[]=new int[n];
      for(int i=0;i<a.length;i++){
          a[i]=s.nextInt();
          b[i]=a[i];
      }
      Arrays.sort(a);
      for(int i=0;i<a.length;i++){
          for(int j=0;i<b.length;j++){
              if(a1.contains(a[i])){
                  System.out.print(j+2+" ");
                  break;
              }
 else{
              if(b[j]==a[i]){
                  System.out.print(j+1+" ");
                  a1.add(b[j]);
                  break;
                  }
              }
          }
      }

    }
    }
