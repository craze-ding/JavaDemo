class Person{
	String name;
	int age;
}
class Student extends Person{
	/*String name;
	int age;*/
	void study(){
		System.out.println(name+"----"+age);
	}
}

class Worker extends Person{
	/*String name;
	int age;*/
	void work(){
		System.out.println(name+"---"+age);
	}
}
class ExtendsDemo{
	public static void main(String[] args) {
		Student s=new Student();
		s.name="craze";
		s.age=22;
		s.study();
	}
}