package ch02;
import java.util.Scanner;

public class A82 {
	public A82() {}
	public void run() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Ŀ�� �ֹ��ϼ���>>");
		String coffee = scanner.next();
		int count = scanner.nextInt();
		
		switch(coffee) {
		case "����������":
			System.out.println(2000*count + "���Դϴ�.");
			break;
		case "�Ƹ޸�ī��":
			System.out.println(2500*count + "���Դϴ�.");
			break;
		case "īǪġ��":
			System.out.println(3000*count + "���Դϴ�.");
			break;
		case "ī���":
			System.out.println(3500*count + "���Դϴ�.");
			break;
		default: System.out.println(coffee + "�� ���� �޴��Դϴ�.");
		
		}
		scanner.close();
	}
	
	public static void main(String[] args) {
		A82 add  = new A82();
		add.run();

	}
}
