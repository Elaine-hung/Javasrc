import java.util.Iterator;

public class TestStringBuilder {

	public static void main(String[] args) {
			
			String hello = "hello";//pool
			String world = "world";//pool
			String helloworld = "helloworld";//pool
			
			String hw = hello + world;
			
			System.out.println(hw == helloworld);//記憶體位置不同
			//hw= new String("helloworld");//heap區裡
			String	temp	="";
			for (int  i= 0;i<10;i++) {
				temp= temp +i;
				//i=0,temp=""+0="0"
				//i=1,temp="0"+1="01"...
				
			}
			System.out.println(temp);
			//大量文字串接請用StringBuilder,不要用加號
			StringBuilder builder =new StringBuilder();
			for(int i=0;i<10;i++) {
				builder.append(i);
			}
			System.out.println(builder.toString());
			
			

	}

}
