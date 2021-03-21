class Demo extends Thread{
	private String name;
	Demo(String name){
		super(name);
		//this.name=name;
	}
	public void run(){//自定义线程定义在run()方法中;复写Thtead类的run()方法;
		show();
	}
	void show(){
		System.out.println(4/0);
		for(int x=0;x<10;x++){
			for(int y=-999999;y<999999;y++){
				System.out.println(name+"----="+x+"-----"+ Thread.currentThread().getName());
			}			
		}
	}	
}
class ThreadDemo{
	public static void main(String[] args) {//主线程定义在main()方法中
		Demo d1=new Demo("张三");
		Demo d2=new Demo("wangcai");
		d1.start();//开启自定义线程让jvm调用run()方法.
		System.out.println(4/0);
		d2.start();		
		for(int x=0;x<10;x++){
			System.out.println(x+"-----"+ Thread.currentThread().getName());
			}
		}
		
}