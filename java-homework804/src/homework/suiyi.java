package homework;

public class suiyi {

	public static void main(String[] args) {
		int high=10;
        if (  high % 2 == 0) {
            high++; // 计算菱形大小
        }
        for (int i = 0; i < high / 2 + 1; i++) {
            for (int j = high / 2 + 1; j > i + 1; j--) {
                System.out.print(" "); // 输出左上角位置的空白
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*"); // 输出菱形上半部边缘
            }
            System.out.println(); // 换行
        }

	}

}
