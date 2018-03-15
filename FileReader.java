package miniProject;

import java.util.*;
import java.io.*;

public class RawReader {
	
	
	public Scanner x;
	public static int count;
	
	public static double MPG;
	public static double CYL;
	public static double DIS;
	public static double HP;
	public static double WEI;
	public static double ACC;
	public static double YEAR;
	public static double ORI;
	
	public static String MODr;
	
	public static double MPG_count = 0;
	public static double CYL_count = 0;
	public static double DIS_count = 0;
	public static double HP_count = 0;
	public static double WEI_count = 0;
	public static double ACC_count = 0;
	public static double YEAR_count = 0;
	public static double ORI_count = 0;
	
	public static LinkedList<Double> MPG_ll = new LinkedList<Double>();
	public static LinkedList<Double> CYL_ll = new LinkedList<Double>();
	public static LinkedList<Double> DIS_ll = new LinkedList<Double>();
	public static LinkedList<Double> HP_ll = new LinkedList<Double>();
	public static LinkedList<Double> WEI_ll = new LinkedList<Double>();
	public static LinkedList<Double> ACC_ll = new LinkedList<Double>();
	public static LinkedList<Double> YEAR_ll = new LinkedList<Double>();
	public static LinkedList<Double> ORI_ll = new LinkedList<Double>();
	
	public static LinkedList<String> modr_ll = new LinkedList<String>();
	
	public static void main(String[] args) {
		
		RawReader s = new RawReader();
		
		s.openFile();
		s.readFile();
		s.closeFile();
		
		s.printTest();
	
	}
	
	void printTest(){
		
		System.out.println("MPG: " + MPG_ll);
		System.out.println("CYL: " + CYL_ll);
		System.out.println("DIS: " + DIS_ll);
		System.out.println("HP: " + HP_ll);
		System.out.println("WEI: " + WEI_ll);
		System.out.println("ACC: " + ACC_ll);
		System.out.println("YEAR: " + YEAR_ll);
		System.out.println("ORI: " + ORI_ll);
		System.out.println("Total Count: " + count);
		
		System.out.println("MPG: " + MPG_count);
		System.out.println("CYL: " + CYL_count);
		System.out.println("DIS: " + DIS_count);
		System.out.println("HP: " + HP_count);
		System.out.println("WEI: " + WEI_count);
		System.out.println("ACC: " + ACC_count);
		System.out.println("YEAR: " + YEAR_count);
		System.out.println("ORI: " + ORI_count);
				
		
	}
	
	public void findAvg(){
		
		
		
	}
	
	public void removeAll(String x, double b){
		System.out.println("mpg count before: " + MPG_count);
		if( x.equalsIgnoreCase("mpg") || x.equalsIgnoreCase("1") ){
			for(int i = 0; i < MPG_count; i++){
				MPG_ll.remove(b);
				MPG_count--;
			}
		} else if(x.equalsIgnoreCase("cyl") || x.equalsIgnoreCase("cylinders") ){
			for(int i = 0; i < CYL_count; i++){
				CYL_ll.remove(b);
				CYL_count--;
			}
		}else if(x.equalsIgnoreCase("dis") || x.equalsIgnoreCase("displacement") ){
			for(int i = 0; i <DIS_count; i++){
				DIS_ll.remove(b);
				DIS_count--;
			}
		}else if(x.equalsIgnoreCase("hp") || x.equalsIgnoreCase("horsepower")){
			for(int i = 0; i < HP_count; i++){
				HP_ll.remove(b);
				HP_count--;
			}
		}else if(x.equalsIgnoreCase("wei") || x.equalsIgnoreCase("weight")){
			for(int i = 0; i< WEI_count; i++){
				WEI_ll.remove(b);
				WEI_count--;
			}
		}else if(x.equalsIgnoreCase("acc") || x.equalsIgnoreCase("acceleration")){
			for(int i =0; i < ACC_count; i++){
				ACC_ll.remove(b);
				ACC_count--;
			}
		}else if(x.equalsIgnoreCase("year") || x.equalsIgnoreCase("yea")){
			for(int i = 0; i < YEAR_count; i++){
				YEAR_ll.remove(b);
				YEAR_count--;
			}
		}else if(x.equalsIgnoreCase("ori") || x.equalsIgnoreCase("origin") || x == "8" ){
			for(double i = 0; i < ORI_count; i++){
				ORI_ll.remove(b);
				ORI_count--;
			}
		}
	}
	
	public void addToList(String x, Double b){
		// mpg cyl dis hp wei acc year orig
		if( x.equalsIgnoreCase("mpg") || x.equalsIgnoreCase("1") ){
				MPG_ll.add(b);
				MPG_count++;
		} else if(x.equalsIgnoreCase("cyl") || x.equalsIgnoreCase("cylinders") ){
				CYL_ll.add(b);
				CYL_count++;
		} else if(x.equalsIgnoreCase("dis") || x.equalsIgnoreCase("displacement") ){
				DIS_ll.add(b);
				DIS_count++;
		} else if(x.equalsIgnoreCase("hp") || x.equalsIgnoreCase("horsepower")){
				HP_ll.add(b);
				HP_count++;
		} else if(x.equalsIgnoreCase("wei") || x.equalsIgnoreCase("weight")){
				WEI_ll.add(b);
				WEI_count++;
		} else if(x.equalsIgnoreCase("acc") || x.equalsIgnoreCase("acceleration")){
				ACC_ll.add(b);
				ACC_count++;
		} else if(x.equalsIgnoreCase("year") || x.equalsIgnoreCase("yea")){
				YEAR_ll.add(b);
				YEAR_count++;
		} else if(x.equalsIgnoreCase("ori") || x.equalsIgnoreCase("origin") || x == "8" ){
				ORI_ll.add(b);
				ORI_count++;
		}
	}	
	
	public void removeFromList(int i, double a){
		if(i == 1){
			MPG_ll.remove((double) a);
		}
		if(i == 2){
			CYL_ll.remove((double) a);		
		}
		if(i == 3){
			DIS_ll.remove((double) a);		
			}
		if(i == 4){
			HP_ll.remove((double) a);		
			}
		if(i == 5){
			WEI_ll.remove((double) a);		
			}
		if(i == 6){
			ACC_ll.remove((double) a);		
			}
		if(i == 7){
			YEAR_ll.remove((double) a);		
			}
		if(i == 8){
			ORI_ll.remove((double) a);		
			}
		
	}
	/*
	public void bubbleSort()
    {
         for(int sort=1;sort<MPG_ll.size();sort++)
         {
             singleSort(MPG_ll);
         }
    }
		
	public void singleSort(LinkedList MPG)
    {
        for(int item=0;item<MPG_ll.size()-1;item++)
        {
             Double left=(Double)MPG_ll.get(item);
             Double right=(Double)MPG_ll.get(item+1);
            if(left.intValue() > right.intValue()) swap(MPG_ll, item+1);
        }
    }		
	
		public void swap(int right_index)
	    {
	         Double right=MPG_ll.remove(right_index);
	         MPG_ll.add(right_index-1,right);
	    }
	    
	    */
	void mergeSort(){
		
		//TODO
		
	}
	
	void insertionSort(){
		
		//TODO
		
	}
	
	void quickSort(){
		
		//TODO
		
	}
	
	public void printContents(){
	//PRINTS UNSORTED LL
	System.out.println("Number of variables: " + count);	
		
	System.out.println("\nMPG Linked List: ");
	System.out.println(MPG_ll);
	
	System.out.println("\nCYLINDERS Linked List: ");
	System.out.println(CYL_ll);
	
	System.out.println("\nDISPLACEMENT Linked List: ");
	System.out.println(DIS_ll);
	
	System.out.println("\nHorsePower Linked List: ");
	System.out.println(HP_ll);
	
	System.out.println("\nWEIGHT Linked List: ");
	System.out.println(WEI_ll);
	
	System.out.println("\nACCELERATION Linked List: ");
	System.out.println(ACC_ll);
	
	System.out.println("\nYEAR Linked List: ");
	System.out.println(YEAR_ll);
	
	System.out.println("\nORIGIN Linked List: ");
	System.out.println(ORI_ll);
	
	}

	public void printSorted(){
	//Prints sorted LL
	System.out.println("\nMPG Linked List SORTED: ");
	System.out.println(MPG_ll);
	
	System.out.println("\nCYLINDERS Linked List SORTED: ");
	System.out.println(CYL_ll);
	
	System.out.println("\nDISPLACEMENT Linked List SORTED: ");
	System.out.println(DIS_ll);
	
	System.out.println("\nHorsePower Linked List SORTED: ");
	System.out.println(HP_ll);
	
	System.out.println("\nWEIGHT Linked List SORTED: ");
	System.out.println(WEI_ll);
	
	System.out.println("\nACCELERATION Linked List SORTED: ");
	System.out.println(ACC_ll);
	
	System.out.println("\nYEAR Linked List SORTED: ");
	System.out.println(YEAR_ll);
	
	System.out.println("\nORIGIN Linked List SORTED: ");
	System.out.println(ORI_ll);
	
}

	public void sortContents(){
	
	Collections.sort(MPG_ll);
	Collections.sort(CYL_ll);
	Collections.sort(DIS_ll);
	Collections.sort(HP_ll);
	Collections.sort(WEI_ll);
	Collections.sort(ACC_ll);
	Collections.sort(YEAR_ll);
	Collections.sort(ORI_ll);
	
}

	public void openFile(){
		
		try{
			x = new Scanner(new File("rawdata.txt"));
			
		}catch(Exception e){
			System.out.println("Could not find File");
		}	
	}
	
	public void readFile(){
		
		while(x.hasNext()){						// Loop through each LINE and add variable dependent on spacing
			
			//MPG
			String a = x.next();				// Takes first sequence and adds as string(a)
			MPG = Double.parseDouble(a);		// Converts MPG String to double
			MPG_ll.add(MPG);					// Adds converted MPG to LL
			MPG_count++;						// Adds to a count for every MPG instance
			MPG = 0;							// Resets Db back to 0
			count++;

			//CYL
			String b = x.next();
			CYL = Double.parseDouble(b);
			CYL_ll.add(CYL);
			CYL_count++;
			CYL = 0;
			count++;

			//DIS
			String c = x.next();
			DIS = Double.parseDouble(c);
			DIS_ll.add(DIS);
			DIS_count++;
			DIS = 0;
			count++;

			//HP
			String d = x.next();
			HP = Double.parseDouble(d);
			HP_ll.add(HP);
			HP_count++;
			HP = 0;
			count++;

			//WEI
			String e = x.next();
			WEI = Double.parseDouble(e);
			WEI_ll.add(WEI);
			WEI_count++;
			WEI = 0;
			count++;

			//ACC
			String f = x.next();
			ACC = Double.parseDouble(f);
			ACC_ll.add(ACC);
			ACC_count++;
			ACC = 0;
			count++;

			//YEAR
			String g = x.next();
			YEAR = Double.parseDouble(g);
			YEAR_ll.add(YEAR);
			YEAR_count++;
			YEAR = 0;
			count++;

			//ORI
			String h = x.next();;
			ORI = Double.parseDouble(h);
			ORI_ll.add(ORI);
			ORI_count++;
			ORI = 0;
			count++;
			
		}	
	}
	
	public void closeFile(){
		x.close();
	}

}