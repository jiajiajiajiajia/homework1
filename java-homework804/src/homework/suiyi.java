package homework;

public class suiyi {

	public static void main(String[] args) {
		int high=10;
        if (  high % 2 == 0) {
            high++; // �������δ�С
        }
        for (int i = 0; i < high / 2 + 1; i++) {
            for (int j = high / 2 + 1; j > i + 1; j--) {
                System.out.print(" "); // ������Ͻ�λ�õĿհ�
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*"); // ��������ϰ벿��Ե
            }
            System.out.println(); // ����
        }

	}

}
