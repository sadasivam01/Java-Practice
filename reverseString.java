//reverse String
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        StringBuilder res=new StringBuilder();  //string builder is used, since we cant directly change the immutable one.ly access th
        for(int i=a.length()-1;i>=0;i--){
            res.append(a.charAt(i));
        }
        System.out.println(res.toString());
}
}
