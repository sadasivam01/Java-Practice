import java.util.*;
public class StringFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String arr[] = str.split(" ");
        Map <String, Integer> mp = new TreeMap<>();
        for(String a : arr){
            if(mp.containsKey(a)){
                mp.put(a, mp.get(a)+1);
            }
            else mp.put(a,1);
        }
        for(Map.Entry<String,Integer> entry : mp.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }
}
