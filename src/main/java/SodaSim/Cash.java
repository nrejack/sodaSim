package SodaSim;

public enum Cash {
	DOLLARBILL("Dollar bill", 1.0),
	DOLLARCOIN("Dollar coin", 1.0),
	QUARTER("Quarter", .25),
	DIME("Dime", .1),
	NICKEL("Nickel", .05);

	public final String label;
	public final double value;

	private Cash(String label, double value) {
		this.label = label;
		this.value = value;
	}
}
