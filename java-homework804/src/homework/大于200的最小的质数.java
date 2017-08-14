package homework;
//找到大于200的第一个质数
import java.util.Scanner;

public class 大于200的最小的质数 {

	public static void main(String[] args) {	
		
	    //方法一.
//		System.out.println("请输入您要算的数字：");
//		Scanner sc =new Scanner(System.in) ;
//		int p=sc.nextInt();
		int p=200;
		for(;; p++) {
			boolean b = true;
			for(int i=2; i<p/2; i++) {
				if(p % i == 0) { b = false;break;}
				}
			if(!b) {continue;}
			
			break;
		}
		System.out.println("大于它的最小的质数是："+p);
		
		//方法2：
		int n=201,i;
        outer:
        for(;;n++){
            for(i=2;i*i<=n;i++){
            	if(n%i==0) {continue outer;}
            }
            break;
        }
        System.out.println("大于它的最小的质数是："+n);
   
		
		
		
	 }

}
