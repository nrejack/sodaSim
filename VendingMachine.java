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

    public static void main(String[] args) {
        System.out.println("Welcome to SodaSim version 0.1");
        VendingMachine myVendingMachine = new VendingMachine(6, false, 0);

        
    }

}