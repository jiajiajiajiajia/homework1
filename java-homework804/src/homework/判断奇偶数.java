package homework;

import java.util.Scanner;

public class 判断奇偶数 {
	public static void main(String[] args) {
		System.out.println("请输入一个数字：");
		Scanner sc =new Scanner(System.in) ;
		int a=sc.nextInt();
		if (a%2==1) {
			System.out.println("这个数字是奇数。");
		}else {
			System.out.println("这个数字是偶数。");
		}
	}
}
