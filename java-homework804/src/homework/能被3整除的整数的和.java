package homework;

public class 能被3整除的整数的和 {

	public static void main(String[] args) {
		int sum=0;
		//for 循环
		for(int i=1;i<=100;i++) {
			if(i%3==0) {
				sum=i+sum;
			}
		}System.out.println("从1到100之间能整除3的所有整数的和为："+sum);
		//while循环
		int i=1;
		while(i==101){
			for( i=1;i<=100;i++) {
				if(i%3==0) {
					sum=i+sum;
				}
			}
		}System.out.println("从1到100之间能整除3的所有整数的和为："+sum);
		//do 循环
		do {
			if(i%3==0) {
				sum=i+sum;
			}
			i++;
		}while (i==101);
		System.out.println("从1到100之间能整除3的所有整数的和为："+sum);
		
	}

}
