
public class Building 
{
    protected String projectName = "Gaines House";
    protected String completeAddress = "123 Main Street, Louisville, KY 40201";
    protected double totalSquareFeet = 2450;
    protected String occupancyGroup = "Business";
    protected String subgroup = "Group B";

    public Building() 
    {
        this.projectName = "Gaines House";
        this.completeAddress = "123 Main Street, Louisville, KY 40201";
        this.totalSquareFeet = 2450;
        this.occupancyGroup = "Business";
        this.subgroup = "Group B";
    }//empty argument
    
    public Building(String projectName, String completeAddress, double totalSquareFeet,
            String occupancyGroup, String subgroup) 
    {
    	this.projectName = projectName;
    	this.completeAddress = completeAddress;
    	this.totalSquareFeet = totalSquareFeet;
    	this.occupancyGroup = occupancyGroup;
    	this.subgroup = subgroup;
    }//preferred argument

    public void draw() 
    {
    	System.out.println("Drawing code for Building");
    }//end draw method

    public String displayData() 
    {
    	return "Project Name: " + projectName + "\n" +
        "Address: " + completeAddress + "\n" +
        "Square Feet: " + totalSquareFeet + "\n" +
        "Occupancy Group: " + occupancyGroup + "\n" +
        "Occupancy Subgroup: " + subgroup + "\n";
    }//end displayData method

    
    
    @Override
	public String toString() 
    {
		return displayData(); 
	}

	//getters and setters for instance variables 
    public String getProjectName() 
    {
	return projectName;
    }

    public void setProjectName(String projectName)
    {
	this.projectName = projectName;
    }

    public String getCompleteAddress()
    {
	return completeAddress;
    }

    public void setCompleteAddress(String completeAddress)
    {
	this.completeAddress = completeAddress;
    }

    public double getTotalSquareFeet()
    {
	return totalSquareFeet;
    }

    public void setTotalSquareFeet(double totalSquareFeet)
    {
	this.totalSquareFeet = totalSquareFeet;
    }

    public String getOccupancyGroup() 
    {
	return occupancyGroup;
    }

    public void setOccupancyGroup(String occupancyGroup) 
    {
	this.occupancyGroup = occupancyGroup;
    }

    public String getSubgroup() 
    {
	return subgroup;
    }

    public void setSubgroup(String subgroup)
    {
	this.subgroup = subgroup;
    }


}//end class