package ZooAssignment;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Objects;
import java.util.Scanner;

public class AppInterface {

	public static void main(String[] args) throws FileNotFoundException, NoSuchMethodException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		
		System.out.println("Welcome to Weird Zoo");
		
		// Load animals from text
		
		Animal[] animals = new Animal[100];
		String animalType;
		String animalName;
		 int feedAmount=0;
		
		File txt =new File("list.txt");
		
	    System.out.println(txt.exists());
	
	    	Scanner scanner = new Scanner(txt);
			int Counter = 0;
		    int splitPoint;
		    String line;
		    int commandRun = 1;
		    while (scanner.hasNextLine()) {
		        //read the line 
		       line = scanner.nextLine();
		       //split line using space character
		      splitPoint = line.indexOf(" ", 0);
		      animalType= line.substring(splitPoint+1);
		      animalName=line.substring(0, splitPoint);
		       
		      switch (animalType) {
	            case "Snake":
	            	animals[Counter] = new Snake();
	            	animals[Counter].numberofLegs = getLegs("Snake");
	                break;
	            case "Bird":
	            	animals[Counter] = new Bird();
	            	animals[Counter].numberofWings = getWings();
	            	animals[Counter].numberofLegs = getLegs("Bird");
	                break;
	            case "Cat":
	            	animals[Counter] = new Cat();
	                break;
	            case "Dog":
	            	animals[Counter] = new Dog();
	                break;
	            case "Eagle":
	            	animals[Counter] = new Eagle();
	            	animals[Counter].numberofLegs = getLegs("Eagle");
	            	break;
	            case "Fish":
	            	animals[Counter] = new Fish();
	            	animals[Counter].numberofLegs = getLegs("Fish");
	            	break;
	            default:
	            	break;
	        }
		      animals[Counter].animal_name = animalName;
		      
		      
		    //  animals[Counter]= createAnimal(line.substring(splitPoint+1),line.substring(0, splitPoint));
		        Counter++;
		    }
		    
		scanner.close();
		
		System.out.println("Animals are ready");
	
		
	    // Animals loaded
		
		while (commandRun == 1) {
		
		//Get command
		 Scanner scan = new Scanner(System.in);
	     System.out.println("Type what do you want.");
	     String animalCommand = scan.next();
	     if (Objects.equals("Exit", animalCommand))
	     {
	    	 commandRun =0;
	    	 System.out.println("Goodbye.");
	     	 System.exit(0);
	      }
	     

	     String animalNameInput = scan.next();
	     if (animalCommand.equalsIgnoreCase("Feed"))
	     {
	    	  feedAmount = scan.nextInt();
	     }
	     
	     System.out.println(feedAmount);
		
	     
	     int index=-1;
			
		  for (int i = 0; (i < animals.length) && (index == -1); i++) {
		        if (animals[i].animal_name.equals(animalNameInput)) {
		            index = i;
		        }
		  }
		  
 // Verilen komut çalýþtýrýlacak  animalCommand den gelen
		  
		  
		  
		}
		
	}

	private static void Exit() {
		// TODO Auto-generated method stub
		
	}

    public static int getWings() {
        return 2;
   }

    public static int getLegs(String animaltype) {
    	
    	int legs;
    	switch (animaltype) {
          case "Bird":
         	legs=2;
             break;
          case "Eagle":
         	legs=2;
             break;
         default:
        	 legs=0;
         	break;
      
   }
    	  return legs;
    }
    
	
/*
	
	static Animal createAnimal(String animalType, String animalName) {
	        Animal animal;
	        switch (animalType) {
	            case "Snake":
	                animal = new Snake();
	                break;
	            case "Bird":
	                animal = new Bird();
	                break;
	            case "Cat":
	                animal = new Cat();
	                break;
	            case "Dog":
	                animal = new Dog();
	                break;
	            case "Eagle":
	                animal = new Eagle();
	                break;
	            case "Fish":
	                animal = new Fish();
	                break;
	            default:
	                animal = null;
	        }
	        animal.animal_name = animalName
	        return animal;
	    }
*/	
}
