import java.util.Iterator;

public class TestFor {

	public static void main(String[] args) {
		for (int i = 1; i <= 100; i++) {
			System.out.println(i);
		}
		// System.out.println("finally i="+ i);//101,int i=1要移到for上面
		;

		int sum = 0;
		for (int i = 1; i <= 100; i = i + 2) { // 或者不要改i=i+2,下面在加一個if
			System.out.println(i);
			sum = sum + i;
			// int sum=0;
			// for (int i=1; i<=100 && i%2==1;i++) {
			// System.out.println(i);
			// sum =sum+i; =>結果總和會是1，因為2的時候i%2==1會報錯，for迴圈就會停止
			// sum =sum+i; =>結果總和會是1，因為2的時候i%2==1會報錯，for迴圈就會停止
			// i=1, sum = 0+1=1
			// i=2, sum = 1+2=3
			// i=3, sum = 3+3=6

		}
		System.out.println("總和=" + sum);

		int sum1 = 0;
		for (int ii = 1; ii <= 100; ii++) {
			if (ii % 2 == 0) {
				continue;
			}
			if (ii >= 50) {
				break;
			}
			System.out.println(ii);
			sum1 = sum1 + ii;
		}
		System.out.println("總和=" + sum1);
//		System.out.println("finally i="+i);//101

		int i = 1;
		int sumOfwhile = 0;
		while (i <= 100) {
			sumOfwhile = sumOfwhile + i;
			i++;// 計數字加一
		}
		System.out.println("While總和=" + sumOfwhile);

		int j = 1;// 如果j=101最後結果會是101，因為還是會跑一次do
		int sumOfDowhile = 0;
		do {
			sumOfDowhile = sumOfDowhile + j;
			j++;
		} while (j <= 100);
		System.out.println(j);
		System.out.println(sumOfDowhile);//如果sumOfDowhile=sumOfDowhile+1 最後會是100
		System.out.println("Do While 總和=" + sumOfDowhile);

	}

}
