package homework;

public class ���� {
    public static void main(String[] args) {
        print(10); // ��� 10 �е�����
    }
 
    public static void print(int high) {
        if (high % 2 == 0) {
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
        for (int i = high / 2 + 1; i < high; i++) {
            for (int j = 0; j < i - high / 2; j++) {
                System.out.print(" "); // ����������½ǿհ�
            }
            for (int j = 0; j < 2 * high - 1 - 2 * i; j++) {
                System.out.print("*"); // ��������°벿��Ե
            }
            System.out.println(); // ����
        }
    }
}