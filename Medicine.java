import java.util.*;

public class IPA12{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	sc.nextLine();
	Medicine[] medicines = new Medicine[n];
	for(int i=0;i<n;i++){
		String MedicineName = sc.nextLine();
		String batch = sc.nextLine();
		String disease = sc.nextLine();
		int price = sc.nextInt();
		sc.nextLine();
		medicines[i] = new Medicine(MedicineName, batch, disease, price);
		}
	String searchdisease = sc.nextLine();
	int[] price = getPriceByDisease(medicines, searchdisease);
	if(price == null){
		System.out.println("No medicines Found");
	}
	else{
		for(int i=0;i<price.length;i++){
			System.out.println(price[i]);
		}
	}
	}


	public static int[] getPriceByDisease(Medicine[] medicines, String disease){
	int[] price = new int[0];
	for(Medicine m : medicines){
		if(m.getdisease().equalsIgnoreCase(disease)){
			price = Arrays.copyOf(price,price.length+1);
			price[price.length-1] = m.getprice();
			}
		}
	Arrays.sort(price);
	return price;
	}
	
}

class Medicine{
	private String MedicineName, batch, disease;
	private int price;
	public Medicine(String MedicineName, String batch, String disease, int price){
	this.MedicineName = MedicineName;
	this.batch = batch;
	this.disease = disease;
	this.price = price;
	}
	public String getMedicineName(){
	return MedicineName;
	}
	public void setMedicineName(String MedicineName){
	this.MedicineName = MedicineName;
	}
	public String getbatch(){
	return batch;
	}
	public void setbatch(String batch){
	this.batch = batch;
	}
	public String getdisease(){
	return disease;
	}
	public void setdisease(String disease){
	this.disease = disease;
	}
	public int getprice(){
	return price;
	}
	public void setprice(int price){
	this.price = price;
	}

}
