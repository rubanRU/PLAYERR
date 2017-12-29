import java.util.*;
import java.lang.*;
import java.util.ArrayList;
public class strrot{
    public static void main(String aa[]){
    Scanner s=new Scanner(System.in);
    String c=s.next();
    int l=s.nextInt();
    int n=c.length();
    ArrayList<Character>z=new ArrayList<Character>();
    for(int i=0;i<n;i++){
        z.add(c.charAt(i));
    }
    Collections.rotate(z, l);
    for(char cc:z){
        System.out.print(cc);
    }
}
}
