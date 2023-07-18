public class Business extends Building
{
    private int numRentableUnits;

    public Business()
    {
        super();
        this.numRentableUnits = 0;
    }//empty argument constructor

    public Business(String projectName, String completeAddress, double totalSquareFeet,
                    String occupancyGroup, String subgroup, int numRentableUnits) 
    {
        super(projectName, completeAddress, totalSquareFeet, occupancyGroup, subgroup);
        this.numRentableUnits = numRentableUnits;
    }//preferred

    public void draw()
    {
        System.out.println("Drawing code for Business");
    }//end draw method
    
    public String displayData() 
    {
        return super.displayData() +
                "Number of Rentable Units: " + numRentableUnits + "\n";
    }

    //getter/setter
	public int getNumRentableUnits() 
	{
		return numRentableUnits;
	}

	public void setNumRentableUnits(int numRentableUnits)
	{
		this.numRentableUnits = numRentableUnits;
	}
    
    
    
}//end Business class