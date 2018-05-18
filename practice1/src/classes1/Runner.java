package classes1;

public class Runner {

	public static void main(String[] args) { 
		BusinessTrip[] businessTrips =
		{ 
			new BusinessTrip("Artemenko", 45, 93), 
			new BusinessTrip("Pirogov", 51, 35), 
			null, 
			new BusinessTrip("Kuchin", 463, 235), 
			new BusinessTrip() 
		}; 
		
		for (BusinessTrip businessTrip: businessTrips)
		{ 
			if (businessTrip != null)
			{ 
				businessTrip.show(); 
			} 
		} 
		businessTrips[businessTrips.length-1].setTransport(45); 
		for (BusinessTrip businessTrip: businessTrips)
		{ 
			System.out.println(businessTrip); 
		} 
		System.out.println("Durate:" + businessTrips[0].getDays() + businessTrips[1].getDays()); 
	} 

}
