interface Integer{
	void show1();
	void show2();
}
class OuterA{
	void method(){
		Object in=new Integer(){
			public void show1(){
				System.out.println("this is show1");
			}
			public void show2(){
				System.out.println("this is show2");
			}
			public void show3(){
				System.out.println("this is show3");
			}
		};
		/* in.show1();//因为匿名内部类这个子类对象被向上转型为object,这样就不能使用子类的特有功能	
		in.show2(); */
		//in.show3();
	}
}
class InterClassDetail{
	public static void main(String[] args) {
		new OuterA().method();
	}
}