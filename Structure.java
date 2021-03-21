/*/*public class demo{  //类变量作为函数参数传递
	int date=3;
	String color;
	public static void main(String[] args) {
		demo arr=new demo();
		arr.date=9;
		arr.color="redf";
		show(new demo());
		//arr.run();
		System.out.println(arr.date+"...."+arr.color);			
		}
	 public static void show(demo d){
		d.date=5;
		d.color="ling";		
	}	*/
/*class Car{  	//类型变量作为普通变量传递
		int date;
		String color;
		void run(){
			System.out.println(date+"----"+color);
		}
}*/
class Persion{
	private String name;
	private int age;
	Persion(){	//默认初始化构造函数
		name="babay";
		age=10;
		//return;  //可以有return结束函数
	}
	/*Persion(String STR,int a){	//带参数初始化构造函数
		name=STR;
		age=a;
		//Speak();//构造函数调用一般函数
	}*/
	Persion(String name,int a){	//当局部变量与成员变量同名用thisd；谁调用this,this就引用哪个对象     
		// this();
		this.name=name;
		age=a;
		//Speak();//构造函数调用一般函数
	}
	public void Getname(String str){
		name=str;
	}
	public void Getage(int x){
		age=x;
	}
	public void Speak(){//一般函数
		System.out.println(name+"----"+age);
	}
   public boolean comper(Persion p){
   	return this.age==p.age;
   }

}
class Structure{
	public static void main(String[] args) {
		/*Persion per1=new Persion();
		// per.Getname("Craze");
		// per.Getage(23);
		per1.Speak();*/
		Persion per1=new Persion("Craze",22);
		Persion per2=new Persion("ding",20);
		System.out.println(per1.comper(per2));
		//per2.Getname("ding");		
		//per2.Speak();
	}
}
