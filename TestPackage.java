
import category.Item;//改為catagory.*表示引用整個檔案
public class TestPackage {

	public static void main(String[] args) {
		Item item = new Item();
        item.name = "Asus notebook";
        System.out.println("TestPackage's main : " + item.name);

	}

}
