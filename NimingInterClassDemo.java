interface  Demo{
	void show1();
	void show2();
}

class Outer{
	// int num=4;
	/*class Inter extends Demo{
		void show(){
			System.out.println("show---"+num);
		}
		void haha(){

		}
	}*/
	/*class Inter implements Demo{
		public void show1(){

		}
		public void show2(){

		}
	}
	public void method(){
		Inter in=new Inter();
		in.show1();
		in.show2();
	}*/
	/*public void method(){
		new Demo(){//匿名内部类
			void show(){
				System.out.println("show---"+num);
			}
			void haha(){

			}
		}.show();

	}*/
	public void method(){
		Demo out=new Demo(){
			public void show1(){
				System.out.println("show1 is--");
			}
			public void show2(){
				System.out.println("shpw2 is --");
			}
		};
		out.show1();
		out.show2();
	}
}

class NimingInterClassDemo{
	public static void main(String[] args) {
		/*Outer out=new Outer();
		out.method();*/
		my(new Demo(){//匿名内部类最好不要超过3个
			public void show1(){
 				System.out.println("show1 is ----");
 			}
 			public void show2(){
 				System.out.println("show2 is ----");
 			}
		}
		);
	}

	public static void my(Demo d){
		d.show1();
		d.show2();
	}
}
 /*class test implements Demo{
 	public void show1(){
 		System.out.println("show1 is ----");
 	}
 	public void show2(){
 		System.out.println("show2 is ----");
 	}
 }*/