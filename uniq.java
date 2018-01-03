import java.util.*;
import java.lang.*;
import java.lang.String;
import java.util.ArrayList;
public class uniq {
    public static void main(String aa[]){
    int count=0;
    Scanner s=new Scanner(System.in);
    ArrayList<Character>n=new ArrayList<Character>();
    String j=s.next();
    for(int i=0;i<j.length();i++){
        n.add(j.charAt(i));
    }
    for(int i=0;i<n.size();i++){
        int o=Collections.frequency(n, n.get(i));
        if(o==1){
            count++;
        }
    }
 System.out.println(count);
   
}
}
 

