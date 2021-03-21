abstract class Employee{
	 private  String name;
	 private String id;
	 private  double pay;
	 Employee(String name,String id,double pay){
	 	this.name=name;
	 	this.id=id;
	 	this.pay=pay;
	 }
	 public abstract void work();
}

class Programer extends Employee{
	Programer(String name,String id,double pay){
		super(name,id,pay);
	}
	public void work(){
		System.out.println("we is Programer!");
	}
}

class Manger extends Employee{
	private double bonue;
	Manger(String name,String id,double pay,double bonue){
		super(name,id,pay);
		this.bonue=bonue;
	}
	public void work(){
		System.out.println("we is Manger!");
	}

}
class AbstractDemo{
	public static void main(String[] args) {
		Programer pro=new Programer("ding_craze","20190305165",7533.23);
		pro.work(); 
	}
}