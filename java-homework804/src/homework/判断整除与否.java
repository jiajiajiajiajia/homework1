package homework;

import java.util.Scanner;

public class 判断整除与否 {

	public static void main(String[] args) {
		System.out.println("请输入一个数字：");
		Scanner sc =new Scanner(System.in) ;
		int a=sc.nextInt();
		if(a%30==0) {
			System.out.println("这个数能被5和6同时整除。");
		}else if(a%5==0) {
			System.out.println("这个数只能被5整除。");
		}else if(a%6==0) {
			System.out.println("这个数只能被6整除。");
		}else {
				System.out.println("这个数不能被5和6整除。");
		}
	}

}
