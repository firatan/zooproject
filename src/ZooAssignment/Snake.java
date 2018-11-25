package ZooAssignment;

public class Snake extends WildAnimals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public void Crawl(String aName)
	{
		System.out.println(aName + " is crawling");		
	}

	@Override
	public void Run(String aName)
	{
		System.out.println(aName + " cannot run");		
	}
	
	
}
