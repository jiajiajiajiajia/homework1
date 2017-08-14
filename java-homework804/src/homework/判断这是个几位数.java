package homework;

import java.util.Scanner;

public class 判断这是个几位数 {

	public static void main(String[] args) {
		System.out.println("请输入数字：");
		Scanner sc =new Scanner(System.in) ;
		int p=sc.nextInt();
		if(p>=10000 && p<100000) {
			int a=p/10000;
			int b=(p-a*10000)/1000;
			int c=(p-a*10000-b*1000)/100;
			int d=(p-a*10000-b*1000-c*100)/10;
			int e=p-a*10000-b*1000-c*100-d*10;
			System.out.println("这是个五位数，各位数字依次是："+a+" 、"+b+" 、"+c+" 、"+d+" 、"+e);
		}
		else if(p>=1000 && p<10000) {
			int a=p/1000;
			int b=(p-a*1000)/100;
			int c=(p-a*1000-b*100)/10;
			int d=p-a*1000-b*100-c*10;
			System.out.println("这是个四位数，各位数字依次是："+a+" 、"+b+" 、"+c+" 、"+d);
		}else if(p>=100) {
			int a=p/100;
			int b=(p-a*100)/10;
			int c=p-a*1000-b*10;
			System.out.println("这是个三位数，各位数字依次是："+a+" 、"+b+" 、"+c);
		}else if(p>=10) {
			int a=p/10;
			int b=p-a*10;
			System.out.println("这是个两位数，各位数字依次是："+a+" 、"+b);
		}else if(p>=0 && p<10) {
			
			System.out.println("这个数字是个个位数，它是："+p);
		}else {
			System.out.println("您输入的数字不符合判定条件。");
		}

	}

}
