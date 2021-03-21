class Fu{
	int num=7;
	{
		System.out.println("Fu cotjishu---"+num);
	}
	Fu(){
		super();//1.初始化object
		//2.显式初始化
		//3.构造函数代码块
		show();//4.子类中有show方法,覆盖
	}
	void show(){
		System.out.println("haha");
	}
}
class Zi extends Fu{
	int num=8;
	{
		System.out.println("Zi cotjishu---"+num);
	}
	Zi(){
		super();
		//同上
		show();
	}
	void show(){
		System.out.println("this is Zi---"+num);//4.
	}
}
class 对象初始化{
	public static void main(String[] args) {
		new Zi();
	}
}