import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class Solution {
    public static void main(String args[]) throws Exception {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        journalist[] jl=new journalist[n];
        for(int i=0;i<n;i++){
            int id=sc.nextInt();
            sc.nextLine();
            String name=sc.nextLine();
            int ex=sc.nextInt();
            sc.nextLine();
            String reg=sc.nextLine();
            jl[i]=new journalist(id, name, ex, reg);
        }
        String findRegion=sc.nextLine();
        int findId=sc.nextInt();
        double res=findAverage(jl,findRegion);
        if(res>0){
            System.out.println("Average experience: "+res);
        }
        else{
            System.out.println("No Journalist found from the given region.");
        }
        journalist ans=searchJournalist(jl,findId);
        if(ans!=null){
            System.out.println("id-"+ans.getId());
            System.out.println("name-"+ans.getName());
            System.out.println("experience-"+ans.getEx());
            System.out.println("region-"+ans.getReg());
        }
        else{
            System.out.println("No Journalist found with the given id.");
        }
}
public static double findAverage(journalist[] jl,String reg){
    double avg=0.0;
    int c=0;
    int add=0;
    for(journalist i:jl){
        if(i.getReg().equalsIgnoreCase(reg)){
            add+=i.getEx();
            c+=1;
        }
    }
    avg=(double)add/c;
    return avg;
}
public static journalist searchJournalist(journalist[] jl,int id){
    for(journalist i:jl){
        if(i.getId()==id){
            return i;
        }
    }
    return null;
}
}
class journalist{
    private int id,ex;
    private String name;
    private String reg;
    public journalist(int id, String name, int ex, String reg){
        this.id=id;
        this.name=name;
        this.ex=ex;
        this.reg=reg;
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public int getEx(){
        return ex;
    }
    public String getReg(){
        return reg;
    }
    
}
