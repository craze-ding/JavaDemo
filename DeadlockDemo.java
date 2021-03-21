class Ticket1 implements Runnable //extends Thread
{
	private static int num=500;
	boolean flag=true;
	Object obj=new Object();//测试锁是否唯一	
	public void run(){//验证同步函数锁的对象?是this.		
		if(flag){
			while(true){
                synchronized(obj){//同步代码块
                    show();
                }			
            }
		}
		else{
            while(true)
			    this.show();			
		}
	}
	public synchronized void show(){//同步函数		
		
			synchronized( obj){//同步代码块
				if(num >0){
				try{
					Thread.sleep(5);	
				}
				catch(InterruptedException in ){					
				}				
				System.out.println(Thread.currentThread().getName()+"....."+"代码块"+"...."+num--);
			    }
			}	
		
	}	
	
}
class DeadlockDemo{
	public static void main(String[] args) {		
		Ticket1 T=new Ticket1();//创建线程任务对象		
		Thread t1=new Thread(T);
		Thread t2=new Thread(T);		
		t1.start();		
		try{Thread.sleep(14);}catch(InterruptedException in){}	
		T.flag=false;
		t2.start();		
	}
}

