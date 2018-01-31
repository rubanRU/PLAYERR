import java.util.*;
public class comminr {
  public static void main(String aa[]){
     Scanner s=new Scanner(System.in);
     ArrayList<Integer>a=new ArrayList<Integer>();
      ArrayList<Integer>b=new ArrayList<Integer>();
     int n=s.nextInt();
    for(int i=0;i<n;i++){
        int h=s.nextInt();
        a.add(h);
    }
    int f=s.nextInt();
    int l=s.nextInt();
    int ff=a.indexOf(f);
    int ll=a.indexOf(l);
    for(int i=ff;i<=ll;i++){
        int u=a.get(i);
        b.add(u);
    }
    System.out.print(Collections.min(b));

  }
}
