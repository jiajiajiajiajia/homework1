package homework;

import java.util.Scanner;

public class �ж����� {

	public static void main(String[] args) {
		System.out.println("������һ����ݣ�");
		Scanner sc =new Scanner(System.in) ;
		int a=sc.nextInt();
		if(a%100==0) {
			if(a%400==0) {System.out.println("��һ��Ϊ���ꡣ");}
			else {System.out.println("��һ�겻�����ꡣ"); }
		}else if (a%4==0 ){
			System.out.println("��һ�������ꡣ");
		}else {
			System.out.println("��һ�겻�����ꡣ");
		}

	}

}
