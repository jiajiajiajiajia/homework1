package homework;

import java.util.Scanner;

public class 判断数字 {

	public static void main(String[] args) {
		System.out.println("请输入一个：");
		Scanner sc =new Scanner(System.in) ;
		int a=sc.nextInt();
		if(a==1 || a==5 || a==10)
		{
			System.out.println("x="+a);
		}else {
			System.out.println("x=none");
		}

	}

}
