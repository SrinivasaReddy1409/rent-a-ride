package rentride;
import java.util.Scanner;
public class riderequest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Pickup points: Mumbai Kolkata Meerut");
		System.out.println("Enter pickup point : ");
		String pickup=sc.nextLine();
		System.out.println("Ride Distance(km): ");
		float distance=sc.nextFloat();
		sc.nextLine();
		System.out.println("Car requested: ");
		String car=sc.nextLine();
		String driver;
		if(pickup.equals("Mumbai")) {
			mumbairequest m=new mumbairequest();
			driver=m.request(car);
			if(driver==null) {
				System.out.println("Please select other car.");
			}
			else {
			System.out.println(driver+" will get you to destination");
			System.out.println("Your charge will be Rs."+(distance*8));
			}
		}
		else if(pickup.equals("Kolkata")) {
			
			kolkatarequest k=new kolkatarequest();
			driver=k.request(car);
			if(driver==null) {
				System.out.println("Please select other car.");
			}
			else {
			System.out.println(driver+" will get you to destination");
			System.out.println("Your charge will be Rs."+(distance*8));
			}
		}
		else if(pickup.equals("Meerut")) {
			System.out.println("Preffered Destinations: Gurugaon Noida Delhi");
			System.out.println("Enter Destination: ");
			String destination=sc.nextLine();
			meerutrequest mr=new meerutrequest();
			driver=mr.request(car,destination);
			if(driver==null) {
				System.out.println("Please select other car.");
			}
			else {
			System.out.println(driver+" will get you to destination");
			System.out.println("Your charge will be Rs."+(distance*8));
			}
		}
		else {
			System.out.println("Try other pickup point");
		}
		
		

	}

}
