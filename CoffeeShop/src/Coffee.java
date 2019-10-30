import java.util.ArrayList;

public class Coffee {
	private String name;
	private ArrayList<String> addIns = new ArrayList<String>();
	private boolean withIce = false;
	private int sugar;
	private double cost = 5;

	public Coffee() {

	}
	public Coffee(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String newName) { 
		this.name = newName;
	}

	public int getSugar() {
		return sugar;
	}

	public void setSugar(int percentage) {
		this.sugar = percentage;
	}

	public boolean addIce() {
		return withIce = true;
	}

	public void addTopping(String topping) {
		this.addIns.add(topping);
	}

	public String getDescription() {
		String desc = "";
		if (addIns.size() == 0) {
			if (withIce == true) {
				return "Ice " + name;
			}
			else {
				return "Hot " + name;
			}
		} else {
			if (withIce == true) {
				for (int i = 0; i < addIns.size(); i++) {
					desc = "Ice " + name + " with " + addIns.get(i);
				}
			} else {
				for (int i = 0; i < addIns.size(); i++) {
					desc = "Hot " + name + " with " + addIns.get(i);
				}
			}
			return desc;
		}
	}

	public double calculatePrice() {
		for (int i = 0; i < addIns.size(); i++) {
			cost = cost + 0.5;
		} 
		return cost;
	}
}
