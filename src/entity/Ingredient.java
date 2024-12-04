package entity;

import java.io.Serializable;

class Ingredient implements Serializable {
	private String name;
	private int currentStock;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCurrentStock() {
		return currentStock;
	}

	public void setCurrentStock(int currentStock) {
		this.currentStock = currentStock;
	}

	@Override
	public String toString() {
		return String.format("%-10s %5d", name, currentStock);
	}
}

