package homework;

import java.util.Scanner;

public class 有效分数 {

	public static void main(String[] args) {
		System.out.println("请输入您的成绩：");
		Scanner sc =new Scanner(System.in) ;
		int a=sc.nextInt();
		if(a>0 && a<=100) {
			int b=a/10;
			switch(b) {
			case 1:System.out.println("你的成绩等级是：E");break;
			case 2:System.out.println("你的成绩等级是：E");break;
			case 3:System.out.println("你的成绩等级是：E");break;
			case 4:System.out.println("你的成绩等级是：E");break;
			case 5:System.out.println("你的成绩等级是：E");break;
			case 6:System.out.println("你的成绩等级是：D");break;
			case 7:System.out.println("你的成绩等级是：C");break;
			case 8:System.out.println("你的成绩等级是：B");break;
			case 9:System.out.println("你的成绩等级是：A");break;
			case 10:System.out.println("你的成绩等级是：A");break;
			}
		}else {
			System.out.println("您输入的成绩有误。");
			
		}
	}

}
