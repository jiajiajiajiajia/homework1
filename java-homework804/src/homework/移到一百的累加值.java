package homework;

public class �Ƶ�һ�ٵ��ۼ�ֵ {

	public static void main(String[] args) {
		//�Ƶ�һ�ٵ��ۼ�ֵ����ȥ��λ��Ϊ3������
		int sum=0;
		for(int i=0;i<101;i++) {
			if((i-3)%10==0) {
				continue;
			}
			sum=sum+i;
		}System.out.println("1��100�ڳ��˸�λ����3�������������ĺ�Ϊ��"+sum);

	}

}
