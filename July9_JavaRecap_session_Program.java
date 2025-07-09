import java.util.*;

public class July9{

	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	sc.nextLine();
	DepartmentalStore[] department = new DepartmentalStore[n];
	for(int i=0;i<n;i++){
		String storeId = sc.nextLine();
		String storeName = sc.nextLine();
		String location = sc.nextLine();
		int noOfWorkers = sc.nextInt();
		int rating = sc.nextInt();
		sc.nextLine();
		department[i] = new DepartmentalStore(storeId, storeName, location, noOfWorkers, rating);
	}
	
	String avgwork = sc.nextLine();
	double avgworkers = findAverage(department ,avgwork);
	if(avgworkers == 0) System.out.println("No Stores are available in this storeId");
	else System.out.printf("%.2f\n",avgworkers);

	String search = sc.nextLine();
	DepartmentalStore[] StoreNames = findstoredetails(department, search);
	if(StoreNames.length == 0) System.out.println("No stores at the location");
	else{
	for(DepartmentalStore d : StoreNames){
		System.out.println(d.getstoreName());
		}
	}
	}

	public static double findAverage(DepartmentalStore[] department, String avgwork){
	int count = 0;
	int sum = 0;
	for(DepartmentalStore d: department){
		if(d.getstoreId().startsWith(avgwork)){
			count++;
			sum += d.getnoOfWorkers();
			}
		}
	if(count==0) return 0;
	double avg = (double) sum / count;
	return avg;
	}

	public static DepartmentalStore[] findstoredetails(DepartmentalStore[] department, String search){
	DepartmentalStore[] Foundedstore = new DepartmentalStore[0];
	for(DepartmentalStore d : department){
		if(d.getlocation().equals(search)){
			Foundedstore = Arrays.copyOf(Foundedstore, Foundedstore.length+1);
			Foundedstore[Foundedstore.length-1] = d;
			}
		}
	for(int i=0;i<Foundedstore.length-1;i++){
		for(int j=i+1;j<Foundedstore.length;j++){
			if(Foundedstore[i].getrating()>Foundedstore[j].getrating()){
			DepartmentalStore temp = Foundedstore[i];
			Foundedstore[i] = Foundedstore[j];
			Foundedstore[j] = temp;
			}
		}
	}
	return Foundedstore;
	}

}

class DepartmentalStore{
	private String storeId, storeName, location;
	private int noOfWorkers, rating;
	DepartmentalStore(String storeId, String storeName, String location, int noOfWorkers, int rating){
		this.storeId = storeId;
		this.storeName = storeName;
		this.location = location;
		this.noOfWorkers = noOfWorkers;
		this.rating = rating;

	}
	public String getstoreId(){
		return storeId;
	}
	public void setstoreId(String storeId){
		this.storeId = storeId;
	}
	public String getstoreName(){
		return storeName;
	}
	public void setstoreName(String storeName){
		this.storeName = storeName;
	}
	public String getlocation(){
		return location;
	}
	public void setlocation(String location){
		this.location = location;
	}
	public int getnoOfWorkers(){
		return noOfWorkers;
	}
	public void setnoOfWorkers(int noOfWorkers){
		this.noOfWorkers = noOfWorkers;
	}
	public int getrating(){
		return rating;
	}
	public void setrating(int rating){
		this.rating = rating;
	}

}
