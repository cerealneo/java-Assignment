package ch02;
import java.util.Scanner;

public class D04 {
	public D04() {}
	public void run() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("�� (X,Y)�� ��ǥ�� �Է��ϼ���>>");
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		
		if(x>=50&& x<=100 && y>=50&& y<=100)
			
			System.out.println("�� (" + x +"," +y + ")�� (50,50)�� (100,100)�� �簢�� ���� �ֽ��ϴ�");

		else 
			System.out.println("�� (" + x +"," +y + ")�� (50,50)�� (100,100)�� �簢�� ���� �����ϴ�");
		scanner.close();
	}

	public static void main(String[] args) {
		D04 add  = new D04();
		add.run();

	}

}
