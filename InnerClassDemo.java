class Outer{
	private static int num=22;
	/*static class Inter{
		void show(){
			System.out.println("Show run---"+num);
		}
		static void function(){//如果内部类定义了静态成员,则该内部类也必须是静态的
			System.out.println("function run--"+num);
		}
	}*/
	class Inter{
		void show(){
			System.out.println("Show run---"+num);
		}
		void function(){//如果内部类定义了静态成员,则该内部类也必须是静态的
			System.out.println("function run--"+num);
		}
	}	
	public void motech(){
		Inter i=new Inter();
		i.show(); 
	}	
}

class InnerClassDemo{
	public static void main(String[] args) {
		/*Outer o=new Outer();
		o.motech();	*/
		//直接访问内部类的成员
		Outer.Inter in=new Outer().new Inter();
		in.show();
		/*Outer.Inter in=new Outer.Inter();如果内部类是静态的,相当于一个外部类
		in.show();*/
		/*Outer.Inter.function();如果内部类是静态,并且成员也是静态的	*/
	}
}