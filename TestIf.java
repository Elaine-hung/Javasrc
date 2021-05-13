
public class TestIf {

	public static void main(String[] args) {
		
		int	age=40;
		if(age >=30) {//先打一個括號，按enter,自動幫你補另一個括號
			System.out.println("壯年");
		}else if (age >=18) {
			System.out.println("成年");//alt+up down:移程式
		}else {
			System.out.println("未成年");
		}
		
		
		int age1=40;
		if (age1>=18) {
			System.out.println("成年");
			if (age1>=30) {
				System.out.println("壯年");
			}else {
				System.out.println("未成年");
			}
		}
//ctrl+shift+f:整理		
		
		int	classroom=204;
		switch (classroom) {
		case 204:
			System.out.println("人數大於等於30人");
			break;
		case 305:
			System.out.println("人數小於30大於等於20人");
			break;

		default:
			System.out.println("default 其他");
			
		}
		
	}

}
