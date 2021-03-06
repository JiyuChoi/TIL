package day_07;

import javax.swing.JOptionPane;

public class Test05 {

	public static void main(String[] args) {
		
		Command delete = () -> {
								System.out.println("delete...");
								};
		
		Command insert = () -> System.out.println("insert...");

		Command update = () -> System.out.println("update...");
		
		String msg = JOptionPane.showInputDialog("1.Delete, 2.Insert, 3.List, 4.Upadate");
		
		switch(msg) {
		case "1":
			delete.exec();
			break;
		case "2":
			insert.exec();
			break;
		case "3":
			break;
		case "4":
			update.exec();
			break;
		default:
			System.out.println("잘못입력했습니다.");
		}
	}
}

@FunctionalInterface
interface Command {
	void exec();
	
	default public void base() { //확장을 편하게 하기위해 default 사용  
		System.out.println("~~~~");
	}
}