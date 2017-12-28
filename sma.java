import java.util.*;
import java.lang.*;
import java.util.ArrayList;
public class sma{
    public static void main(String aa[]){
    int n;
    int c=0;
    Scanner s=new Scanner(System.in);
    n=s.nextInt();
    int x=s.nextInt();
    int a[]=new int[n];
    int b[]=new int[n];
    for(int i=0;i<n;i++){
        a[i]=s.nextInt();
    }
    for(int i=0;i<n;i++){
        if(a[i]<x){
            System.out.println(a[i]);
        }
    }
   
    
}
}
