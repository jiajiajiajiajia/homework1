package homework;

import java.util.Scanner;

public class chengjidengji {
	public static void main(String[] args) {
		int grade=0;
		System.out.println("���������ĳɼ���");
		Scanner sc =new Scanner(System.in) ;
		grade=sc.nextInt();
		int a=grade/10;
		switch(a) {
		case 1:System.out.println("��ĳɼ��ȼ��ǣ�E");break;
		case 2:System.out.println("��ĳɼ��ȼ��ǣ�E");break;
		case 3:System.out.println("��ĳɼ��ȼ��ǣ�E");break;
		case 4:System.out.println("��ĳɼ��ȼ��ǣ�E");break;
		case 5:System.out.println("��ĳɼ��ȼ��ǣ�E");break;
		case 6:System.out.println("��ĳɼ��ȼ��ǣ�D");break;
		case 7:System.out.println("��ĳɼ��ȼ��ǣ�C");break;
		case 8:System.out.println("��ĳɼ��ȼ��ǣ�B");break;
		case 9:System.out.println("��ĳɼ��ȼ��ǣ�A");break;
		}
	}
}
