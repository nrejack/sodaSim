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

    public Soda getSoda() {
        return this.soda;
    }
}