package homework;

import java.util.Scanner;

public class ��Ч���� {

	public static void main(String[] args) {
		System.out.println("���������ĳɼ���");
		Scanner sc =new Scanner(System.in) ;
		int a=sc.nextInt();
		if(a>0 && a<=100) {
			int b=a/10;
			switch(b) {
			case 1:System.out.println("��ĳɼ��ȼ��ǣ�E");break;
			case 2:System.out.println("��ĳɼ��ȼ��ǣ�E");break;
			case 3:System.out.println("��ĳɼ��ȼ��ǣ�E");break;
			case 4:System.out.println("��ĳɼ��ȼ��ǣ�E");break;
			case 5:System.out.println("��ĳɼ��ȼ��ǣ�E");break;
			case 6:System.out.println("��ĳɼ��ȼ��ǣ�D");break;
			case 7:System.out.println("��ĳɼ��ȼ��ǣ�C");break;
			case 8:System.out.println("��ĳɼ��ȼ��ǣ�B");break;
			case 9:System.out.println("��ĳɼ��ȼ��ǣ�A");break;
			case 10:System.out.println("��ĳɼ��ȼ��ǣ�A");break;
			}
		}else {
			System.out.println("������ĳɼ�����");
			
		}
	}

}
