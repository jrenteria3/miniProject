package miniProject;

import java.util.*;
import java.io.*;

public class RawReader {

	public Scanner x;
	public static int count;
	
	public static double MPGr;
	public static double Cylr;
	public static double DISr;
	public static double HPr;
	public static double WEIr;
	public static double ACCr;
	public static double YEARr;
	public static double ORIr;
	
	public static String MODr;
	
	public static double mpgr_count = 0;
	public static double cylr_count = 0;
	public static double disr_count = 0;
	public static double hpr_count = 0;
	public static double weir_count = 0;
	public static double accr_count = 0;
	public static double yearr_count = 0;
	public static double orir_count = 0;
	
	public static LinkedList<Double> mpgr_ll = new LinkedList<Double>();
	public static LinkedList<Double> cylr_ll = new LinkedList<Double>();
	public static LinkedList<Double> disr_ll = new LinkedList<Double>();
	public static LinkedList<Double> hpr_ll = new LinkedList<Double>();
	public static LinkedList<Double> weir_ll = new LinkedList<Double>();
	public static LinkedList<Double> accr_ll = new LinkedList<Double>();
	public static LinkedList<Double> yearr_ll = new LinkedList<Double>();
	public static LinkedList<Double> orir_ll = new LinkedList<Double>();
	
	public static LinkedList<String> modr_ll = new LinkedList<String>();
	
	void printTest(){
		
		System.out.println(mpgr_ll);
	}
	
	public void removeAll(int i, double b){
		
		
		
	}
	
	public void addToList(int i, double a){
		//1=mpg, 2=cyl, 3=dis, 4=hp, 5=wei, 6=acc, 7=year, 8=ori
		//Adds to LL
		if(i == 1){
			mpgr_ll.add((double) a);
		}
		if(i == 2){
			cylr_ll.add((double) a);		
		}
		if(i == 3){
			disr_ll.add((double) a);		
			}
		if(i == 4){
			hpr_ll.add((double) a);		
			}
		if(i == 5){
			weir_ll.add((double) a);		
			}
		if(i == 6){
			accr_ll.add((double) a);		
			}
		if(i == 7){
			yearr_ll.add((double) a);		
			}
		if(i == 8){
			orir_ll.add((double) a);		
			}
	}
	
	public void removeFromList(int i, double a){
		if(i == 1){
			mpgr_ll.remove((double) a);
		}
		if(i == 2){
			cylr_ll.remove((double) a);		
		}
		if(i == 3){
			disr_ll.remove((double) a);		
			}
		if(i == 4){
			hpr_ll.remove((double) a);		
			}
		if(i == 5){
			weir_ll.remove((double) a);		
			}
		if(i == 6){
			accr_ll.remove((double) a);		
			}
		if(i == 7){
			yearr_ll.remove((double) a);		
			}
		if(i == 8){
			orir_ll.remove((double) a);		
			}
		
	}
	
	void bubbleSort(){
		
		//TODO
		
	}
	
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
		
	System.out.println("\nMPG Linked List UNSORTED: ");
	System.out.println(mpgr_ll);
	
	System.out.println("\nCYLINDERS Linked List UNSORTED: ");
	System.out.println(cylr_ll);
	
	System.out.println("\nDISPLACEMENT Linked List UNSORTED: ");
	System.out.println(disr_ll);
	
	System.out.println("\nHorsePower Linked List UNSORTED: ");
	System.out.println(hpr_ll);
	
	System.out.println("\nWEIGHT Linked List UNSORTED: ");
	System.out.println(weir_ll);
	
	System.out.println("\nACCELERATION Linked List UNSORTED: ");
	System.out.println(accr_ll);
	
	System.out.println("\nYEAR Linked List UNSORTED: ");
	System.out.println(yearr_ll);
	
	System.out.println("\nORIGIN Linked List UNSORTED: ");
	System.out.println(orir_ll);
	
	}

	public void printSorted(){
	//Prints sorted LL
	System.out.println("\nMPG Linked List SORTED: ");
	System.out.println(mpgr_ll);
	
	System.out.println("\nCYLINDERS Linked List SORTED: ");
	System.out.println(cylr_ll);
	
	System.out.println("\nDISPLACEMENT Linked List SORTED: ");
	System.out.println(disr_ll);
	
	System.out.println("\nHorsePower Linked List SORTED: ");
	System.out.println(hpr_ll);
	
	System.out.println("\nWEIGHT Linked List SORTED: ");
	System.out.println(weir_ll);
	
	System.out.println("\nACCELERATION Linked List SORTED: ");
	System.out.println(accr_ll);
	
	System.out.println("\nYEAR Linked List SORTED: ");
	System.out.println(yearr_ll);
	
	System.out.println("\nORIGIN Linked List SORTED: ");
	System.out.println(orir_ll);
	
}

	public void sortContents(){
	
	Collections.sort(mpgr_ll);
	Collections.sort(cylr_ll);
	Collections.sort(disr_ll);
	Collections.sort(hpr_ll);
	Collections.sort(weir_ll);
	Collections.sort(accr_ll);
	Collections.sort(yearr_ll);
	Collections.sort(orir_ll);
	
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
			MPGr = Double.parseDouble(a);		// Converts MPG String to double
			//System.out.println(MPGr);			// PRINTS to ensure reading correctly
			mpgr_ll.add(MPGr);					// Adds converted MPG to LL
			mpgr_count++;						// Adds to a count for every MPG instance
			MPGr = 0;							// Resets Db back to 0

			//CYL
			String b = x.next();
			Cylr = Double.parseDouble(b);
			//System.out.println(Cylr);
			cylr_ll.add(Cylr);
			cylr_count++;
			Cylr = 0;
			
			//DIS
			String c = x.next();
			DISr = Double.parseDouble(c);
			//System.out.println(DISr);
			disr_ll.add(DISr);
			disr_count++;
			DISr = 0;
			
			//HP
			String d = x.next();
			HPr = Double.parseDouble(d);
			//System.out.println(HPr);
			hpr_ll.add(HPr);
			hpr_count++;
			HPr = 0;
			
			//WEI
			String e = x.next();
			WEIr = Double.parseDouble(e);
			//System.out.println(WEIr);
			weir_ll.add(WEIr);
			weir_count++;
			WEIr = 0;
			
			//ACC
			String f = x.next();
			ACCr = Double.parseDouble(f);
			//System.out.println(ACCr);
			accr_ll.add(ACCr);
			accr_count++;
			ACCr = 0;
			
			//YEAR
			String g = x.next();
			YEARr = Double.parseDouble(g);
			//System.out.println(YEARr);
			yearr_ll.add(YEARr);
			yearr_count++;
			YEARr = 0;
			
			//ORI
			String h = x.next();;
			ORIr = Double.parseDouble(h);
			//System.out.println(ORIr);
			orir_ll.add(ORIr);
			orir_count++;
			ORIr = 0;
			
			//MODEL
			//String i = x.next();
			//System.out.println(i);
			//modr_ll.add(i);
						
			//Error check
			count++;
			
		}	
	}
	
	public void closeFile(){
		x.close();
	}

}