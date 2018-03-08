package miniProject;

public class Main {

	public static void main(String[] args) {
/*
		FileReader r = new FileReader();
		r.openFile();
		r.readFile();
		r.closeFile();
		
		r.printContents();
		System.out.println();
		r.sortContents();
		r.printSorted();
*/	
		RawReader s = new RawReader();
		
		s.openFile();
		s.readFile();
		s.closeFile();
		
		s.printContents();
		s.sortContents();
		s.printSorted();
		
		/*
		s.addToList(1,5050);		//test
		s.addToList(1, 6060);		//test
		s.addToList(1, 7070);		//test
		s.printTest();				//test
		
		s.removeFromList(1, 5050);
		s.printTest();
		
		System.out.println();
	*/
	}

}