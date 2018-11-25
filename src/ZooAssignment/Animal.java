package ZooAssignment;

public abstract class Animal {

	public String animal_name;
	public int numberofLegs=4;
	public int numberofWings=0;
	
	
	
	public void Talk()
	{
		System.out.println("Silence");		
	}
	
	
	public void Fly(String aName)
	{
		System.out.println(aName + " cannot fly");		
	}
	
	
	public void Run(String aName)
	{
		System.out.println(aName + " is running");		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
