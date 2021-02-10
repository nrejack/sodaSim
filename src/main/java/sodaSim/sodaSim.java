package sodaSim;

import java.util.Scanner;

public class sodaSim {
	
    public static void main(String[] args) {
        System.out.println("Welcome to SodaSim version 0.1");
        VendingMachine myVendingMachine = new VendingMachine(7, false, 0);
	
	Soda joke = new Soda("Joke-A-Cola", "This is the archetypical soda. Brown and fizzy.", 1.50);
	Soda dietJoke = new Soda("Diet Joke", "A little metallic tasting, but just like the real thing.", 1.25);
	Soda drPebble = new Soda("Dr Pebble", "Tastes familar, like a rusty cherry.", 1.0);
	Soda hackerFuel = new Soda("Hacker Fuel", "Highly caffeinated for late night coding sessions", 2.5);
	Soda zenJuice = new Soda("ZenJuice", "World peace via a mass-produced beverage", 1.75);
	Soda sportsBall = new Soda("SportsBall", "No one who exercises has ever drank this. Flavor: green", 2.25);
        Soda flOrange = new Soda("Florida Orange", "Tastes exactly like an artificial orange.", 1.75); 
       	System.out.println("There are " + myVendingMachine.getSlotCount() + " slots in the vending machine.");

	myVendingMachine.loadSoda(joke, 0, 12);
	myVendingMachine.loadSoda(dietJoke, 1, 12);
	myVendingMachine.loadSoda(drPebble, 2, 12);
	myVendingMachine.loadSoda(hackerFuel, 3, 10);
	myVendingMachine.loadSoda(zenJuice, 4, 8);
	myVendingMachine.loadSoda(sportsBall, 5, 10);
	myVendingMachine.loadSoda(flOrange, 6, 5);
	
	System.out.println("Ka-chunk: all sodas loaded into the machine.");

	Scanner keyboard = new Scanner(System.in);
	System.out.println("Vending Machine loaded. Make a selection: ");
	myVendingMachine.menu(keyboard);
    }

}

