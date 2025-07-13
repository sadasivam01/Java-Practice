import java.util.Scanner;
public class Palindromecheck{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	String a = sc.nextLine();
	//String Palindrome Check
	StringBuilder sb = new StringBuilder(a);
	sb.reverse();
	if(a.equals(sb.toString()))
	System.out.println("Palindrome");

	//Substring Palindrome check;
	int n = a.length();
	for(int i=0;i<n;i++){
		for(int j=i+3;j<n;j++){
			String b = a.substring(i,j);
			int l=0,r=b.length()-1,f=1;
			while(l<r){
				if(b[l]!=b[r]){
					f=0;
					break;
					}
				}
			if(f==1) System.out.println(b);
			}
		}
	}
}