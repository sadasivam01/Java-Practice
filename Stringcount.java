import java.util.Scanner;

public class Stringcount{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	String a = sc.nextLine();
	String b = a.toLowerCase();
	int vowels = 0, consonants = 0, words = 0, spaces = 0, splchar = 0, alphabets=0, digits=0; //considering space is not splchar
	for(int i=0;i<a.length();i++){
		if(b.charAt(i)=='a'||b.charAt(i)=='e'||b.charAt(i)=='i'||b.charAt(i)=='o'||b.charAt(i)=='u'){
			vowels++;
			alphabets++;
			}
		else if(b.charAt(i)>='a' && b.charAt(i)<='z'){
			consonants++;
			alphabets++;
			}
		else if(Character.isWhiteSpace(b.charAt(i))){ //can also use b.charAt(i)==' '-> but this will only calculate space and not \n and \t
			spaces++;
			words++;
			}
		else if(b.charAt(i)>='0' && b.charAt(i)<='9') digits++;
		else splchar++;
		}
	words++;// to consider the word after the last space
	System.out.println(vowels);
	System.out.println(consonants);
	System.out.println(words);
	System.out.println(spaces);
	System.out.println(splchar);
	System.out.println(alphabets);
	System.out.println(digits);
	
	}
}