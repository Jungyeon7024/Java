package chap37_TodoList;

import java.util.HashMap;
import java.util.Scanner;

public class TodoList2 {
	private HashMap<String,String>tasks;
	
	public TodoList2() {
		tasks= new HashMap<String,String>();
	}

	public void addTask(String task) {
		tasks.put(task,task);
	}
	public void removeTask(int index) {
		if(index >= 0 && index < tasks.size()) {
			tasks.remove(index);
		}else {
			System.out.println("다시");
		}
		
		
	}
	public void displayTasks() {
		System.out.println("My TodoList");
		for(int i = 0; i < tasks.size(); i++) {
			System.out.println((i + 1) + "." + tasks.get(i));
		}
	}
	public static void main(String[] ar) {
		TodoList2 todoList = new TodoList2();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("할일 추가:add, 삭제:remove, "
					         + "할일보기:list, 종료:exit 입력하세요.");
			String choice = sc.nextLine();
			
			if(choice.equalsIgnoreCase("add")) {
				System.out.println("할 일을 입력하세요.");
				String task = sc.nextLine();
				todoList.addTask(task);
			} else if (choice.equalsIgnoreCase("remove")) {
				System.out.println("삭제할 일 번호 입력하기");
				try {
					int index = Integer.parseInt(sc.nextLine()) -1;
					todoList.removeTask(index);
				}catch (Exception e) {
					System.out.println("유효하지 않은 입력입니다.");
				}
			} else if (choice.equals("list")) {
				todoList.displayTasks();
			} else if (choice.equalsIgnoreCase("exit")) {
				break;
			} else {
				System.out.println("잘못된 명령입니다.");
			}	
		}
		System.out.println("어플리케이션 종료");
		sc.close();
	}
}
	
	