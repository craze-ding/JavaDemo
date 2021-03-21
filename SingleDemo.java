class Single1{//饿汉式
	private int num;
	private static Single1 s=new Single1();//自己创建一个唯一的类,类一加载，对象就已经存在
	private Single1(){//私有初始化函数

	}
	 public static Single1 GetInstance(){//私有化类成员实现可控，并且返回类对象给调用者
	 	return s;
	 }
	 public void setNum(int num){//也是通过私有化成员变量，控制返回值 
	 	this.num=num;//局部变量与成员变量同名，注意用this说明
	 }
	 public int getNum(){
	 	return num;//
	 }
		
}
class Single2{//懒汉式存在线程安全问题(面试时考!!!)
	private static Single2 s=null;//类加载，没有对象。只有调用了GetInstance()才有对象.所以叫延迟加载形式
	private int num;
	private Single2(){

	}
	public static Single2 GetInstance(){
		if(s==null){//解决效率
			//-->1
			synchronized(Single2.class){//同步代码块,解决安全
				if(s==null)
				//-->0 -->1
				s=new Single2();
			}	
		}			
		return s;
	}
	public void setNum(int num){//也是通过私有化成员变量，控制返回值 
		this.num=num;//局部变量与成员变量同名，注意用this说明
	}
	public int getNum(){
		return num;//
	}

}
class SingleDemo{
	public static void main(String[] args) {
		/*Single ss1=Single.GetInstance();
		Single ss2=Single.GetInstance();
		System.out.println(ss1==ss2);*/
		Single1 s1=Single1.GetInstance();//类名引用对象(static)
		Single2 s2=Single2.GetInstance();
		s1.setNum(10);
		s2.setNum(22);
		System.out.println(s1.getNum());
		System.out.println(s2.getNum());


	}
}

