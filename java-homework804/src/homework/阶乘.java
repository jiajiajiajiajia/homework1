package homework;

import java.util.Scanner;

public class 阶乘 {

	public static void main(String[] args) {
		System.out.println("请输入您要算的数字：");
		Scanner sc =new Scanner(System.in) ;
		int p=sc.nextInt();
		int c=p;
		int product=1;
		for(int i=1;i<=c;i++) {
			product= product*p;
			p-=1;
		}
		System.out.println("它的阶乘是："+product);

	}

}
