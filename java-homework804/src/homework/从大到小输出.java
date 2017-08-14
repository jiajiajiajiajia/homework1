package homework;

import java.util.Scanner;

public class 从大到小输出 {

	public static void main(String[] args) {
		System.out.println("请输入三个数字：");
		Scanner sc =new Scanner(System.in) ;
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		
		if(a<b) {
			a=a+b;
			b=a-b;
			a=a-b;
		}
		if(a<c) {
			a=a+c;
			c=a-c;
			a=a-c;
		}
		if(b<c) {
			c=c+b;
			b=c-b;
			c=c-b;
		}
		System.out.println("三个数字从大到小排列为："+a+">"+b+">"+c);

	}

}
