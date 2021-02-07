package sodaSim;

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

    public static void main(String[] args) {
        System.out.println("Welcome to SodaSim version 0.1");
        VendingMachine myVendingMachine = new VendingMachine(6, false, 0);
	
	Soda joke = new Soda("Joke-A-Cola", "This is the archetypical soda. Brown and fizzy.", 1.50);
	Soda dietJoke = new Soda("Diet Joke", "A little metallic tasting, but just like the real thing.", 1.25);
	Soda drPebble = new Soda("Dr Pebble", "Tastes familar, like a rusty cherry.", 1.0);
	Soda hackerFuel = new Soda("Hacker Fuel", "Highly caffeinated for late night coding sessions", 2.5);
	Soda zenJuice = new Soda("ZenJuice", "World peace via a mass-produced beverage", 1.75);
	Soda sportsBall = new Soda("SportsBall", "No one who exercises has ever drank this. Flavor: green", 2.25);
       
       	System.out.println(myVendingMachine.getSlotCount());

	myVendingMachine.loadSoda(joke, 0, 12);
	myVendingMachine.loadSoda(dietJoke, 1, 12);
	myVendingMachine.loadSoda(drPebble, 2, 12);
	myVendingMachine.loadSoda(hackerFuel, 3, 10);
	myVendingMachine.loadSoda(zenJuice, 4, 8);
	myVendingMachine.loadSoda(sportsBall, 5, 10)

	System.out.println("Vending Machine loaded. Make a selection: ");
	System.out.println("(1) Show list of buttons on machine");
	System.out.println("(2) Put money in");
	myVendingMachine.sodaMenu();

    }

}

