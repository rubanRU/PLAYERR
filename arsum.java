import java.util.*;
import java.lang.*;
import java.util.ArrayList;
public class arsum{
    public static void main(String aa[]){
    int n;
    Scanner s=new Scanner(System.in);
    n=s.nextInt();
    int x=s.nextInt();
    int b[]=new int[n];
    for(int i=0;i<n;i++){
        b[i]=s.nextInt();
    }
    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            if(b[i]+b[j]==x){
                System.out.printf("%d %d", b[i],b[j]);
                System.out.println();

            }
        }
    }
}
}

