package homework;

import java.util.Scanner;

public class ������ {

	public static void main(String[] args) {
		System.out.println("��������Ҫ��Ŀ�����");
		Scanner sc =new Scanner(System.in) ;
		double p=sc.nextDouble();
		if(p>5000) {
			double a=50;
			System.out.println("��Ӧ�ø��Ļ�����Ϊ"+a+"Ԫ��");
		}else if(p>100) {
			double a=p*0.01;
			System.out.println("��Ӧ�ø��Ļ�����Ϊ"+a+"Ԫ��");
		}else {
			double a=1;
			System.out.println("��Ӧ�ø��Ļ�����Ϊ"+a+"Ԫ��");
		}

	}

}
