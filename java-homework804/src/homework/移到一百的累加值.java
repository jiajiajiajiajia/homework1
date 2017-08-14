package homework;

public class 移到一百的累加值 {

	public static void main(String[] args) {
		//移到一百的累加值，除去各位数为3的数字
		int sum=0;
		for(int i=0;i<101;i++) {
			if((i-3)%10==0) {
				continue;
			}
			sum=sum+i;
		}System.out.println("1到100内除了个位数是3的其他所有数的和为："+sum);

	}

}
