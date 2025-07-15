//reverse word
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        String[] word=a.trim().split("\\s+");
        StringBuilder res=new StringBuilder();
        for(int i=word.length-1;i>=0;i--){    // there is difference b/w length[used in arrays] and length()[used in string] in java
            res.append(word[i]);
            if(i!=0){
                res.append(" ");
            }
        }
        System.out.println(res.toString());
}
}
