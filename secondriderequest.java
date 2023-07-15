package rentride;

public class kolkatarequest extends riderequest{
	public void kolkatarequest() {
		System.out.println("List of Drivers with Details");
		System.out.println("Driver Carmodel  Rating Distancefromcustomer");
		System.out.println("A      Hatchback 3      500m");
		System.out.println("B      Hatchback 4.3    1km");
		System.out.println("C      5 Seater  4.8    200m");
		System.out.println("D      Sedan     4.1    700m");
		System.out.println("E      Hatchback 4.7    430m");
	}
	String[] drivers= {"A","B","C","D","E"};
	String[] cartypes= {"Hatchback","Hatchback","5 Seater","Sedan","Hatchback"};
	double[] rating= {3,4.3,4.8,4.1,4.7};
	int[] distancefromcustomer= {500,1000,200,700,430};
	String requireddriver=null;
	int mindistance=100000;
	public String request(String car) {
		for(int i=0;i<5;i++) {
			if(cartypes[i].equals(car)&&rating[i]>=4&&distancefromcustomer[i]<mindistance) {
				requireddriver=drivers[i];
				mindistance=distancefromcustomer[i];
			}
			
		}
		return requireddriver;
	}
}
