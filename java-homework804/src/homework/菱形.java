package homework;

public class 菱形 {
    public static void main(String[] args) {
        print(10); // 输出 10 行的菱形
    }
 
    public static void print(int high) {
        if (high % 2 == 0) {
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
        for (int i = high / 2 + 1; i < high; i++) {
            for (int j = 0; j < i - high / 2; j++) {
                System.out.print(" "); // 输出菱形左下角空白
            }
            for (int j = 0; j < 2 * high - 1 - 2 * i; j++) {
                System.out.print("*"); // 输出菱形下半部边缘
            }
            System.out.println(); // 换行
        }
    }
}