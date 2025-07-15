//odd digit
import java.util.*;
class Main {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int c=0;
    while(n>0){
        int rem=n%10;
        if(n%2!=0){
            c+=1;
        }
        n/=10;
    }
    System.out.print(c>2?true:false);
    }
}
