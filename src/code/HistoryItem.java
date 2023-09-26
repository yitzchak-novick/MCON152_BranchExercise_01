package code;

import java.util.Date;

public class HistoryItem {
	private int amount;
	private String description;
	private Date date;
	
	public HistoryItem(int amount, String description, Date date) {
		this.amount = amount;
		this.description = description;
		this.date=date;
	}
	
	public int getAmount() {
		return amount;
	}
	
	public String getDescription() {
		return description;
	}
	
	@Override
	public String toString() {
		return "History item, amount is: " + amount + "\nItem description: " + description + "\nDate added: " + date;
	}
}
