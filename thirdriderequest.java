package rentride;

public class meerutrequest extends riderequest{
	public void meerutrequest() {
		System.out.println("List of Drivers with Details");
		System.out.println("Driver Carmodel  Rating Distancefromcustomer PrefferedDestinations");
		System.out.println("A      5 Seater  4      500m                 Gurugaon,Noida,Delhi");
		System.out.println("B      Hatchback 4.3    1km                  Gurugaon");
		System.out.println("C      5 Seater  4.8    200m                 Noida");
		System.out.println("D      Sedan     4.1    700m                 Noida");
		System.out.println("E      5 Seater  4.7    430m                 Delhi");
	}
	String[] drivers= {"A","B","C","D","E"};
	String[] cartypes= {"5 Seater","Hatchback","5 Seater","Sedan","5 Seater"};
	double[] rating= {4,4.3,4.8,4.1,4.7};
	int[] distancefromcustomer= {500,1000,200,700,430};
	String[][] destinations= {{"Gurugaon","Noida","Delhi"},{"Gurugaon","",""},{"Noida","",""},{"Noida","",""},{"Delhi","",""}};
	String requireddriver=null;
	int mindistance=100000;
	public String request(String car,String destination) {
		for(int i=0;i<5;i++) {
			if(cartypes[i].equals(car)&&rating[i]>=4&&distancefromcustomer[i]<mindistance) {
				for(int j=0;j<2;j++) {
				if(destinations[i][j].equals(destination)) {
					requireddriver=drivers[i];
					mindistance=distancefromcustomer[i];
					}
				
				}
				
			}
