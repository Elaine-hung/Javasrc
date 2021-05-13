
public class TestBasic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{
			long salary	=100000;
			System.out.println("salary=" + salary );
//		salary	=50000;
		}
		//System.out.println(salary);在括號外所以跑錯誤
		int	i,j,k;
		i=10;
		System.out.println("i="+i);
		System.out.println(2234567809L);
		//long(8byte)
		//int range +-21e
		
		long	a	=2000000000;//int	:+-21e
		long	b	=a	+a;//40e overflow
		System.out.println("b="+b);
		
		char	c='字';//單引號,字元,雙引號叫字串，多個字元，後面會介紹
		System.out.println(c);
		boolean	d=false;//true,1 bit
		System.out.println(d);
		//8基本型態，4整數,2浮點數(float,double),char,boolean
		
		System.out.println("\"HelloWorld\"");
		System.out.println("\\HelloWorld\\");
		System.out.println("Hello\r\nWorld");
		
		int	x=10;
		int	y=3;
		int	z=x*y;
		System.out.println("z="+z);
		
		System.out.println( x /y );
		
		short	xx=10;
		short	yy=3;//short:(2)
		int	zz=xx+yy;//int(4) 雖然兩個都是short,至少要是int,運算至少要'有int相同運算元運算至少為int
		
		double	xxx=10.0;
		int	yyy=5;
		double zzz=	xxx+yyy;//double + int=>double+double=>double
		System.out.println("zzz=" +zzz);

		double	ccc=10.0;
		int	aaa=	(int)ccc;//強制轉型
		System.out.println("aaa=" +aaa);
		
		int	age	=20;
		boolean	isAdult	=	(age	<18 || age >30);// ==,!=
		System.out.println(!isAdult);
		
		System.out.println(12 & 6);//bit &
		System.out.println( 2 << 2);// << * 2 n
		
		//age--;//age++;
		System.out.println("age="+  age++  );
		System.out.println(age);
		
		System.out.println("age="+  ++age  );
		System.out.println(age);
		
		System.out.println("age="+   age++  +  ","+--age);//不建議這樣寫因為不易閱讀
		System.out.println(age);
		
		age	+=10;//age=age+10
		System.out.println(age);
		
		System.out.println( age >18 ? "成年" : "未成年" );
		
		int sales= 2000;
		int salary= 100;
		salary =sales >1000 ? salary +10:salary -10;
		System.out.println("salary="+salary);
		
		
		float qw=4.0f;
		qw=(float)(qw+1.0);//不會跑錯,因為上面把qw設為float所以下一行也會自動設float
		System.out.println(qw);
		
		
		
		
	}

}
