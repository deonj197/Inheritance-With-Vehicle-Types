public class Vehicles {
	private long frontDoors;
	private long backDoors;
	private long trunkDoors;
	
	public static void main(String[] args) {
		Vehicles v1 = new Car(2,0,1);
		Vehicles v2 = new Truck(2,2,1);
		
		long v1Doors = v1.numDoors();
		long v2Doors = v2.numDoors();
		
		if (v1Doors == mostDoors(v1,v2)) {
			System.out.println("Vehicle 1 has the most doors: " 
			+ v1Doors + " doors.");
		}
		else {
			System.out.println("Vehicle 2 has the most doors: " 
			+ v2Doors + " doors.");
		}
	}
	
	public Vehicles(long front, long back, long trunk){
		frontDoors = front;
		backDoors = back;
		trunkDoors = trunk;
	}
	public long numDoors(){
		long allDoors = frontDoors + backDoors + trunkDoors;
		return allDoors;
	}
	
	public static long mostDoors(Vehicles v1, Vehicles v2) {
		long v1Doors = v1.numDoors();
		long v2Doors = v2.numDoors();
		if (v1Doors > v2Doors){
			return v1Doors;
		}
		else {
			return v2Doors;
		}
	}

}

class Car extends Vehicles {
	Car(long front, long back, long trunk){
		super(front,back,trunk);
	}
}

class Truck extends Vehicles {
	Truck(long front, long back, long trunk){
		super(front,back,trunk);
	}
}

