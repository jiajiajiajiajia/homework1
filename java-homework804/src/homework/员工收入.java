package homework;

public class Ա������ {

	public static void main(String[] args) {
		int j=0;
		double gongzi=30000,sum=gongzi;
		System.out.println("��λԱ����1��Ĺ���Ϊ��"+gongzi);
		for(j=2;j<=10;j++) {
			
			gongzi=gongzi*1.06;
			System.out.println("��λԱ����"+j+"��Ĺ���Ϊ��"+gongzi);
			sum=gongzi+sum;
		}
		System.out.println("��ʮ��Ĺ����ܺ�Ϊ��"+sum);
	}

}
