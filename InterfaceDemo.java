interface Usb{//规则
	public static final int NUM=4;
	public abstract void Open();
	public abstract void Close(); 
}
//类与类是继承,类与接口是实现.
class Upan implements Usb{//实现规则
	public void Open(){
		System.out.println("Upan is open");
	}
	public void Close(){
		System.out.println("Upan is close");
	}

} 

class UMouse implements Usb{//实现规则
	public void Open(){
		System.out.println("UMouse is open");
	}
	public void Close(){
		System.out.println("UMouse is close");
	}

} 
class InterfaceDemo{
	public static void main(String[] args) {
		/*IntDemo I=new IntDemo();
		System.out.println(I.NUM);
		System.out.println(IntDemo.NUM);
		System.out.println(Demo.NUM);*/
		useUsb(new Upan());//接口类型引用,用于指向接口的子类对象
		useUsb(new UMouse());
	}
	 public static void useUsb(Usb u){//使用规则
	 	u.Open();
	 	u.Close();
	 }

}