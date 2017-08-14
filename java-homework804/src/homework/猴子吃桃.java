package homework;

public class 猴子吃桃 {

	public static void main(String[] args) {
		int a=1,i=1;
		System.out.println("第10天早上还剩的桃子数量为："+a);
		while(i<10) {
		    a=(a+1)*2;
			int j=10-i;
			System.out.println("第"+j+"天早上还剩的桃子数量为："+a);
			i++;
		}
	}

}
