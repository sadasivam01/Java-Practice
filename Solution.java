import java.util.Scanner;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Grain[] grains = new Grain[n];
        for(int i=0;i<n;i++){
            int grainId = sc.nextInt();
            sc.nextLine();
            String grainName = sc.nextLine();
            String state = sc.nextLine();
            int qtyInQuintal = sc.nextInt();
            sc.nextLine();
            grains[i] = new Grain(grainId, grainName, state, qtyInQuintal);
        }
        String searchName = sc.nextLine();
        int count = countGrainByGivenName(grains, searchName);
        if(count!=0) System.out.println(count);
        else System.out.println("No Grain Found");

        Grain Maharashtra = getMinGrainFromMaharashtra(grains);
        if(Maharashtra == null) System.out.println("No grains from Maharashtra");
        else{
            System.out.print(Maharashtra.getGrainId() + "\n" + 
            Maharashtra.getGrainName() + "\n" + 
            Maharashtra.getState() + "\n" + 
            Maharashtra.getQtyInQuintal());
        }

    }

    public static int countGrainByGivenName(Grain[] grains, String Crop){
        int count = 0;
        for(Grain g : grains){
            if(g.getGrainName().equals(Crop)) count++;
        }
        return count;
    }
    
    public static Grain getMinGrainFromMaharashtra(Grain[] grains){
        int mini = 100000;
        Grain min = null;
        for(Grain g : grains){
            if(g.getState().toLowerCase().equals("maharashtra") && g.getQtyInQuintal()< mini){
                mini = g.getQtyInQuintal();
                min = g;
            } 
        }
        return min;
    }
    
}

class Grain{
    int grainId, qtyInQuintal;
    String grainName, state;
    public Grain(int grainId, String grainName, String state, int qtyInQuintal){
        this.grainId = grainId;
        this.grainName = grainName;
        this.state = state;
        this.qtyInQuintal = qtyInQuintal;
    }
    public int getGrainId(){
        return grainId;
    }
    public void setGrainId(int grainId){
        this.grainId = grainId;
    }
    public String getGrainName(){
        return grainName;
    }
    public void setGrainName(String grainName){
        this.grainName = grainName;
    }
    public String getState(){
        return state;
    }
    public void setState(String state){
        this.state = state;
    }
    public int getQtyInQuintal(){
        return qtyInQuintal;
    }
    public void setQtyInQuintal(int qtyInQuintal){
        this.qtyInQuintal = qtyInQuintal;
    }
    
}