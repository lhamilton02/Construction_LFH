
public class Application
{

	public static void main(String[] args) 
	{
    
		// Test Building class
        Building b1 = new Building();
        Building b2 = new Building("Project A", "123 Main Street", 2540, "Business", "Subgroup Y");
        
        System.out.println(b1.displayData());
        System.out.println(b2.displayData());

        // Test Business class
        Business biz1 = new Business();
        Business biz2 = new Business("Project A", "123 Main Avenue", 2540, "Business", "Subgroup B", 10);
        
        System.out.println(biz1.displayData());
        System.out.println(biz2.displayData());

        // Test Mall class
        Mall m1 = new Mall();
        Mall m2 = new Mall("Gaines House", "123 Main Corner", 2054, "Business", "Subgroup B", 10, 15, 1000, 500);
        
        System.out.println(m1.displayData());
        System.out.println(m2.displayData());

        // Test Residential class
        Residential r1 = new Residential();
        Residential r2 = new Residential("Residential", "123 Main Lane", 2450, "Group R", "Subgroup R", 3, 2, true);
        
        System.out.println(r1.displayData());
        System.out.println(r2.displayData());

        // Test Apartment class
        Apartment a1 = new Apartment();
        Apartment a2 = new Apartment("Apartment", "321 Main Avenue", 3000, "Group R", "Subgroup R", 2, 1, true, 30, 800, true);
        
        System.out.println(a1.displayData());
        System.out.println(a2.displayData());

        // Test SingleFamilyHome class
        SingleFamilyHome home1 = new SingleFamilyHome();
        SingleFamilyHome home2 = new SingleFamilyHome("Family Home", "321 Main Street", 3000, "Group R", "Subgroup R", 3, 2, true, true);
        
        System.out.println(home1.displayData());
        System.out.println(home2.displayData());
    }
}//end application class
