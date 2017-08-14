package homework;

public class 百马问题 {

	public static void main(String[] args) {
		for(int a=0;a<34;a++) {
			for(int b=0;b<=50;b++) {
				for(int c=0;c<=100;c+=2) {
					if(a+b+c==100 && (3*a+2*b+0.5*c==100)) {
						System.out.println("大马的数量为："+a+"中马的数量为："+b+"小马的数量为："+c);
					}
				}
			}
		}
	}
}
