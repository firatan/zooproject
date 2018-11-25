package ZooAssignment;

public class Eagle extends WildAnimals {
	
	
	
	
	
	
	public static void main(String[] args) {
		
	}
	
	public void SetHabitat()
	{
		this.habitat="Mountain";
	}
	
	@Override
	public void Fly(String aName)
	{
		System.out.println(aName + " is flying");		
	}
	
	public void Run(String aName)
	{
		System.out.println(aName + " cannot run");		
	}
	
}
