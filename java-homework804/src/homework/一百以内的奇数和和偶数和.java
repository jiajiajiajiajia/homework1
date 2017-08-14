package homework;

public class 一百以内的奇数和和偶数和 {

	public static void main(String[] args) {
		int sum1=0;
		int sum2=0;
		for(int i=0;i<=100;i++) {
			if(i%2==0) {
				sum1=sum1+i;continue;
			}else {
				sum2=sum2+i;continue;
			}
		}
		System.out.println("奇数和为"+sum2);
		System.out.println("偶数和为"+sum1);

	}

}
