package code;

public class HistoryItem {
	private int amount;
	
	public HistoryItem(int amount) {
		this.amount = amount;
	}
	
	public int getAmount() {
		return amount;
	}
	
	@Override
	public String toString() {
		return "History item, amt: " + amount;
	}
}