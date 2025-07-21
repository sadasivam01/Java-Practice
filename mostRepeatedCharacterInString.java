import java.util.*;
public class Main{
    public static void main(String[] args){
        String s="donkeyyyyy";
        Map<Character, Integer> res=new TreeMap<>();
        for(char i:s.toCharArray()){
            if(res.containsKey(i)){
                res.put(i,res.get(i)+1);
            }
            else{
                res.put(i,1);
            }
        }
        int max=0;
        char l=' ';
        for(Map.Entry<Character,Integer> i:res.entrySet()){
            if(max<i.getValue()){
                max=i.getValue();
                l=i.getKey();
            }
        }
        System.out.println("the character is "+ l + " the frequency is "+max);
        
}
}
