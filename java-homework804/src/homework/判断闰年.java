package homework;

import java.util.Scanner;

public class 判断闰年 {

	public static void main(String[] args) {
		System.out.println("请输入一个年份：");
		Scanner sc =new Scanner(System.in) ;
		int a=sc.nextInt();
		if(a%100==0) {
			if(a%400==0) {System.out.println("这一年为闰年。");}
			else {System.out.println("这一年不是闰年。"); }
		}else if (a%4==0 ){
			System.out.println("这一年是闰年。");
		}else {
			System.out.println("这一年不是闰年。");
		}

	}

}
