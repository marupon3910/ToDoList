package mypackage;

import java.util.ArrayList;

public class ToDoList {
	
	private ArrayList<Task> tasks;
	
	public ToDoList() {
		tasks = new ArrayList<>();
	}
	
	public void addTask(String taskName) {
		tasks.add(new Task(taskName));
	}
	
	public void removeTask(int index) {
		if(index >= 0 && index < tasks.size()) {
			tasks.remove(index);
		}else {
			System.out.println("Invalid task number.");
		}
	}
	
	public void markTaskAsCompleted(int index) {
		if(index >= 0 && index < tasks.size()) {
			tasks.get(index).setCompleted(true);
		}else {
			System.out.println("Invalid task number.");
		}
	}
	
	public void displayTasks() {
		if(tasks.isEmpty()) {
			System.out.println("No tasks to display.");
		}else {
			for(int i = 0;i < tasks.size();i++) {
				System.out.println((i + 1) + ". " + tasks.get(i));
			}
		}
	}

}
