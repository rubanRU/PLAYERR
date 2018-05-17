import java.io.*;
import java.util.*;
class permu{
    
	public static void main (String[] args) {
        Scanner s=new Scanner(System.in);
        String d=s.next();
        char aa[]=d.toCharArray();
        for(int i=1;i<=aa.length;i++){
            for(int j=0;j<aa.length-1;j++){
                char g=aa[j];
                aa[j]=aa[j+1];
                aa[j+1]=g;
                for(int k=0;k<aa.length;k++){
                    System.out.print(aa[k]+" ");
                }
                System.out.println();
            }
        }
	}
}
