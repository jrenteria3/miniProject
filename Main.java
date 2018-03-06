package miniProject;

public class Main {

	public static void main(String[] args) {

		FileReader r = new FileReader();
		r.openFile();
		r.readFile();
		r.closeFile();
		
		r.printContents();
		System.out.println();
		r.sortContents();
		r.printSorted();
	
		
	}

}
