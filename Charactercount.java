import java.util.Scanner;

public class Charactercount{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	String a = sc.nextLine();
	char b = sc.nextLine().charAt(0);
	int count =0;
	for(int i=0;i<a.length();i++)
		if(a.charAt(i)==b) count++;
	System.out.println(count!=0?count:"No characters found");
	}
}