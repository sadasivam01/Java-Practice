import java.util.*;
import java.util.Arrays;
import java.util.Scanner;
public class Main
{
	public static void main(String[] args){
	    Scanner sc= new Scanner(System.in);
		int n=2;
		medicine[] med=new medicine[n];
		for(int i=0;i<n;i++){
		    String medicineName=sc.nextLine();
		    String batch=sc.nextLine();
		    String disease=sc.nextLine();
		    int price=sc.nextInt(); sc.nextLine();
		    med[i]=new medicine(medicineName,batch, disease, price);
		}
		
		String diseaseName=sc.nextLine();
		int[] ans = getPriceByDisease(med,diseaseName); 
		if(ans!=null){
		for(int i=0;i<ans.length;i++){
		    System.out.println(ans[i]);
		}
		}
		else{
		    System.out.println("not found");
		}
		
	}
	public static int[] getPriceByDisease(medicine[] med,String diseaseName){
	    int[] res=new int[0];
	    for(medicine i:med){
	        if(i.getDisease().equalsIgnoreCase(diseaseName)){
	            res=Arrays.copyOf(res,res.length+1);
	            res[res.length-1]=i.getPrice();
	        }
	    }
	    Arrays.sort(res);
	    if(res.length>0){
	        return res;
	    }
	    else{
	        return null;
	    }
	}
}

//creating class medicine
class medicine{
    private String medicineName, batch, disease;
    private int price;
    public medicine(String medicineName,String batch, String disease, int price){
        this.medicineName=medicineName;
        this.batch=batch;
        this.disease=disease;
        this.price=price;
    }
    //getters
    public String getMedicineName(){
        return medicineName;
    }
    public String getBatch(){
        return batch;
    }
    public String getDisease(){
        return disease;
    }
    public int getPrice(){
        return price;
    }
}
