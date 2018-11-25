package ZooAssignment;

public class Bird extends Pet {
	

		
	public static void main(String[] args) {
		// TODO Auto-generated method stub

			
		
	}


	
	
	@Override
	public void Talk()
	{
		System.out.println("Chirp");
	}

	public void Fly(String aName)
	{
		System.out.println(aName + " is flying");		
	}
	
	
	public void Run(String aName)
	{
		System.out.println(aName + " cannot run");		
	}
	
}
