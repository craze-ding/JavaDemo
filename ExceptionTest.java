/*
丁老师用电脑讲课
分析:
	对象1:老师类
			对象成员变量:姓名
			对象成员方法:讲课,用电脑
	对象2:电脑类


 */
class LangPiangException extends Exception{
	LangPiangException(){
		super();
	}
	LangPiangException(String str){
		super(str);
	}
}
class MaoYangException extends Exception{
	MaoYangException(){
		super();
	}
	MaoYangException(String str){
		super(str);
	}
}
class RengYuanException extends Exception{
	RengYuanException(){
		super();
	}
	RengYuanException(String str){
		super(str);
}
}
class NoWorkerException extends Exception{
	NoWorkerException(){
		super();
	}
	NoWorkerException(String str){
		super(str);
}
}
class Computer{
	private int start=2;
	Computer(){

	}	
	void Run( ) throws MaoYangException,LangPiangException
	{
		if(start==0){
			System.out.println("电脑正常");
		}
		if(start==1){
			throw new LangPiangException("电脑蓝屏");
		}
		if(start==2){
			throw new MaoYangException("电脑冒烟");
		}

	}
	void Restart(){
		start=0;
		System.out.println("电脑重启");
	}
}
class Teacher{
	private String name;
	private Computer cou;
	Teacher(String name){
		this.name=name;
		cou=new Computer();
	}	
	void PlayCou() throws NoWorkerException
	{
		
		try{
			System.out.println(cou.toString());
			cou.Run();

		}
		catch(LangPiangException L){
			cou.Restart();
			PlayCou();
		}
		catch(MaoYangException m){
			Test();
			throw new NoWorkerException("丁老师不能工作");
		}
	}
	void Test(){
		System.out.println("做练习");
	}
}

class ExceptionTest{
	public static void main(String[] args) 
	{
		Teacher t=new Teacher("丁老师");
		try{
			t.PlayCou();
		}
		catch(NoWorkerException m)
		{
			System.out.println(".......");			
			System.out.println("换人");
		}
		
		
	}
}
