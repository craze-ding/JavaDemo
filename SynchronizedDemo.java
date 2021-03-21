class Ticket implements Runnable //extends Thread
{
	private static int num=200;
	boolean flag=true;
	//Object obj=new Object();测试锁是否唯一
	public void sale(){
		//System.out.println("this:"+this.getClass());打印class文件对象哈希值
		while(true){
			synchronized(/* obj *//* this */Ticket.class){//同步代码块
				if(num >0){
				try{
					Thread.sleep(10);	
				}
				catch(InterruptedException in ){					
				}				
				System.out.println(Thread.currentThread().getName()+"....."+"代码块"+"...."+num--);
			    }
			}			
		}
	}
	public void run(){//验证同步函数锁的对象?是this.		
		if(flag){
			sale();
		}
		else{
			//show1();
			show2();
		}
	}
	public synchronized void show1(){//同步函数		
		while(true){
			if(num >0){
				try{
					Thread.sleep(10);	
				}
				catch(InterruptedException in ){					
				}				
				System.out.println(Thread.currentThread().getName()+"....."+"funtion"+"...."+num--);
				}
		}
	}
	public static synchronized void show2(){//静态同步函数的锁是所属字节码文件对象
		while(true){
			if(num >0){
				try{
					Thread.sleep(10);	
				}
				catch(InterruptedException in ){					
				}				
				System.out.println(Thread.currentThread().getName()+"....."+num--);
				}
		}		
	}
	
}
class SynchronizedDmo{
	public static void main(String[] args) {		
		Ticket T=new Ticket();//创建线程任务对象
		//System.out.println("T:"+T);
		/* Class clazz=T.getClass();
		Class clacc=Teacher.class; *///获取类的class字节码文件
		Thread t1=new Thread(T);
		Thread t2=new Thread(T);		
		/* Ticket t2=new Ticket();
		Ticket t3=new Ticket(); */
		t1.start();		
		try{Thread.sleep(5);}catch(InterruptedException in){}	
		T.flag=false;
		t2.start();		
	}
}
