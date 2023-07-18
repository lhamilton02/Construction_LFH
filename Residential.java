
public class Residential extends Building
{
	//instance variables
    private int numBedrooms;
    private int numBathrooms;
    private boolean laundryRoom;

    public Residential() 
    {
        super();
        this.numBedrooms = 0;
        this.numBathrooms = 0;
        this.laundryRoom = false;
    }//empty argument

    public Residential(String projectName, String completeAddress, double totalSquareFeet,
                       String occupancyGroup, String subgroup, int numBedrooms,
                       int numBathrooms, boolean laundryRoom) 
    {
        super(projectName, completeAddress, totalSquareFeet, occupancyGroup, subgroup);
        this.numBedrooms = numBedrooms;
        this.numBathrooms = numBathrooms;
        this.laundryRoom = laundryRoom;
    }//preferred constructor
    
    public void draw()
    {
        System.out.println("Drawing code for Residential");
    }//end draw method

    public String displayData()
    {
        return super.displayData() +
                "Number of Bedrooms: " + numBedrooms + "\n" +
                "Number of Bathrooms: " + numBathrooms + "\n" +
                "Laundry Room: " + (laundryRoom ? "Yes" : "No") + "\n";
    } //end display data method

    
    //getters and setters
	public int getNumBedrooms() 
	{
		return numBedrooms;
	}

	public void setNumBedrooms(int numBedrooms) 
	{
		this.numBedrooms = numBedrooms;
	}

	public int getNumBathrooms() {
		return numBathrooms;
	}

	public void setNumBathrooms(int numBathrooms) {
		this.numBathrooms = numBathrooms;
	}

	public boolean isLaundryRoom() {
		return laundryRoom;
	}

	public void setLaundryRoom(boolean laundryRoom) {
		this.laundryRoom = laundryRoom;
	}

}//end Residential class