package ch02;
import java.util.Scanner;

public class A81 {
	public A81() {}
	public void run() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Ŀ�� �ֹ��ϼ���>>");
		String coffee = scanner.next();
		int count = scanner.nextInt();
		
		if(coffee.equals("����������"))
			System.out.println(2000*count + "���Դϴ�.");
		else if(coffee.equals("�Ƹ޸�ī��"))
			System.out.println(2500*count + "���Դϴ�.");
		else if(coffee.equals("īǪġ��"))
			System.out.println(3000*count + "���Դϴ�.");
		else if(coffee.equals("ī���"))
			System.out.println(3500*count + "���Դϴ�.");
		else System.out.println(coffee + "�� ���� �޴��Դϴ�.");
		scanner.close();
	}
	
	public static void main(String[] args) {
		A81 add  = new A81();
		add.run();

	}

}
