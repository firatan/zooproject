package ZooAssignment;

public class Dog extends Pet {
	
	public void Walk(String aName)
	{
		System.out.println(aName + " walked");		
	}
	
	
	@Override
	public void Talk()
	{
		System.out.println("Bark");
	}

}
