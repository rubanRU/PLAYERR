import java.util.*;
import java.lang.*;
import java.lang.String;
import java.util.ArrayList;
public class str {
    public static void main(String aa[]){
    int count=0;
    Scanner s=new Scanner(System.in);
    String j=s.nextLine();
    String h=s.nextLine();
    ArrayList<String>d=new ArrayList<String>();
    String n[]=j.split(" ");
    for(int i=0;i<n.length;i++){
        d.add(n[i]);
    }
    Collections.sort(d,Collections.reverseOrder());
    //System.out.println(d.get(0));
    for(int i=0;i<d.size();i++){
        String jj=d.get(i);
        //System.out.println(jj);
       // System.out.println(h);
        if(h.equals(jj)){
            System.out.print(i);
        }
    }

   
}
}
 



