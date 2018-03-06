public class Sorting {
	
	private int[] theArray = new int [50];
	
	private int arraySize = 10;
	
	/********************************************************************
		Below are the methods to be used to manage the Array
		- insertValue					+insert a Value into the Array
		-deleteIndex					+Delete the value at the specified Index
		-swapValue						+Swap the values of two Index's
		-doesArrayContainThisValue		+Checks if an array contains a value at ANY index	
		-getValueAtIndex				+Will find the value that is contained in the specified Index
	********************************************************************/
	
	//This inserts a value at the end of the array
	public void insertValue(int value){
		
		if(arraySize < 50){
			
			theArray[arraySize] = value;
			
			arraySize++;
		}
	}
	
	//This deletes a value at the index
	public void deleteIndex(int index){
		
		if(index < arraySize){
			
			for(int i = index; i < (arraySize - 1); i++){
				
				theArray[i] = theArray[i+1];		
			}
			arraySize--;
		}	
	}
	
	//Performs a swap of two value
	public void swapValues(int indexOne, int indexTwo){
		
		int temp = theArray[indexOne];
		theArray[indexOne] = theArray[indexTwo];
		theArray[indexTwo] = temp;	
	}
	
	//Checks to see if a value is present in an Array
	public boolean doesArrayContainThisValue(int searchValue){
		
		boolean valueInArray = false;
		
		for(int i = 0; i<arraySize; i++){
			if(theArray[i] == searchValue){
			valueInArray = true;
			
			}
		}
		return valueInArray;
	}
	
	//This will get the value at an index
	public int getValueAtIndex(int index){
		
		if(index < arraySize) return theArray[index];
		
		return 0;	
	}
	
	/********************************************************************
		Below are the objects that will be used to generate an array
		-printHorzArray					+This will print out an array that has been randomly generated in a Horizontal view
		-printArray						+This will print out an array that has been randomly generated in a Vertical view
		-generateRandomArray			+This will randomly generate values for an array of 10 index's between 11-19
	********************************************************************/ 	
	
	//This will print the array in a series of boxes in a Horizontal View
    public void printHorzArray(int i, int j){
		
	for(int n = 0; n < 51; n++)System.out.print("-");
	
		System.out.println();
	
		for(int n = 0; n < arraySize; n++){
		
			System.out.print("| " + n + "  ");
		}
	
		System.out.println("|");
	
	for(int n = 0; n < 51; n++)System.out.print("-");
	
		System.out.println();
	
		for(int n = 0; n < arraySize; n++){
		
			System.out.print("| " + theArray[n] + " ");
		}
	
		System.out.println("|");
	
	for(int n = 0; n < 51; n++)System.out.print("-");
	
		System.out.println();
	
		if(j != -1){
		
			// ADD THE +2 TO FIX SPACING
		
			for(int k = 0; k < ((j*5)+2); k++)System.out.print(" ");
		
			System.out.print(j);
		}
		if(i != -1){
		
			// ADD THE -1 TO FIX SPACING
		
			for(int l = 0; l < (5*(i - j)-1); l++)System.out.print(" ");
		
			System.out.print(i);
		}
		System.out.println();
	}
	
	//This will print the array in a series of boxes in a Vertical View
	public void printArray(){
		System.out.println("----------");
		for(int i=0; i<arraySize;i++){
			
			System.out.print("| "+ i + " | ");
			System.out.println(theArray[i] + " |");
			
			System.out.println("----------");
		}
	}
	
	//This will generate a random set of numbers to use in the array
	public void generateRandomArray(){
		
		for(int i =0; i<arraySize; i++){
			theArray[i] = (int)(Math.random()*10)+10;
		}
	}
	
	/********************************************************************
		These are the methods that will preform the search for a value
		-linearSearchForValue					+Linear Search
		-binarySearchForValue					+Binary Search 
	********************************************************************/
	
	//This performs a linear search for a value
	public String linearSearchForValue(int value){
		
		boolean valueInArray = false;
		
		String indexsWithValue = "";
		
		System.out.print("The Value was found in the following: ");
		
		for(int i = 0; i < arraySize; i++){
			
			if(theArray[i] == value){
				valueInArray = true;
				
				System.out.print(i + " ");
				
				indexsWithValue+= i + " ";
			}	
		}
		
		if(!valueInArray){
			
			indexsWithValue = "None";
			
			System.out.print(indexsWithValue);	
		}
		
		System.out.println();
		
		return indexsWithValue;
	}
	
	//This performs a Binary search for a value
	public void binarySearchForValue(int value){
		
		int lowIndex = 0;
		int highIndex = arraySize - 1;
		
		while(lowIndex <= highIndex){
			
			int middleIndex = (highIndex + lowIndex) / 2;
			
			if(theArray[middleIndex] < value) lowIndex = middleIndex + 1;
			
			else if (theArray[middleIndex] > value) highIndex = middleIndex - 1;
			
			else{
				
				System.out.println("\nFound a match for " + value + " at index " + middleIndex);
				
				lowIndex = highIndex +1;	
			}
			printHorzArray(middleIndex, -1);	
		}	
	}
	
	/********************************************************************
	Below are the Sort Methods to be used in the arrays	
	-bubbleSort						 +Bubble Sorting
	-selectionSort					 +Selection Sorting 	
	-insertionSort					 +Insertion Sorting
	********************************************************************/
	
	/*Bubble Sort Method
	This is the method to implement bubble sort in an array*/
	public void bubbleSort(){
		
		for(int i =arraySize - 1; i > 1; i--){
			
			for(int j = 0; j < i; j++){
				
				if(theArray[j] > theArray[j+1]){
				// [>] for Ascending Order [<] for Descending Order	
					swapValues(j, j+1);
					
					printHorzArray(i, j);			
				}	
			}	
		}
	}
	
	/*Selection Sort Method
	This is the method to implement selection sort in an array*/
	public void selectionSort(){
		
		for(int x = 0; x < arraySize; x++){
			
			int minimum = x;
			
			for(int y = x; y < arraySize; y++){
				
				if(theArray[minimum] > theArray[y]){
					
					minimum = y;	
				}	
			}
			swapValues(x, minimum);
			
			printHorzArray(x, -1);	
		}	
	}
	
	/*Insertion Sort Method 
	This is the method to implement insertion sort in an array*/
	public void instertionSort(){
		
		for(int i = 1; i < arraySize; i++){
			
			int j = i;
			
			int toInsert = theArray[i];
			
			while((j>0) && (theArray[j-1]) > toInsert){
				
				theArray[j] = theArray[j-1];
				j--;
				
				printHorzArray(i, j);
			}
			
			theArray[j] = toInsert;
			
			printHorzArray(i, j);
			
			System.out.println("\nArray[i] = " + theArray[i] + 
					" Array[j] = " + theArray[j] + " to insert = " + toInsert);	
		}
	}
	
// END OF CLASS		
}