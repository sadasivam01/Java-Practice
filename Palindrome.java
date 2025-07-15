//palindrome
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        System.out.println(checkPalindrome(a));
    }
    public static int checkPalindrome(String a){
        int len=a.length();
        int j=len-1;
        for(int i=0;i<len/2;i++){
            if(a.charAt(i)!=a.charAt(j)){
                return 0;
            }
            j--;
        }
        return 1;
}
}
