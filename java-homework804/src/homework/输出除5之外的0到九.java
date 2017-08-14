package homework;

public class 输出除5之外的0到九 {

	public static void main(String[] args) {
		for (int i=1;i<=9;i++) {
			if(i==5) {
				continue;
			}
			System.out.println(i);
		}

	}

}
