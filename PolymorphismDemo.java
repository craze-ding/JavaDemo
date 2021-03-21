abstract class Animal{
	int num=3;
	abstract void eat();
	void show(){//成员函数
		System.out.println("Animal is show");
	}
	static void my(){//静态函数
		System.out.println("Animal is my");
	} 
}
class Cat extends Animal{
	int num=4;
	void eat(){
		System.out.println("eat fish");
	}
	void play(){
		System.out.println("paly mouse");
	}
	void show(){
		System.out.println("Cat is show");
	}
	static void my(){
		System.out.println("Cat is my");
	} 
	
}
class Dog extends Animal{
	int num=5;
	void eat(){
		System.out.println("eat bone");
	}
	void home(){
		System.out.println("look home");
	}
}
class PolymorphismDemo{
	public static void main(String[] args) {
		Cat c1=new Cat();//这就是:向下转型
		Animal c2 = new Cat();
		c2.my();
		/*System.out.println(c1.num);		
		System.out.println(c2.num);*/
		/*一个对象对应着不同类型
		自动类型转换,子类对象提升为父类对象,但是子类特有功能无法使用.作用就是限制其对特有功能的访问
		专业术语:向上转型		
		注意:自始至终都是子类对象在进行类型转换*/
		// c2.home();
		/*method(c1);
		method(c2);*/
		 
	}
	public static void method(Animal a){
		a.eat();
		if(a instanceof Cat){//用于判断类型,只能用于引用数据类型.通常用于向下转型
			Cat d=(Cat)a;
			d.play();
		}
		else{
			Dog d=(Dog)a;
			d.home();
		}
	}

}