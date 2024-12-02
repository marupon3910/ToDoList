package mypackage;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		ToDoList toDoList = new ToDoList();
		Scanner scanner = new Scanner(System.in);
		String command;
		
		System.out.println("welcome to ToDo List App!");
		while(true) {
			System.out.println("\nCommands: add, remove, complete, list, exit");
			System.out.println("Enter a command: ");
			command = scanner.nextLine();
			
			if(command.equals("add")) {
				System.out.println("Enter a task name:");
				String taskName = scanner.nextLine();
				toDoList.addTask(taskName);
			}else if(command.equals("remove")) {
				System.out.println("Enter task number to remove: ");
				int taskNumber = Integer.parseInt(scanner.nextLine());
				toDoList.removeTask(taskNumber - 1);
			}else if(command.equals("complete")) {
				System.out.println("Enter task number to mark as completed: ");
				int taskNumber = Integer.parseInt(scanner.nextLine());
				toDoList.markTaskAsCompleted(taskNumber - 1);
			}else if(command.equals("list")) {
				toDoList.displayTasks();
			}else if(command.equals("exit")) {
				break;
			}else {
				System.out.println("Invalid command. ");
			}
		}
		scanner.close();

	}

}
