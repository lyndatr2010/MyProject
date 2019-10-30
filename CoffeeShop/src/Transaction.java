import java.util.Scanner;

public class Transaction {
	static Scanner in = new Scanner(System.in);
	static Coffee coffee = new Coffee();
	public static void main(String[] args) {
		System.out.println("          WELCOME TO THE COFFEE SHOP");
		System.out.println("What coffee would you like to get?");
		System.out.println("[E]xpresso\n"
				+ "[C]appuchino\n"
				+ "[A]mericano\n"
				+ "[M]ocha");
		String input = in.nextLine();
		while (!input.equalsIgnoreCase("c") && !input.equalsIgnoreCase("e") && 
				!input.equalsIgnoreCase("a") && !input.equalsIgnoreCase("m")) {
			System.out.print("Invalid input. Please enter again: ");
			input = in.nextLine();
		}
		if (input.equalsIgnoreCase("c")) {
			coffee.setName("Cappuchino");
		} else if (input.equalsIgnoreCase("e")) {
			coffee.setName("Expresso");
		} else if (input.equalsIgnoreCase("a")) {
			coffee.setName("Americano");
		} else {
			coffee.setName("Mocha");
		}

		System.out.print("Would you like any toppings? [y/n] ");
		input = in.nextLine();
		while (!input.equalsIgnoreCase("y") && !input.equalsIgnoreCase("n")) {
			System.out.print("Invalid input. Please enter again [y/n] ");
			input = in.nextLine();
		}

		if (input.equalsIgnoreCase("y")) {
			System.out.println("What would you like?");
			System.out.println("[W]hipping cream\n"
					+ "[I]ce cream\n"
					+ "[C]aramel\n");
			input = in.nextLine();
			while (!input.equalsIgnoreCase("w") && !input.equalsIgnoreCase("i") && 
					!input.equalsIgnoreCase("c")) {
				System.out.print("Invalid input. Please enter again: ");
				input = in.nextLine();
			}
			if (input.equalsIgnoreCase("w")) {
				coffee.addTopping("Whipping cream");
			} else if (input.equalsIgnoreCase("i")) {
				coffee.addTopping("Ice cream");
			} else {
				coffee.addTopping("Caramel");
			}

		}

		System.out.print("Do you want ice in it? [y/n] ");
		input = in.nextLine();
		while (!input.equalsIgnoreCase("y") && !input.equalsIgnoreCase("n")) {
			System.out.print("Invalid input. Please enter again [y/n] ");
			input = in.nextLine();
		}
		if (input.equalsIgnoreCase("y")) {
			coffee.addIce();
		}

		System.out.print("What about sugar? (%)");
		input = in.nextLine();
		coffee.setSugar(Integer.parseInt(input));

		System.out.println("\n============ RECEIPT ==============");
		System.out.println(coffee.getDescription());
		System.out.println("Sugar:                 " + coffee.getSugar());
		System.out.println("-----------------------------------");
		System.out.println("Total:                 $" + coffee.calculatePrice());
	}
}


