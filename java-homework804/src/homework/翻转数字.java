package homework;

import java.util.Scanner;

public class ��ת���� {

	public static void main(String[] args) {
		System.out.println("��������Ҫ������֣�");
		Scanner sc =new Scanner(System.in) ;
		int p=sc.nextInt();
		int a=p/1000;
		int b=(p-a*1000)/100;
		int c=(p-a*1000-b*100)/10;
		int d=p-a*1000-b*100-c*10;
		//������һλ�͵���λ��
		a=a+d;
		d=a-d;
		a=a-d;
		//�����ڶ�λ�͵���λ��
		c=c+b;
		b=c-b;
		c=c-b;
		System.out.println("�����������Ϊ��"+a+b+c+d);

	}

}
