package homework;

import java.util.Scanner;

public class �ж�������� {

	public static void main(String[] args) {
		System.out.println("������һ�����֣�");
		Scanner sc =new Scanner(System.in) ;
		int a=sc.nextInt();
		if(a%30==0) {
			System.out.println("������ܱ�5��6ͬʱ������");
		}else if(a%5==0) {
			System.out.println("�����ֻ�ܱ�5������");
		}else if(a%6==0) {
			System.out.println("�����ֻ�ܱ�6������");
		}else {
				System.out.println("��������ܱ�5��6������");
		}
	}

}
