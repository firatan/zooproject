package ZooAssignment;

public class Cat extends Pet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public void Clean(String cName)
	{
		System.out.println(cName+ " is clean now");
	}

	@Override
	public void Talk()
	{
		System.out.println("Meow");
	}

	
}
