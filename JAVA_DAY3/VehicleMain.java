import java.util.Scanner;

public class VehicleMain {
public static void main(String args[])
{
	Scanner sc= new Scanner(System.in);
	Vehicleans1 v= new Vehicleans1();
	Fourwheelerans1 fw= new Fourwheelerans1();
	Twowheelerans1 tw= new Twowheelerans1();
	System.out.println("1. Four Wheeler");
	System.out.println("2. Two Wheeler");
	System.out.println("Enter Vehicle Type:");
	int choice =sc.nextInt();
	
	if(choice==1)
	{
		Scanner sc1= new Scanner(System.in);
		System.out.println("Vehicle Make: ");
		String make1= sc1.next();
		v.setMake(make1);
		System.out.println("Vehicle Number: ");
		String vehicleno1=sc1.next();
		v.setVehicleno(vehicleno1);
		System.out.println("Fuel Type: ");
		System.out.println("1.Petrol");
		System.out.println("2.Diesel");
		System.out.println("Fuel Capacity: ");
		int fuelcapacity1 =sc1.nextInt();
		v.setFuelcapacity(fuelcapacity1);
		System.out.println("Engine CC: ");
		int cc1=sc.nextInt();
		v.setCc(cc1);
		System.out.println("Audio System: ");
		String audiosys1=sc.nextLine();
		fw.setAudioSystem(audiosys1);
	    System.out.println("Number of Doors:");
	    int noofdoors1=sc.nextInt();
	    fw.setNumberOfDoors(noofdoors1);
	    System.out.println("---Basic Information---");
	    
	    System.out.println("Vehicle Number "+v.getVehicleno());
	    System.out.println("Fuel Capacity: "+v.getFueltype());
	    System.out.println("Fuel Type: "+v.getFueltype());
	    System.out.println("CC: "+v.getCc());
	    System.out.println("---Detail Information---");
	    System.out.println("Audio System: "+fw.getAudioSystem());
	    System.out.println("Number of Doors: "+fw.getNumberOfDoors());
	}
	
	if(choice==1)
	{
		Scanner sc1= new Scanner(System.in);
		System.out.println("Vehicle Make: ");
		String make1= sc1.next();
		v.setMake(make1);
		System.out.println("Vehicle Number: ");
		String vehicleno1=sc1.next();
		v.setVehicleno(vehicleno1);
		System.out.println("Fuel Type: ");
		System.out.println("1.Petrol");
		System.out.println("2.Diesel");
		String ft=sc1.next();
        v.setFueltype(ft);
		System.out.println("Fuel Capacity: ");
		int fuelcapacity1 =sc1.nextInt();
		v.setFuelcapacity(fuelcapacity1);
		System.out.println("Engine CC: ");
		int cc1=sc.nextInt();
		v.setCc(cc1);
		System.out.println("Audio System: ");
		String audiosys1=sc.nextLine();
		fw.setAudioSystem(audiosys1);
	    System.out.println("Number of Doors:");
	    int noofdoors1=sc.nextInt();
	    fw.setNumberOfDoors(noofdoors1);
	    
	    System.out.println("******" + v.getMake()+ "*****");
	    System.out.println("---Basic Information---");
	    System.out.println("Vehicle Number "+v.getVehicleno());
	    System.out.println("Fuel Capacity: "+v.getFueltype());
	    System.out.println("Fuel Type: "+v.getFueltype());
	    System.out.println("CC: "+v.getCc());
	    System.out.println("---Detail Information---");
	    System.out.println("Audio System: "+fw.getAudioSystem());
	    System.out.println("Number of Doors: "+fw.getNumberOfDoors());
	}
	
	if(choice==2)
	{
		Scanner sc2= new Scanner(System.in);
		System.out.println("Vehicle Make: ");
		String make2= sc2.next();
		v.setMake(make2);
		System.out.println("Vehicle Number: ");
		String vehicleno2=sc2.next();
		v.setVehicleno(vehicleno2);
		System.out.println("Fuel Type: ");
		int fueltype2= sc2.nextInt();
		System.out.println("1.Petrol");
		System.out.println("2.Diesel");
		String ft2=sc2.next();
        v.setFueltype(ft2);
		System.out.println("Fuel Capacity: ");
		int fuelcapacity2 =sc2.nextInt();
		v.setFuelcapacity(fuelcapacity2);
		System.out.println("Engine CC: ");
		int cc2=sc.nextInt();
		v.setCc(cc2);
		System.out.println("Kick Start Available(yes/no):");
		String ks=sc.next();
		
		 System.out.println("******" + v.getMake()+ "*****");
	    System.out.println("---Basic Information---");
	    System.out.println("Vehicle Number "+v.getVehicleno());
	    System.out.println("Fuel Capacity: "+v.getFuelcapacity());
	    System.out.println("Fuel Type: "+v.getFueltype());
	    System.out.println("CC: "+v.getCc());
	    System.out.println("---Detail Information---");
	    System.out.println("Audio System: "+tw.getKickStartAvailable());

	}
}
}