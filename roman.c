import java.util.*;
import java.lang.*;
public class roman{
      public static void main(String aa[]){
          int sum=0;
          String s;
          int b=0;
          int pp=0;
          int count=0;
          int c[]=new int[100];
          Scanner ss=new Scanner(System.in);
          s=ss.next();
          char a[]=s.toCharArray();
          int l=s.length();
          
          for(int i=0;i<l;i++){
              switch(a[i]){
                  case'I':
                  b=1;
                  break;
                  case'V':
                  b=5;
                  break;
                  case'X':
                  b=10;
                  break;
              }
              c[pp]=b;
              pp++;
              count++;
          }
          pp=0;
         
          int f=c[pp];
          int ll=c[count-1];
         
          if(f>ll||f==ll){
             for(int i=0;i<count;i++){
                 sum=sum+c[i];
             }
              System.out.println(sum);
          }
        else{
             for(int i=count-1;i>=0;i--){
                 sum=(-sum)-c[i];
                 
        }
           System.out.println(sum);
}
    }
}
