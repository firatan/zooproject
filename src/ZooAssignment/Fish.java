package ZooAssignment;

public class Fish extends Pet {

	
	
	public void Swim(String aName)
	{
		System.out.println(aName + " is swimming");		
	}
	
	@Override
	public void Run(String aName)
	{
		System.out.println(aName + " cannot run");		
	}	
	
}
