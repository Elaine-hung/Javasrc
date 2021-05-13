
public class TestString1 {

	public static void main(String[] args) {

		String name = "vincent";// pool會產生vincent字, 回傳記憶體位置給name變數
		String name1 = "vincent";// 第二次再要, pool直接回傳vincent記憶體位置給name1, 不會再產生新的字

		// name = "vincent1";// immutable; 會在pool區產生新的vincent1
		String name2 = new String("vincent");// new 會產生在heap區, 不會在pool內

		System.out.println(name == name1);

		System.out.println(name2 == name1);// heap(new) != pool("")
		// 使用 "==" :表示比較記憶體中的位置, name2(vincent)位置 != name1(vincent)
		System.out.println("equals=" + name2.equals(name1));// 文字逐字比較,要用equals()

		System.out.println("中文.abc".length());// 中文.abc: 6個字
		System.out.println(name.length());// vincent: 7個字

		System.out.println("中文abc".indexOf("中"));// 第一個字位置是0; 找不到回傳-1
		System.out.println("中文abc".contains("文"));// true or false, 表示有無包含此文字

		System.out.println("中文abc".substring(1));// 截字
		System.out.println("中文abc".substring(1, 4));// 含第一格, 不含第二格

		System.out.println(String.format("Hello World %10s", " Davids"));// %s表示文字
		System.out.println(String.format("%.4f", 10 / 3.0));// 只取小數點後四位，第五位四捨五入
		System.out.println(String.format("%.12f", 10/3.0));
		
		System.out.println(String.format("aaa bbb %.12d%%", 10));
		System.out.printf("aaa bbb %.12d%%", 10);

	}

}
