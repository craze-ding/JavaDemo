class Porsion extends Object{
	private int age=10;
	Porsion(){
		//this.age=age;
	}
	public boolean equals(Object obj){
		if(!(obj instanceof Porsion)){
			throw new ClassCastException("类型错误");
		}
		Porsion p=(Porsion)obj;
		return this.age==p.age;
	}
	public String toString(){
	 	return "craze";
	}
}
class DemoC{
	private int x;
	DemoC(int x){
		this.x=x;
	}
}

class ObjectDemo{
	public static void main(String[] args) {
		Porsion p1=new Porsion();
		Porsion p2=new Porsion();
		DemoC d=new DemoC(2);
		System.out.println(p1==p2);
		System.out.println(p1.equals(d));

		/*System.out.println(Integer.toHexString(p1.hashCode()));
		System.out.println(p1.getClass()==p2.getClass());
		System.out.println(p1.toString());*/

	}
}