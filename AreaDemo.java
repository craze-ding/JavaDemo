class Bunengweifu extends Exception{
	Bunengweifu(String str){
		super(str);
	}
}
interface Area{
	public double GetArea();
}
class Rectangle implements Area{
	private double length;
	private double wide;
	Rectangle(double length,double wide) throws Bunengweifu
	{
		if(length<=0 || wide <=0)
			throw new Bunengweifu("长宽不能为负");
		this.length=length;
		this.wide=wide;
	}
	public double GetArea(){
		return length*wide;
	} 
}
class AreaDemo{
	public static void main(String[] args) {
		try{
			Rectangle r=new Rectangle(-3,-5);
			double val=r.GetArea();
			System.out.println("area="+val);
		}
		catch(Bunengweifu b){
			System.out.println("请重新输入数据");
		}		
		
	}
}