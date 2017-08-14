package homework;

public class 三角形 {

	public static void main(String[] args) {
		//方法一：
	 for(int i=1;i<=5;i++){
		 for(int j=5; i<=j; j--)
			 System.out.print(" ");
		 for(int j=1; j<=i; j++)
			 System.out.print("*");
		 for(int j=1; j<i; j++)
			 System.out.print("*");
		 System.out.println();
		 } 
	 
	 //算法二
	 
	
    
     for (int i = 0; i < 5; i++) {
         for (int j = 5; j > i + 1; j--) {
             System.out.print(" "); // 输出左上角位置的空白
         }
         for (int j = 0; j < 2 * i + 1; j++) {
             System.out.print("*"); // 输出上三角形
         }
         System.out.println(); // 换行
     }
     //倒三角
     System.out.println();
     for (int i =6; i < 10; i++) {
         for (int j = 0; j < i - 5; j++) {
             System.out.print(" "); // 输出菱形左下角空白
         }
         for (int j = 0; j < 19 - 2 * i; j++) {
             System.out.print("*"); // 输出下三角形
         }
         System.out.println(); // 换行
     }

	}

}
