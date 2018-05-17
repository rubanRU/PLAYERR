import java.io.*;
import java.util.*;
class sec{
	public static void main (String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int k=s.nextInt();
        LinkedHashSet<Integer> a=new LinkedHashSet<Integer>();
        for(int i=0;i<n;i++){
            int c=s.nextInt();
            a.add(c);
        }
        ArrayList<Integer>aa=new ArrayList<Integer>(a);
        Collections.sort(aa);
        System.out.println(aa.get(k-1));
	}
}
