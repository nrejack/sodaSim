package sodaSim;

import java.util.Scanner;

class VendingMachine {
    // Simulate a vending machine

    private static String version = "0.1";

    private Slot[] slots; // hold cans of soda in each slots
    private int quarters, dimes, nickels, dollar_coins, dollar_bills;
    private boolean canBeRocked; 
    private double repairStatus; // range from 0 to 1, as it approaches 1 issues come up

    public VendingMachine() { // default constructor
        this.slots = new Slot[0];
        this.quarters = this.dimes = this.nickels = this.dollar_coins = this.dollar_bills = 0;
        this.canBeRocked = false;
        this.repairStatus = 0;
    }

    public VendingMachine(int slotCount, boolean canBeRocked, double repairStatus) {
        this.slots = new Slot[slotCount];
        this.quarters = this.dimes = this.nickels = this.dollar_coins = this.dollar_bills = 0;
        this.canBeRocked = canBeRocked;
        this.repairStatus = repairStatus;
    }

    public int getSlotCount() {
	    return slots.length;
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
	System.out.println("Button\t\tName");
	for(Slot s: this.slots) {
		System.out.print(s.getSoda().getName());
	}
    }

    public void depositCash() {
	    System.out.println("Lucky for you, all sodas are free right now.");
    }

    public void menu(Scanner scanner) {
	    // display menu
	    
	System.out.println("(1) Show list of buttons on machine");
	System.out.println("(2) Put money in");
	System.out.print("Your selection: ");
	int selection = scanner.nextInt();
    }
}

