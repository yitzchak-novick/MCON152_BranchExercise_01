package code;

import java.util.Date;

public class HistoryItem {
	private int amount;
	private String description;
	private Date date;
	private String name;
	
	public HistoryItem(int amount, String description, Date date, String name) {
		this.amount = amount;
		this.description = description;
		this.date=date;
		this.name = name;
	}
	
	public int getAmount() {
		return amount;
	}
	
	public String getDescription() {
		return description;
	}
	
	@Override
	public String toString() {
		return "History item, amount is: " + amount + "\nName: " + name+ "\nItem description: " + description + "\nDate added: " + date;
	}
}
