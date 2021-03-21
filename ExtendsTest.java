class LaoWang{
	int num =3;//参考引用型变量所属类中是否有调用的成员变量;成员函数(非静态函数),静态函数思路一致;
	public LaoWang(){
		write();
		read();
	}
	public  void read(){//编译时进行了动态绑定
		System.out.println("老王在读<<基督山伯爵>>");
	}
	private  void  write(){//编译时进行了静态绑定
		System.out.println("老王在写<<哈姆雷特>>");
	}
	static void look(){//编译时进行了静态绑定
		System.out.println("老王在look话剧");
	}
}
class XiaoWang extends LaoWang{
	int num=4;
	public void read(){
		System.out.println("小王在读<<威尼斯商人>>");
	}
	private  void write(){
		System.out.println("小王在写<<茶花女>>");
	}
	static void  look(){
		System.out.println("小王look<<开国大典>>");
	}
}
public class ExtendsTest{
	public static void main(String[] args) {
		LaoWang L=new XiaoWang();//编译时编译器查看父类对象有没有write()方法,如果没有编译失败,有就通过;jvm运行时知道l对象引用的是子类对象;所以调用子类的方法;
		//L.read();
		//System.out.println(L.num);//覆盖只发生在函数	
	}
}