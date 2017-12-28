import java.util.*;
import java.lang.*;
import java.util.ArrayList;
public class samp{
    public static void main(String aa[]){
    int a;
    Scanner s=new Scanner(System.in);
    a=s.nextInt();
    if(a%2==0){
        System.out.println();
    }
  int  i=1;
    while(i<=a){
        int h=a%i;
        if(h==0){
           continue;
        }
     else{
            System.out.println(h);
            
     }
        i++;
    }
    }
}

