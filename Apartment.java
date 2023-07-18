
public class Apartment extends Residential 
{
	//instance variables
    private int numRentableUnits;
    private double avgUnitSize;
    private boolean parkingAvailable;

    public Apartment()
    {
        super();
        this.numRentableUnits = 0;
        this.avgUnitSize = 0.0;
        this.parkingAvailable = false;
    }//empty-argument constructor

    public Apartment(String projectName, String completeAddress, double totalSquareFeet,
                     String occupancyGroup, String subgroup, int numBedrooms,
                     int numBathrooms, boolean laundryRoom, int numRentableUnits,
                     double avgUnitSize, boolean parkingAvailable)
    {
        super(projectName, completeAddress, totalSquareFeet, occupancyGroup, subgroup,
                numBedrooms, numBathrooms, laundryRoom);
        this.numRentableUnits = numRentableUnits;
        this.avgUnitSize = avgUnitSize;
        this.parkingAvailable = parkingAvailable;
    }//prefferred constructor
    
    public void draw() 
    {
        System.out.println("Drawing code for Apartment");
    }//end draw method

    public String displayData() 
    {
        return super.displayData() +
                "Number of Rentable Units: " + numRentableUnits + "\n" +
                "Average Unit Size: " + avgUnitSize + "\n" +
                "Parking Available: " + (parkingAvailable ? "Yes" : "No") + "\n";
    }//end display data method
    
    
    //getters and setters
	public int getNumRentableUnits() {
		return numRentableUnits;
	}

	public void setNumRentableUnits(int numRentableUnits) {
		this.numRentableUnits = numRentableUnits;
	}

	public double getAvgUnitSize() {
		return avgUnitSize;
	}

	public void setAvgUnitSize(double avgUnitSize) {
		this.avgUnitSize = avgUnitSize;
	}

	public boolean isParkingAvailable() {
		return parkingAvailable;
	}

	public void setParkingAvailable(boolean parkingAvailable) {
		this.parkingAvailable = parkingAvailable;
	}
    
}//end Apartment class