package homework;

import java.util.Scanner;

public class �׳� {

	public static void main(String[] args) {
		System.out.println("��������Ҫ������֣�");
		Scanner sc =new Scanner(System.in) ;
		int p=sc.nextInt();
		int c=p;
		int product=1;
		for(int i=1;i<=c;i++) {
			product= product*p;
			p-=1;
		}
		System.out.println("���Ľ׳��ǣ�"+product);

	}

}
