package homework;

public class �ܱ�3�����������ĺ� {

	public static void main(String[] args) {
		int sum=0;
		//for ѭ��
		for(int i=1;i<=100;i++) {
			if(i%3==0) {
				sum=i+sum;
			}
		}System.out.println("��1��100֮��������3�����������ĺ�Ϊ��"+sum);
		//whileѭ��
		int i=1;
		while(i==101){
			for( i=1;i<=100;i++) {
				if(i%3==0) {
					sum=i+sum;
				}
			}
		}System.out.println("��1��100֮��������3�����������ĺ�Ϊ��"+sum);
		//do ѭ��
		do {
			if(i%3==0) {
				sum=i+sum;
			}
			i++;
		}while (i==101);
		System.out.println("��1��100֮��������3�����������ĺ�Ϊ��"+sum);
		
	}

}
