package homework;

public class 员工收入 {

	public static void main(String[] args) {
		int j=0;
		double gongzi=30000,sum=gongzi;
		System.out.println("这位员工第1年的工资为："+gongzi);
		for(j=2;j<=10;j++) {
			
			gongzi=gongzi*1.06;
			System.out.println("这位员工第"+j+"年的工资为："+gongzi);
			sum=gongzi+sum;
		}
		System.out.println("这十年的工资总和为："+sum);
	}

}
