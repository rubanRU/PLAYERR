import java.util.*;
import java.lang.*;
import java.lang.String;
import java.util.ArrayList;

public class strimat {

    public static void main(String args[]) {
        String h;
        Scanner s = new Scanner(System.in);
        h = s.nextLine();
        String j = s.next();
        String v = h.replaceAll(j, "");
        String b[]=v.split(" ");
        for(String l:b){
            System.out.print(l);
        }
        
    }
}
