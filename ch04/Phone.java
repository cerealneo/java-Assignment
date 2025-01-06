package ch4;

import java.util.Scanner;

public class Phone {
	private String name, tel;
	
	public Phone(String name, String tel) { 
		this.name = name; 
		this.tel = tel;
		}
	
	public String getName() { return name; }
	public String getTel() { return tel; }


	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("�̸��� ��ȭ��ȣ �Է� >>");
		Phone first = new Phone(scanner.next(),scanner.next());
		System.out.print("�̸��� ��ȭ��ȣ �Է� >>");
		Phone second = new Phone(scanner.next(),scanner.next());
		
		System.out.println(first.getName() + "�� ��ȣ " + first.getTel());
		System.out.println(second.getName() + "�� ��ȣ " + second.getTel());
		scanner.close();
	}

}
