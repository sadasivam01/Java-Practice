import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String args[]) throws Exception {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        photographer[] pg=new photographer[n];
        for(int i=0;i<n;i++){
            int id=sc.nextInt();
            sc.nextLine();
            String name=sc.nextLine();
            String specs=sc.nextLine();
            double rate=sc.nextDouble();
            pg[i]=new photographer(id, name, specs, rate);
            
        }
        sc.nextLine();
        String findSpec=sc.nextLine();
        int ans=countPhotographer(pg,findSpec);
        if(ans>0){
            System.out.println("Number of photographers in "+findSpec+": "+ans);
        }
        else{
            System.out.println("No photographers found for the given specialization.");
        }
        photographer res=findSecond(pg);
        if(res!=null){
            System.out.println("id-"+res.getId());
            System.out.println("name-"+res.getName());
            System.out.println("specialization-"+res.getSpecs());
            System.out.println("rating-"+res.getRate());
        }
        else{
            System.out.println("Second highest rated photographer not available");
        }
    }
    public static int countPhotographer(photographer[] pg, String specs){
        int c=0;
        for(photographer i:pg){
            if(i.getSpecs().equalsIgnoreCase(specs)){
                c+=1;
            }
        }
        return c;
    }
    public static photographer findSecond(photographer pg[]){
        TreeSet<Double>  rs=new TreeSet<>(Collections.reverseOrder());
        for(photographer i:pg){
            rs.add(i.getRate());
        }
        if(rs.size()<2){
            return null;
        }
        double sh=rs.stream().skip(1).findFirst().orElse(Double.MIN_VALUE);
        for(photographer i:pg){
            if(i.getRate()==sh){
                return i;
            }
        }
        return null;
    }
}
class photographer{
    private int id;
    private String name;
    private String specs;
    private double rate;
    public photographer(int id, String name, String specs, double rate){
        this.id=id;
        this.name=name;
        this.specs=specs;
        this.rate=rate;
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public String getSpecs(){
        return specs;
    }
    public double getRate(){
        return rate;
    }
}
