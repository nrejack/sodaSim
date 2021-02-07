class VendingMachine {
    // Simulate a vending machine

    private static String version = '0.1';

    private Slot[] slots; // hold cans of soda in each slots
    private int quarters, dimes, nickels, dollar_coins, dollar_bills;
    private boolean canBeRocked; 
    private double repairStatus; // range from 0 to 1, as it approaches 1 issues come up

    public VendingMachine() { // default constructor
        this.slots = Slot[0];
        this.quarters = this.dimes = this.nickles = this.dollar_coins = this.dollar_bills = 0;
        this.canBeRocked = false;
        this.repairStatus = 0;
    }

    public VendingMachine(int slotCount, canBeRocked, repairStatus) {
        this.slots = Slot[slotCount];
        this.quarters = this.dimes = this.nickles = this.dollar_coins = this.dollar_bills = 0;
        this.canBeRocked = canBeRocked;
        this.repairStatus = repairStatus;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to SodaSim version 0.1");
        )
    }

}

class Slot {
    // Simulate the slots on a vending machine

    private Soda soda;
    private int count; // number of cans in slot

    public Slot() {
        this.soda = null;
        this.count = 0;
    }

    public Slot(Soda soda, int count) {
        this.soda = soda;
        this.count = count;
    }

    public int getCount() {
        return this.count;
    }

    public int getSoda() {
        return this.soda;
    }
}

class Soda {
    // simulate a soda
    private String name;
    private String flavor;
    private double price;

    public Soda() {
        this.name = "Generic Soda brand Soda";
        this.flavor = "Tastes like generic soda that fell behind the shelf.";
        this.price = ".25";
    }

    public Soda() {
        this.name = name;
        this.flavor = flavor;
        this.price = price;
    }

    public String getName() {
        return this.name;
    }

    public String getFlavor() {
        return this.flavor;
    }

    public double getPrice() {
        return this.price;
    }


}

