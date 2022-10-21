package busReservation;
import java.util.*;
import java.util.ArrayList;
public class busdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Bus> buses = new ArrayList<Bus>();
		ArrayList<Booking> bookings = new ArrayList<Booking>();
		
		
		buses.add(new Bus(1,true,2));
		buses.add(new Bus(2,false,50));
		buses.add(new Bus(3,true,48));
		
		
		int user = 1;
	    Scanner sc = new Scanner(System.in); {
	    	
			for(Bus b:buses) {
				b.displayBusinfo();
			}
			while(user == 1) {
			System.out.println("Enter 1 to book and 2 to exit");
			user = sc.nextInt();
			if(user == 1)
			{
				Booking booking = new Booking();
				if(booking.isAvailable(bookings,buses)) {
					bookings.add(booking);
					System.out.println("Your booking is confirmed");
				}
					else
						System.out.println("Sorry try another date and bus");
					}
				}
			}
	}
}
	
