package ch02;
import java.util.Scanner;

public class E05 {
	public E05() {}
	public void run() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("�� ������ �Է��ϼ���>>");
		boolean a = scanner.nextBoolean();
		String op = scanner.next();
		boolean b = scanner.nextBoolean();
		
		switch(op) {
		case "AND": System.out.println("false");
		break;
		case "OR": System.out.println("true");	
		break;
		default:  System.out.println("�Է� ���� �߸� �Ǿ����ϴ� �ٽ� Ȯ�����ּ���.");
		}
		scanner.close();

	}
	public static void main(String[] args) {
			E05 add  = new E05();
			add.run();

	}

}
