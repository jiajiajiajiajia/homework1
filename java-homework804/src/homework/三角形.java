package homework;

public class ������ {

	public static void main(String[] args) {
		//����һ��
	 for(int i=1;i<=5;i++){
		 for(int j=5; i<=j; j--)
			 System.out.print(" ");
		 for(int j=1; j<=i; j++)
			 System.out.print("*");
		 for(int j=1; j<i; j++)
			 System.out.print("*");
		 System.out.println();
		 } 
	 
	 //�㷨��
	 
	
    
     for (int i = 0; i < 5; i++) {
         for (int j = 5; j > i + 1; j--) {
             System.out.print(" "); // ������Ͻ�λ�õĿհ�
         }
         for (int j = 0; j < 2 * i + 1; j++) {
             System.out.print("*"); // �����������
         }
         System.out.println(); // ����
     }
     //������
     System.out.println();
     for (int i =6; i < 10; i++) {
         for (int j = 0; j < i - 5; j++) {
             System.out.print(" "); // ����������½ǿհ�
         }
         for (int j = 0; j < 19 - 2 * i; j++) {
             System.out.print("*"); // �����������
         }
         System.out.println(); // ����
     }

	}

}
