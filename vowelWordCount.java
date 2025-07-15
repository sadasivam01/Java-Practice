//vowel word count
import java.util.*;
class Main {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String a=sc.nextLine();
    int c=0;
    String[] word=a.split(" ");
    for(int i=0;i<word.length;i++){
        char f=word[i].charAt(0);
        if(f=='a'||f=='e'||f=='i'||f=='o'||f=='u'){
            c+=1;
        }
    }
    System.out.print(c>0?c:"not found");
    }
}
