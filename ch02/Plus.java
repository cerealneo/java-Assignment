package ch02;

import java.util.Scanner;

public class Plus {
	public Plus() {}
	public void run() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("�� ������ �Է��ϼ���>>");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
	    int sum = a+b;
	    
	    System.out.println(a+" + "+b+" �� "+sum);
	    scanner.close();
	}

	public static void main(String[] args) {
		Plus add  = new Plus();
		add.run();

	}

}
