import java.io.*;
import java.util.*;
class palinst {
    
	public static void main (String[] args) {
        Scanner s=new Scanner(System.in);
        String a=s.nextLine();
        int top=-1;
        int front=0;
        int f=0;
        char b[]=new char[a.length()];
        for(int i=0;i<a.length();i++){
            top++;
            b[top]=a.charAt(i);
        }
        for(int i=0;i<b.length;i++){
            if(b[top]==b[front]){
                top--;
                front++;
            }
            else{
               f=1;
               System.out.println("not palindrome");
               break;
            }
        }
        if(f==0){
            System.out.println("palindrome");
        }
        
        
	}
}
