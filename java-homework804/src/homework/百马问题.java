package homework;

public class �������� {

	public static void main(String[] args) {
		for(int a=0;a<34;a++) {
			for(int b=0;b<=50;b++) {
				for(int c=0;c<=100;c+=2) {
					if(a+b+c==100 && (3*a+2*b+0.5*c==100)) {
						System.out.println("���������Ϊ��"+a+"���������Ϊ��"+b+"С�������Ϊ��"+c);
					}
				}
			}
		}
	}
}
