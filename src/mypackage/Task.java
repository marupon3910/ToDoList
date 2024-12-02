package mypackage;

public class Task {
	
	private String name;
	private boolean isCompleted;
	
	public Task(String name) {
		this.name = name;
		this.isCompleted = false;
	}
	
	public String getName() {
		return name;
	}
	
	public boolean isCompleted() {
		return isCompleted;
	}
	
	public void setCompleted(boolean isCompleted) {
		this.isCompleted = isCompleted;
	}
	
	@Override
	public String toString() {
		return (isCompleted ? "[x]" : "[ ]") + name;
	}

}
