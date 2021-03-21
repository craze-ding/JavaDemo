class Person{
	/*String name="craze-ding";
	int age;*/
	Person(){
		super();//Persion的父类就是object(java中的上帝)
		//System.out.println("fulei moren!");
		this.show();
	}
	Person(int x){
		System.out.println("Person is fu!");
	}
	void show(){
		System.out.println("we is same!");
	}
}
/*class Student extends Person{
	// String name="craze";
	// int age;
	void work(){//子类升级的方法覆盖父类的同名方法
		System.out.println("Student is study!");//子类拿到super父类的引用
		super.work();//但是有时也要用到父类
	}
}*/

class Student extends Person{
	int num=8;
	Student(){
		super();
		return;
	}
	void show(){
		System.out.println("Student is study!"+num);
		
}
}


/*class Worker extends Person{
	/*String name;
	int age;
	Worker(int x){
		//super(3);
		this();
	}
	Worker(){
		//super(3);//子类初始化会默认调用父类构造函数
		System.out.println("Worker is zi!");
	}
}*/

class ExtendsDemo{
	public static void main(String[] args) {
		Student s=new Student();
		s.show();
		//new Worker(3);
		/*w.name="craze-ding";
		w.age=22;*/
		// s.work();
	}
}