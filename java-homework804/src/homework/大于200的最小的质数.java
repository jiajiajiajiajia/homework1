package homework;
//�ҵ�����200�ĵ�һ������
import java.util.Scanner;

public class ����200����С������ {

	public static void main(String[] args) {	
		
	    //����һ.
//		System.out.println("��������Ҫ������֣�");
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
		System.out.println("����������С�������ǣ�"+p);
		
		//����2��
		int n=201,i;
        outer:
        for(;;n++){
            for(i=2;i*i<=n;i++){
            	if(n%i==0) {continue outer;}
            }
            break;
        }
        System.out.println("����������С�������ǣ�"+n);
   
		
		
		
	 }

}
