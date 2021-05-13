import java.util.Iterator;

public class Test9x9 {

	public static void main(String[] args) {
		// ixj
		// 1x1=1 1x2=2 1x3=3 ... 1x9=9
		// 2x1=2 2x2=4 2x3=6 ... 2x9=18

		for (int i = 1; i <= 9; i++) {

			for (int j = 1; j <= 9; j++) {
				System.out.print(i + "x" + j + "=" + (i * j) + " ");// ln:line 換行的意思所以刪掉後就不會換行
			}
			System.out.println();
		}

	}
}
