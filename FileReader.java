package miniProject;

import java.util.*;
import java.io.*;

public class FileReader {

	public Scanner x;
	public static int count;
	
	public static double MPG;
	public static double Cyl;
	public static double HP;
	
	public static double mpg_count = 0;
	public static double cyl_count = 0;
	public static double hp_count = 0;
	
	public static LinkedList<Double> mpg_ll = new LinkedList<Double>();
	public static LinkedList<Double> cyl_ll = new LinkedList<Double>();
	public static LinkedList<Double> hp_ll = new LinkedList<Double>();
	
public void printContents(){
	//PRINTS UNSORTED LL			
	System.out.println("Unsorted MPG LL: " + mpg_ll);
	System.out.println("Unsorted Cyl LL: " + cyl_ll);
	System.out.println("Unsorted HP LL: " + hp_ll);
	
	System.out.println(mpg_count);
	}

public void printSorted(){
	//PRINTS OUT SORTED ARRAY
	System.out.println("Unsorted MPG: " + mpg_ll);
	System.out.println("Unsorted CYL: " + cyl_ll);
	System.out.println("Unsorted HP: " + hp_ll);

}


public void sortContents(){//INT J;I;K
	
	//SORTS LL
	Collections.sort(mpg_ll);
	Collections.sort(cyl_ll);
	Collections.sort(hp_ll);
	
	//BUBBLE
	//TODO
	
	//MERGE
	//TODO
	
	//QUICK
	//TODO
	
	
}

public void bubbbleSort(){
	
	//TODO
	
}
	
	
	public void openFile(){
		
		try{
			x = new Scanner(new File("numbers.txt"));
			
		}catch(Exception e){
			System.out.println("Could not find File");
		}	
	}
	
	
	public void readFile(){
		
		while(x.hasNext()){						// Loop through each LINE and add variable dependent on spacing
			
			String a = x.next();				// Takes first sequence and adds as string(a)
			MPG = Double.parseDouble(a);		// Converts MPG String to double
			mpg_ll.add(MPG);					// Adds converted MPG to LL
			mpg_count++;						// Adds to a count for every MPG instance
			MPG = 0;							// Resets Db back to 0
			
			String b = x.next();
			Cyl = Double.parseDouble(b);
			cyl_ll.add(Cyl);
			cyl_count++;
			Cyl = 0;
			
			String c = x.next();;
			HP = Double.parseDouble(c);
			hp_ll.add(HP);
			hp_count++;
			HP = 0;
			
			count++;

		}	
	}
	
	public void closeFile(){
		x.close();
	}

}