package homework;

import java.util.Scanner;

public class 汇款汇率 {

	public static void main(String[] args) {
		System.out.println("请输入您要汇的款数：");
		Scanner sc =new Scanner(System.in) ;
		double p=sc.nextDouble();
		if(p>5000) {
			double a=50;
			System.out.println("您应该付的汇款费用为"+a+"元。");
		}else if(p>100) {
			double a=p*0.01;
			System.out.println("您应该付的汇款费用为"+a+"元。");
		}else {
			double a=1;
			System.out.println("您应该付的汇款费用为"+a+"元。");
		}

	}

}
