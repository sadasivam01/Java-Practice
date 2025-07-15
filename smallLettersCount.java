//count of small letters
import java.util.*;
class Main {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String a=sc.next();
    int c=0;
    for(int i=0;i<a.length();i++){
        if(a.charAt(i)>='a' &&a.charAt(i)<='z'){
            c+=1;
        }
    }
    System.out.print(c>0?c:"no found");
    }
}
