package SodaSim;

import java.util.ArrayList;

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

    public static double getValue(ArrayList<Cash> holding) {
        double sum = 0.0;
        if (holding.size() == 0)
            return sum;
        for (int i = 0; i < holding.size(); i++) {
            sum += holding.get(i).value;
        }
        return sum;
    }

}
