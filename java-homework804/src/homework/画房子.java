package homework;

public class »­·¿×Ó {

	public static void main(String[] args) {
		 for(int i=1;i<=5;i++){
			 for(int j=5; i<=j; j--)
				 System.out.print(" ");
			 for (int j=1;j<=5-i;j++) {
					System.out.print(" ");
				}
			for(int c=1;c<=5;c++) {
					System.out.print(".");
				}
			 for(int j=1; j<i; j++)
				 System.out.print(" ");
			 for(int j=0; j<i; j++)
				 System.out.print(".");
			 System.out.println();
		 }

		
		
//		for(int b=2;b<=6;b++) {
//			for(int c=4;c<=12;c++) {
//				System.out.print("*");
//			}System.out.println("");
//		}
		
		
		
		
		
		
		for(int a=1;a<=5;a++) {
			for(int b=1 ;b<=15;b++) {
				if(a==1 || a==5 || b==15|| b==1) {
					System.out.print(".");
				}else {
					System.out.print(" ");
				}				
			}
		System.out.println();
		}

	}

}
