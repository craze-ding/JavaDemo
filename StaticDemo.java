class Porsion{
	int age;
    static String country="CN";
	/*static{//静态代码块(可以给类初始化)
		System.out.println("test static");
	}*/
	{//构造代码块（给所有对象初始化）
		System.out.println("gougou");
	}
	Porsion(){
		age=22;
	}
    static void show(){//静态函数因为需要访问静态成员变量
		System.out.println("----"+country);
	}
}
class StaticDemo{
	public static void main(String[] argments) {
		/*System.out.println(args);	//[Ljava.lang.String;@123772c4
		System.out.println(args.length);	//0
		System.out.println(args[0]);//Arra*///yIndexOutOfBoundsException
		/*Porsion por=new Porsion();
		System.out.println(por.country);
		System.out.println(Porsion.country);
		Porsion.show();*/
		/*Porsion por1=new Porsion();
		por1.show();
		Porsion por2=new Porsion();		
		por2.show();*/
		Porsion.show();
	}
}