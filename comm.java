import java.util.*;
import java.lang.*;
import java.util.ArrayList;
public class comm{
    public static void main(String aa[]){
    int n;
    int c=0;
    Scanner s=new Scanner(System.in);
    n=s.nextInt();
    int a[]=new int[n];
    int b[]=new int[n];
    for(int i=0;i<n;i++){
        a[i]=s.nextInt();
    }
    for(int i=0;i<n;i++){
        b[i]=s.nextInt();
    }
    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            if(a[i]==b[j]){
                System.out.printf("%d %d",a[i],b[j]);
                c=1;
            }
        }
    }
    if(c==0){
        System.out.println("-1");
    }
}
}

