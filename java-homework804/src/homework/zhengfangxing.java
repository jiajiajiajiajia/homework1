package homework;

public class zhengfangxing {
	public static void main(String[] args) {
		
		for(int i=1;i<=8;i++) {
			for(int j=1 ;j<=15;j++) {
				if(i==1 || i==8 || j==15 || j==1) {
					System.out.print(".");
				}else {
					System.out.print(" ");
				}				
			}
		System.out.println();
		}
	}
}
