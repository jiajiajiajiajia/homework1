package homework;

import java.util.Scanner;

public class ticheng {

	public static void main(String[] args) {
		double money=0,sum=0;
		System.out.println("请输入公司本月的利润（单位为万）：");
		Scanner sc =new Scanner(System.in) ;
		money=sc.nextInt();
		if(money<=10) {
			sum=money*0.1;
		}else if(money<=20 && money>10) {
			sum=1+(money-10)*0.075;
		}else if(money<=40 && money>20) {
			sum=1.75+(money-20)*0.05;
		}else if(money<=60 && money>40) {
			sum=2.75+(money-40)*0.03;
		}else if(money<=100 && money>60) {
			sum=2.35+(money-60)*0.015;
		}else if(money<=100) {
			sum=2.95+(money-100)*0.01;
		}
		System.out.println("本月你可以获得的提成为："+sum+"万");
			

	}

}
