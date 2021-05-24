package oop_practice;

import java.util.Scanner;
import java.util.	ArrayList;

class VendingMachine {
    // Simulate a vending machine

    private static String version = "0.1";

    private Slot[] slots; // hold cans of soda in each slots
    //private int quarters, dimes, nickels, dollar_coins, dollar_bills;
    private CashBox myCashBox = new CashBox();
	private boolean canBeRocked; 
    private double repairStatus; // range from 0 to 1, as it approaches 1 issues come up
	ArrayList<Cash> holding;  // where money put into the machine waits

    public VendingMachine() { // default constructor
        this.slots = new Slot[0];
        //this.quarters = this.dimes = this.nickels = this.dollar_coins = this.dollar_bills = 0;
        this.myCashBox = new CashBox();
		this.canBeRocked = false;
        this.repairStatus = 0;
		this.holding = new ArrayList<Cash>();
    }

    public VendingMachine(int slotCount, boolean canBeRocked, double repairStatus) {
        this.slots = new Slot[slotCount];
        //this.quarters = this.dimes = this.nickels = this.dollar_coins = this.dollar_bills = 0;
        this.myCashBox = new CashBox();
		this.canBeRocked = canBeRocked;
        this.repairStatus = repairStatus;
		this.holding = new ArrayList<Cash>();
    }

    public int getSlotCount() {
	    // Use the counting number instead of the indexed-from-zero number
	    return slots.length -1;
    }
 
    public void loadSoda(Soda soda, int slot_number, int quantity) {
    	// load a soda into the machine
	if (this.slots[slot_number] != null) {
		System.out.println("Error: slot %d is already occupied. Try again.");
	}
	else {
		this.slots[slot_number] = new Slot(soda, quantity);
	}
    }

    public void sodaMenu() {
	    // show a menu of the available sodas
	System.out.println("\nButton\tName");
	int i = 1;
	for(Slot s: this.slots) {
		System.out.println("(" + i + ")\t" + s.getSoda().getName());
		i++;
	}
    }

    public void depositCash(Scanner scanner) {
		while (true) {
			System.out.println("How much money do you want to put in?");
			System.out.println("(1) Dollar bill");
			System.out.println("(2) Dollar coin");
			System.out.println("(3) Quarter");
			System.out.println("(4) Dime");
			System.out.println("(5) Nickel");
			System.out.println("(6) Go back");
			int selection = scanner.nextInt();
			if (selection == 1) {
				this.holding.add(Cash.DOLLARBILL);
				continue;
			}
			else if (selection == 2) {
				this.holding.add(Cash.DOLLARCOIN);
				continue;
			}
			else if (selection == 3) {
				this.holding.add(Cash.QUARTER);
				continue;
			}
			else if (selection == 4) {
				this.holding.add(Cash.DIME);
				continue;
			}
			else if (selection == 5) {
				this.holding.add(Cash.NICKEL);
				continue;
			}
			else if (selection == 6) {
				break;
			}
		}
	    //System.out.println("Lucky for you, all sodas are free right now.");
    }

    public void lookSoda(Scanner scanner) {
	    System.out.print("Which soda do you want to look at? ");
	    int selection = scanner.nextInt();
	    Soda soda = this.slots[selection -1].getSoda();
	    System.out.println("\n" + soda.getName());
	    System.out.println(soda.getFlavor());
    }

    public void pushButton(Scanner scanner) {
	    System.out.print("Which number button to push? ");
	    int selection = scanner.nextInt();
	    Soda soda = this.slots[selection -1].getSoda();
	    if (this.slots[selection -1].getCount() == 0) {
		System.out.println("Sorry. No more " + soda.getName() + " left.");
    		}
	    else {	    
	    vendSoda(soda);
	    this.slots[selection -1].decCount();
	    }
    }

    public void vendSoda(Soda soda) {

	    System.out.println("\nKER-CHUNK!");
	    System.out.println("A cold can of " + soda.getName() + " falls down into the dispensing slot.");
    }

    public void menu(Scanner scanner) {
	    // display menu
	 
	while (true) {
		System.out.println("\nACTIONS:");
		System.out.println("(1) Show list of buttons on machine");
		System.out.println("(2) Put money in");
		System.out.println("(3) Look at a soda slot");
		System.out.println("(4) Push a soda button");
		System.out.println("(9) Walk away.");
		System.out.print("Your selection: ");
		int selection = scanner.nextInt();
		if (selection == 1) {
			sodaMenu();
			continue;
		}
		else if (selection == 2) {
			depositCash(scanner);
			continue;
		}
		else if (selection == 3) {
			lookSoda(scanner);
			continue;
		}
		else if (selection == 4) {
			pushButton(scanner);
			continue;
		}
		else if (selection == 9) {
			System.out.println("Thanks for visiting the soda machine.");
			System.exit(0);
		}
	}
    }
}

