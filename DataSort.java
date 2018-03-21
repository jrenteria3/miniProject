package CarDataAnalysis;

import java.util.*;
import java.io.*;

public class DataSort {
	
	public Scanner x;
	public static int count;
	
	public static int MPG;
	public static int CYL;
	public static int DIS;
	public static int HP;
	public static int WEI;
	public static int ACC;
	public static int YEAR;
	public static int ORI;
	
	public static String MODr;
	
	public static int MPG_count = 0;
	public static int CYL_count = 0;
	public static int DIS_count = 0;
	public static int HP_count = 0;
	public static int WEI_count = 0;
	public static int ACC_count = 0;
	public static int YEAR_count = 0;
	public static int ORI_count = 0;
	
	public static int CAR_count =  0;
	public static int modelCC = 0;
	
	public static LinkedList<Integer> MPG_ll = new LinkedList<Integer>();
	public static LinkedList<Integer> CYL_ll = new LinkedList<Integer>();
	public static LinkedList<Integer> DIS_ll = new LinkedList<Integer>();
	public static LinkedList<Integer> HP_ll = new LinkedList<Integer>();
	public static LinkedList<Integer> WEI_ll = new LinkedList<Integer>();
	public static LinkedList<Integer> ACC_ll = new LinkedList<Integer>();
	public static LinkedList<Integer> YEAR_ll = new LinkedList<Integer>();
	public static LinkedList<Integer> ORI_ll = new LinkedList<Integer>();
	
	public static LinkedList<String> CAR = new LinkedList<String>();
	public static LinkedList<String> MODEL = new LinkedList<String>();
	
	public static void main(String[] args) {
		
		DataSort s = new DataSort();
		
		s.openMakeModel();
		s.readMakeModel();
		s.closeFile();
		
		System.out.println(CAR);
		
				
		s.findMakes("chevrolet-impala");
		
		
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
	
	void printMAkeModel() {
		
		for(String make : CAR) {
			//System.out.println("-----------------");
			System.out.println("|" + make + "|");
			
		}
			
		
		
	}
	
	//-----------------------------------------------------------------//
	
	public void binarySearchForValue(int value){
		
		int lowIndex = 0;
		int highIndex = MPG_ll.size() - 1;
		
		while(lowIndex <= highIndex){
			
			int middleIndex = (highIndex + lowIndex) / 2;
			
			if(MPG_ll.get(middleIndex) < value) lowIndex = middleIndex + 1;
			
			else if (MPG_ll.get(middleIndex) > value) highIndex = middleIndex - 1;
			
			else{
				
				System.out.println("\nFound a match for " + value + " at index " + middleIndex);
				
				lowIndex = highIndex +1;	
			}
				
		}	
	}
	
public void swapValues(int indexOne, int indexTwo){
		
		int temp = MPG_ll.get(indexOne);
		MPG_ll.get(indexTwo);
		MPG_ll.set(indexOne, indexTwo);
		MPG_ll.set(indexTwo, temp);	
	}

	public void findMakes(String x) {
		
		int numMake = 0;
		
			for(String make : CAR) {
				if(make.contains(x)) {
					System.out.println("-|" + make + "|-");
					numMake++;
				} 
			} 
		System.out.println("Num of Cars: " + numMake);
		
	}
	
	public void findNumValues(String x, int b){
		
		int numMPG = 0; 
		int numCYL = 0;
		int numDIS = 0;
		int numHP = 0;
		int numWEI = 0;
		int numACC = 0;
		int numYEAR = 0;
		int numORI = 0;
		
		if( x.equalsIgnoreCase("mpg") || x.equalsIgnoreCase("1") ){
			for(int mpg : MPG_ll){
				if(mpg == b){
					numMPG++;
				}
			}
			System.out.println("Amount found: " + numMPG);
		}
		else if(x.equalsIgnoreCase("cyl") || x.equalsIgnoreCase("cylinders") ){
			for(int cyl : CYL_ll){
				if(cyl == b){
					numCYL++;
				}
			}
			System.out.println("Amount found: " + numCYL);
		}
		else if(x.equalsIgnoreCase("dis") || x.equalsIgnoreCase("displacement") ){
			for(int dis : DIS_ll){
				if(dis == b){
					numDIS++;
				}
			}
			System.out.println("Amount found: " + numDIS);
		}
		else if(x.equalsIgnoreCase("hp") || x.equalsIgnoreCase("horsepower") ){
			for(int hp : HP_ll){
				if(hp == b){
					numHP++;
				}
			}
			System.out.println("Amount found: " + numHP);
		}
		else if(x.equalsIgnoreCase("wei") || x.equalsIgnoreCase("weight") ){
			for(int wei : WEI_ll){
				if(wei == b){
					numWEI++;
				}
			}
			System.out.println("Amount found: " + numWEI);
		}	
		else if(x.equalsIgnoreCase("acc") || x.equalsIgnoreCase("acceleration") ){	
			for(int acc : ACC_ll){
				if(acc == b){
					numACC++;
				}
			}
			System.out.println("Amount found: " + numACC);
		}
		else if(x.equalsIgnoreCase("year") || x.equalsIgnoreCase("yea") ){
			for(int year : YEAR_ll){
				if(year == b){
					numYEAR++;
				}
			}
			System.out.println("Amount found: " + numYEAR);
		}	
		else if(x.equalsIgnoreCase("ori") || x.equalsIgnoreCase("origin") ){
			for(int ori : ORI_ll){
				if(ori == b){
					numORI++;
				}
			}
			System.out.println("Amount found: " + numORI);
		}
		
		
	
		
	}
	
	public void removeAll(String x, int b){
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
	
	public void addToList(String x, int b){
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
	
	public void removeFromList(int i, int a){
		if(i == 1){
			MPG_ll.remove((int) a);
		}
		if(i == 2){
			CYL_ll.remove((int) a);		
		}
		if(i == 3){
			DIS_ll.remove((int) a);		
			}
		if(i == 4){
			HP_ll.remove((int) a);		
			}
		if(i == 5){
			WEI_ll.remove((int) a);		
			}
		if(i == 6){
			ACC_ll.remove((int) a);		
			}
		if(i == 7){
			YEAR_ll.remove((int) a);		
			}
		if(i == 8){
			ORI_ll.remove((int) a);		
			}
		
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
	Collections.sort(CAR);	
	
	
}

	public void openMakeModel() {
		
		try{
			x = new Scanner(new File("AllData"));
			
		}catch(Exception e){
			System.out.println("Could not find File");
		}	
	}
	
	public void readMakeModel() {
		
		while(x.hasNext()) {
		
		String a = x.next();
		CAR.add(a);
		CAR_count++;

		
		}
	}
		
	
	public void openFile(){
		
		try{
			x = new Scanner(new File("cardata.txt"));
			
		}catch(Exception e){
			System.out.println("Could not find File");
		}	
	}
	
	public void readFile(){
		
		while(x.hasNext()){						// Loop through each LINE and add variable dependent on spacing
			
			//MPG
			String a = x.next();				// Takes first sequence and adds as string(a)
			MPG = Integer.parseInt(a);		// Converts MPG String to double
			MPG_ll.add(MPG);					// Adds converted MPG to LL
			MPG_count++;						// Adds to a count for every MPG instance
			MPG = 0;							// Resets Db back to 0
			count++;

			//CYL
			String b = x.next();
			CYL = Integer.parseInt(b);
			CYL_ll.add(CYL);
			CYL_count++;
			CYL = 0;
			count++;

			//DIS
			String c = x.next();
			DIS = Integer.parseInt(c);
			DIS_ll.add(DIS);
			DIS_count++;
			DIS = 0;
			count++;

			//HP
			String d = x.next();
			HP = Integer.parseInt(d);
			HP_ll.add(HP);
			HP_count++;
			HP = 0;
			count++;

			//WEI
			String e = x.next();
			WEI = Integer.parseInt(e);
			WEI_ll.add(WEI);
			WEI_count++;
			WEI = 0;
			count++;

			//ACC
			String f = x.next();
			ACC = Integer.parseInt(f);
			ACC_ll.add(ACC);
			ACC_count++;
			ACC = 0;
			count++;

			//YEAR
			String g = x.next();
			YEAR = Integer.parseInt(g);
			YEAR_ll.add(YEAR);
			YEAR_count++;
			YEAR = 0;
			count++;

			//ORI
			String h = x.next();;
			ORI = Integer.parseInt(h);
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