package homework;

import java.util.Scanner;

public class 翻转数字 {

	public static void main(String[] args) {
		System.out.println("请输入您要算的数字：");
		Scanner sc =new Scanner(System.in) ;
		int p=sc.nextInt();
		int a=p/1000;
		int b=(p-a*1000)/100;
		int c=(p-a*1000-b*100)/10;
		int d=p-a*1000-b*100-c*10;
		//交换第一位和第四位数
		a=a+d;
		d=a-d;
		a=a-d;
		//交换第二位和第三位数
		c=c+b;
		b=c-b;
		c=c-b;
		System.out.println("调换后的数字为："+a+b+c+d);

	}

}
