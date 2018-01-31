import java.util.*;
public class frea{
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
    int x=Collections.frequency(a, f);
    if(x>1){
        System.out.println("yes"+x);
    }
  }
}
