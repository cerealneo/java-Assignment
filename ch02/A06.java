package ch02;
import java.util.Scanner;

public class A06 {
	public A06() {}
	public void run() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("���� �׼��� �Է��ϼ���>>");
		int money = scanner.nextInt();
		
		switch (money / 50000)
        {
        case 0:
            System.out.print("������ 0��, ");
            break;

        default:
            int n50000 = money / 50000;
            money = money % 50000;
            System.out.print("������" + n50000 + "��, ");
            break;
        }

        switch (money / 10000)
        {
        case 0:
            System.out.print("���� 0��, ");
            break;

        default:
            int n10000 = money / 10000;
            money = money % 10000;
            System.out.print("����" + n10000 + "��, ");
            break;
        }
switch (money / 1000)
        {
        case 0:
            System.out.print("õ�� 0��, ");
            break;

        default:
            int n1000 = money / 1000;
            money = money % 1000;
            System.out.print("õ��" + n1000 + "��, ");
            break;
        }

        switch (money / 500)
        {
        case 0:
            System.out.print("500�� 0��, ");
            break;

        default:
            int n500 = money / 500;
            money = money % 500;
            System.out.print("500��" + n500 + "��, ");
            break;
        }

        switch (money / 100)
        {
        case 0:
            System.out.print("100�� 0��, ");
            break;

        default:
            int n100 = money / 100;
            money = money % 100;
            System.out.print("100��" + n100 + "��, ");
            break;
        }

        switch (money / 10)
        {
        case 0:
            System.out.print("10�� 0��, ");
            break;

        default:
            int n10 = money / 10;
            money = money % 10;
            System.out.print("10��" + n10 + "��, ");
            break;
        }

        switch (money / 1)
        {
        case 0:
            System.out.println("1�� 0��");
            break;

        default:
            System.out.println("1��" + money + "��");
            break;
        }

        scanner.close();
		
	}
	
	public static void main(String[] args) {
		A06 add  = new A06();
		add.run();

	}

}
