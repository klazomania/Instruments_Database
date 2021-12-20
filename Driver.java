import java.util.ArrayList;
import java.util.Scanner;
public class Driver {
	/*
	 *  Just a fun little project to show understanding of OOP
	 * 
	 */
	
	public static  ArrayList<Instrument> myInstruments  = new ArrayList<Instrument>();
	
	public static 	Electric lesPaul = new Electric( 11, 5, false, "Red", "Epiphone", 6, "LesPaul", 22, false);	
	public static Electric fender = new Electric( 11, 4, false, "White", "Squire", 6, "Stratocaster", 21, true);
	public static Bass dean = new Bass( 10, 8, false, "Black", "Dean", 5, "Edge", 24, "Electric");
	public static Guitar yamaha = new Guitar( 10, 3, false, "Brown", "Yamaha", 6, "Acoustic", 20);
	public static Trumpet bFlat = new Trumpet( 10, 8, false, "Bronze", 3);
	public static Piano akaiMPK = new Piano(10, 10, false, "Black", 25);
	
	static {
		myInstruments.add(lesPaul);
		myInstruments.add(fender);
		myInstruments.add(dean);
		myInstruments.add(yamaha);
		myInstruments.add(bFlat);
		myInstruments.add(akaiMPK);
	}

	public static void main(String[] args) {
		Instrument selected = pickAnInstrument();
		System.out.println("Setting up instrument....");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {			
			e.printStackTrace();
		}
		for (int i = 0; i < 3; i++) {
			System.out.println(".........");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {				
				e.printStackTrace();
			}			
		}
		selected.setReadyToPlay(true);
		System.out.print("Instrument is ready to play!");				
	}
		
	
	
	public static Instrument pickAnInstrument() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please select one of the following instruments: ");
		System.out.println("1. LesPaul Electric Guitar");
		System.out.println("2. Fender Electric Guitar");
		System.out.println("3. Dean Electric Bass");
		System.out.println("4. Yamaha Acoustic Guitar");
		System.out.println("5. Yamama Trumpet");		
		System.out.println("6. Akai MPK Mini Keyboard");
		int selection = 0;
		boolean flag = true;
		while (flag) {
			int number = sc.nextInt();			
			if (number > 0 && number < 7) {
				flag = false;
				selection = number - 1;				
			}			
			else {
				System.out.println("Selection is invalid. Please try again.");				
			}
		}
		
		if (selection == 0) {
			System.out.println("You have picked the lesPaul!");
			System.out.println("Weight:   " + lesPaul.getWeight());
			System.out.println("Color:   " + lesPaul.getColor());
			System.out.println("Brand:  "  + lesPaul.getBrandName());
			System.out.println("Number of Strings  " + lesPaul.getNumberOfStrings());
			System.out.println("Type:   " + lesPaul.getType());
			System.out.println("Number of Frets:   " + lesPaul.getNumberOfFrets());
			System.out.println("Has whammy bar:  " + lesPaul.getHasWhammyBar());
			System.out.println("Owner:   " + lesPaul.ownerName);
		}
		else if (selection == 1) {
			System.out.println("You have picked the fender");
			System.out.println("Weight:   " + fender.getWeight());
			System.out.println("Color:   " + fender.getColor());
			System.out.println("Brand:  "  + fender.getBrandName());
			System.out.println("Number of Strings  " + fender.getNumberOfStrings());
			System.out.println("Type:   " + fender.getType());
			System.out.println("Number of Frets:   " + fender.getNumberOfFrets());
			System.out.println("Has whammy bar:  " + fender.getHasWhammyBar());
			System.out.println("Owner:   " + fender.ownerName);
		}
		else if (selection == 2) {
			System.out.println("You have picked the dean!");
			System.out.println("Weight:   " + dean.getWeight());
			System.out.println("Color:   " + dean.getColor());
			System.out.println("Brand:  "  + dean.getBrandName());
			System.out.println("Number of Strings  " + dean.getNumberOfStrings());
			System.out.println("Type:   " + dean.getType());
			System.out.println("Number of Frets:   " + dean.getNumberOfFrets());
			System.out.println("Bass Type:   " + dean.getBassType());
			System.out.println("Owner:   " + dean.ownerName);
		}
		else if (selection == 3) {
			System.out.println("You have picked the yamaha!");
			System.out.println("Weight:   " + yamaha.getWeight());
			System.out.println("Color:   " + yamaha.getColor());
			System.out.println("Brand:  "  + yamaha.getBrandName());
			System.out.println("Number of Strings  " + yamaha.getNumberOfStrings());
			System.out.println("Type:   " + yamaha.getType());
			System.out.println("Number of Frets:   " + yamaha.getNumberOfFrets());			
			System.out.println("Owner:   " + lesPaul.ownerName);
		}
		if (selection == 4) {
			System.out.println("You have picked the bFlat Trumpet!");
			System.out.println("Weight:   " + bFlat.getWeight());
			System.out.println("Color:   " + bFlat.getColor());
			System.out.println("Number of Valves: "  + bFlat.getNumberOfValves());			
			System.out.println("Owner:   " + lesPaul.ownerName);
		}
		if (selection == 5) {
			System.out.println("You have picked the akaiMPK Mini!");
			System.out.println("Weight:   " + akaiMPK.getWeight());
			System.out.println("Color:   " + akaiMPK.getColor());
			System.out.println("Number of Keys:  " + akaiMPK.getNumberOfKeys());					
			System.out.println("Owner:   " + lesPaul.ownerName);
		}
		return myInstruments.get(selection);				
	}
	
	}
	

