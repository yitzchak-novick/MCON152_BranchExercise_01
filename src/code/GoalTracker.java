package code;

import java.util.ArrayList;
import java.util.Date;

public class GoalTracker {
	private int goal;
	private int currTotal = 0;
	private ArrayList<HistoryItem> historyItems = new ArrayList<HistoryItem>();
	private Date goalSet;
	
	public GoalTracker(int goal, Date date) {
		if (goal < 0)
			throw new IllegalArgumentException("Negative goal inputted");
		this.goal = goal;
		this.goalSet = date;
	}
	
	public boolean goalIsMet() {
		return currTotal >= goal;
	}
	
	public int getGoal() {
		return goal;
	}
	
	public int getGoalDeficit() {
		return goal - currTotal;
	}
	
	public int getCurrTotal() {
		return currTotal;
	}
	
	public void addHistoryItem(HistoryItem historyItem) {
		historyItems.add(historyItem);
		currTotal += historyItem.getAmount();
	}
	
	@Override
	public String toString() {
		return "Your goal is " + goal + ", currTotal: " + currTotal;
	}
	
}
