import java.util.*;
import java.util.ArrayList;
class maxch{
public static void main(String aa[]){
Scanner s=new Scanner(System.in);
int j=0;
ArrayList<Character>z=new ArrayList<Character>();
LinkedHashSet<Character>vv=new LinkedHashSet<Character>();
ArrayList<Integer>f=new ArrayList<Integer>();
String x=s.nextLine();
char s1[]=x.toCharArray();
for(int i=0;i<s1.length;i++){
    z.add(s1[i]);
    vv.add(s1[i]);
}
ArrayList<Character>zz=new ArrayList<Character>(vv);
for(int i=0;i<zz.size();i++){
    int o=Collections.frequency(z, zz.get(i));
    f.add(o);
}
int xx=Collections.max(f);
for(int i=0;i<zz.size();i++){
    int za=Collections.frequency(z,zz.get(i));
    char t=zz.get(i);
    if(t==' '){
        continue;
    }
    if(xx==za){
        if(j==0){
        System.out.print(xx+" "+t);
        j++;
        }
 else{
            System.out.print(t);
 }
    }
}

}
}
