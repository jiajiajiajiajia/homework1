package homework;

public class һ�����ڵ������ͺ�ż���� {

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
		System.out.println("������Ϊ"+sum2);
		System.out.println("ż����Ϊ"+sum1);

	}

}
