
public class SingleFamilyHome extends Residential 
{
	//instance variable 
	private boolean garage;

    public SingleFamilyHome() 
    {
        super();
        this.garage = false;
    }//empty-argument constructor

    public SingleFamilyHome(String projectName, String completeAddress, double totalSquareFeet,
                            String occupancyGroup, String subgroup, int numBedrooms,
                            int numBathrooms, boolean laundryRoom, boolean garage)
    {
        super(projectName, completeAddress, totalSquareFeet, occupancyGroup, subgroup,
                numBedrooms, numBathrooms, laundryRoom);
        this.garage = garage;
    }//preferred argument constructor

    public void draw() 
    {
        System.out.println("Drawing code for SingleFamilyHome");
    }//end draw method
    
    public String displayData()
    {
        return super.displayData() + "Garage: " + (garage ? "Yes" : "No") + "\n";
    }//end displayData method
    
}//end SingleFamilyHome class
